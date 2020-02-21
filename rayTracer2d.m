%
% File rayTracing2d.m
%
% Author: Aileen Quintana.
% Date: 15/04/2013
%
% Brief: 2d ray tracer function.
%
% Computes lengths of ray-voxel intersections in a plane by tracing a
% ray from (x0,y0) to (xf,yf) through a grid of NxN voxels. The
% origin of the used coordinates system is in the center of the grid.
%
% Param: x0 The source x-coordinate.
% Param: y0 The source y-coordinate.
% Param: xf The detector x-coordinate.
% Param: yf The detector y-coordinate.
% Param: N The number of voxels.
%
% Return: rays The sparse matrix containing weighting factors for the attenuation matrix
% used to compute a radon transform of the attenuation function.
%
function rays = rayTracer2d(x0, y0, xf, yf, N)
tol = 1e-8;
% Eaise error if source or detector are inside of the grid
checkInsideError = true;
% Initialization
rays = sparse(N, N);
gridX = (-N/2:1:N/2)';
gridY = (-N/2:1:N/2)';
% Check if the source and detector are outside of the grid.
if checkInsideError
if abs(x0) < N/2 && abs(y0) < N/2
error(['Source inside the grid: (' num2str(x0) ', ' num2str(y0) ')']);
end;
if abs(xf) < N/2 && abs(yf) < N/2
error(['Detector inside the grid: )' num2str(xf) ', ' num2str(yf) ')']);
end;
end;
Lx = (gridX(end) - gridX(1));
x0d = xf - x0;
y0d = yf - y0;
% Reverse ray, such that it always forms an angle in [0,pi] with
% the horizontal axis
if y0d < 0
y0d = -y0d;
x0d = -x0d;
end
cos_ang_ray_h = Lx*x0d/(sqrt(x0d^2 + y0d^2) * abs(Lx));
%Take care of the case of horizontal or vertical lines
if abs(cos_ang_ray_h) < tol % ang_ray_h ~ pi/2 -> vertical line
cross = [x0 * ones(N + 1, 1), gridY];
%remove all crossings outside of the grid
if x0 < gridX(1) || x0 > gridX(end)
cross = [];
else
nr = length(find(x0 >= gridX));
if nr == N + 1
nr = N;
end;
line_ind = [nr * ones(N + 1, 1), (1:N + 1)'];
end;
elseif abs(cos_ang_ray_h) > 1 - tol % ang_ray_h ~ 0 or pi -> horizontal line
cross = [gridX, y0 * ones(N + 1, 1)];
%remove all crossings outside of the grid
if y0 < gridY(1) || y0 > gridY(end)
cross = [];
else
nr = length(find(y0 >= gridY));
if nr == N+1
nr = N;
end;
line_ind = [(1:N+1)', nr * ones(N + 1, 1)];
end;
else %for all other lines
ang_ray_h = acos(cos_ang_ray_h);
tan_ang_ray_h = tan(ang_ray_h);
%Compute the vectors of crossing points with horizontal lines
cross_h = [(gridY - y0 + tan_ang_ray_h * x0)./tan_ang_ray_h, gridY];
%Compute the vectors of crossing points with vertical lines
cross_v = [gridX, tan_ang_ray_h.*gridX + (y0 - tan_ang_ray_h * x0)];
%Order the crossing points in the order of the ray (growing y coordinate)
if tan_ang_ray_h < 0
%flipud cross_v that the ordering is the same as for the cross_h
cross_v = flipud(cross_v);
end;
%merge the crossing points in order of growing y coordinate
line_h = 1;
line_v = 1;
j = 1;
cross = zeros((N + 1 + N + 1),2);
line_ind = zeros((N + 1 + N + 1),2);
doubles = 0;
while j <= (N + 1 + N + 1) && line_h <= length(cross_h) && line_v <= length(cross_v)
if abs(cross_h(line_h, 2) - cross_v(line_v, 2)) < 10 * eps
%Crosses the vertical and horizontal axis in the same points
cross(j,:) = cross_h(line_h,:);
line_ind(j,:) = [line_v,line_h];
line_h = line_h + 1;
line_v = line_v + 1;
doubles = doubles + 1;
elseif cross_h(line_h, 2) < cross_v(line_v, 2)
cross(j, :) = cross_h(line_h, :);
line_ind(j, :) = [line_v - 1, line_h];
line_h = line_h + 1;
else
cross(j, :) = cross_v(line_v, :);
line_ind(j, :) = [line_v, line_h - 1];
line_v = line_v + 1;
end;
j = j + 1;
end;
if j + doubles <= (N + 1 + N + 1) && line_h > length(cross_h)
cross(j:end-doubles,:) = cross_v(line_v:end,:);
line_ind(j:end-doubles,:) = [(line_v:size(cross_v,1))', (line_h-1)*ones(size(cross_v,1)-line_v+1,1)];
elseif j + doubles <= (N + 1 + N + 1) && line_v > length(cross_v)
cross(j:end-doubles,:) = cross_h(line_h:end,:);
line_ind(j:end-doubles,:) = [(line_h:size(cross_h,1))', (line_v-1)*ones(size(cross_h,1)-line_h+1,1)];
end;
%Crop cross and line_ind
if doubles > 0
cross = cross(1:((N + 1 + N + 1) - doubles), :);
line_ind = line_ind(1:((N + 1 + N + 1) - doubles), :);
end;
%Discard crossing outside of the grid
outsiders_x = find(cross(:, 1) < gridX(1) -10 * eps | cross(:, 1) > gridX(end) + 10 * eps);
outsiders_y = find(cross(:, 2) < gridY(1) -10 * eps | cross(:, 2) > gridY(end) + 10 * eps);
outsiders = sort(union(outsiders_x, outsiders_y));
insiders = setdiff(1:length(cross), outsiders);
cross = cross(insiders, :);
line_ind = line_ind(insiders, :);
if tan_ang_ray_h < 0
%adjust the numbers of vertical lines which were numbered in the discending direction
line_ind(:, 1) = N + 1 - line_ind(:, 1);
end;
end;
if ~isempty(cross)
%Compute distances and voxel coordinates (verctorized)
vs = (cross(2:end, :) - cross(1:end - 1, :));
v_lens = sqrt(vs(:, 1).^2 + vs(:,2).^2);
%Assign rays lengths and return a sparse matrix
for j = 1:size(line_ind, 1) - 1
rays(line_ind(j, 2), line_ind(j, 1)) = v_lens(j);
end;
end;
% File Kaczmarz.m
%
% Author: Aileen Quintana.
% Date: 15/04/2013
%
% Reference: F. Natterer and F. Wbbeling, Mathematical Methods
% in Image Reconstruction, SIAM, Philadelphia, 2001.
%
% Brief: Kaczmarz method function.
%
% Param: A m,n coefficients matrix of the linear system.
% Param: b The n-vector coefficients.
% Param: iterations The number of iterations.
%
% Return: Fx The result.
% Return: rho The iteration norm convergence.
%
function [Fx, rho] = kaczmarz(A, b, iterations)
if (iterations < 1)
error('Number of iterations must be positive.');
end;
Fx = zeros(size(A, 2), 1);
rho = zeros(iterations,1);
N = sqrt(length(Fx));
% Relaxation parameter
omega = 0.25;
for k = 1:iterations
for j = 1:size(A,1)
aj = A(j,:);
Fx = Fx + omega./(aj*aj')*(b(j)-aj*Fx)*aj';
end;
rho(k) = norm(A*Fx - b);
disp([k rho(k)]);
end;
Fx = reshape(Fx, N, N);
%imagesc(Fx);
%colorbar;
end
%
% File SensitivityMatrix.m
%
% Brief: Creates a ultrasound sensitivity matrix.
%
% Param: N The image width and height (NxN image).
% Param: theta0 The starting angle.
% Param: theta1 The last angle.
% Param: delta The angel delta step.
% Param: q The number of source detectors in the detectors array.
%
% Return: Sn The forward matrix result.
% Return: A The non-zero result matrix.
% Return: ind The non-zeros sinogram indices.

function [Sn, A, ind] = createSensitivityMatrix(N, theta0, theta1, delta, q)
thetas = (theta0:delta:theta1) / 180 * pi;
NS = length(thetas);
R = N / 2;
h = N / (q - 1);
source = ( N * ones(1, q, 1) + 1i * (-R : h : R));
detector = (-N * ones(1, q, 1) + 1i * (-R : h : R));
sources = zeros(1 : thetas);
detectors = zeros(1 : thetas);
j = 1;
for theta = thetas
sources(j,:) = source * exp(1i * theta);
detectors(j,:) = detector * exp(1i * theta);
j = j + 1;
end;
% Initialization
Sn = sparse(NS * q, N * N);
% Compute the sinogram looping through all the sources and detectors pairs.
for j = 1:NS
for k = 1:q
y_s = real(sources(j, k));
x_s = imag(sources(j, k));
y_d = real(detectors(j, k));
x_d = imag(detectors(j, k));
ray = rayTracer2d(x_s, y_s, x_d, y_d, N);
Sn((j - 1)*q+k,:) = ray(:);
end;
end;
% Create equation system coefficients.
ind = find(sum(Sn,2));
A = Sn(ind, :);
end
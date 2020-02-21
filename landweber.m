%
% File Landweber.m
%
% Author: Aileen Quintana.
% Date: 15/04/2013
%
% Reference: F. Natterer and F. Wbbeling, Mathematical Methods
% in Image Reconstruction, SIAM, Philadelphia, 2001.
%
% Brief: Landweber method function.
%
% Param: A m,n coefficients matrix of the linear system.
% Param: b The n-vector coefficients.
% Param: iterations The number of iterations.
%
% Return: Fx The result.
% Return: rho The iteration norm convergence.
%
function [Fx, rho] = landweber(A, b, iterations)
Fx = zeros(size(A, 2), 1);
rho = zeros(iterations, 1);
N = sqrt(length(Fx));
% Relaxation parameter
omega = 1 / normest(A)^2;
for j = 1:iterations
Fx = Fx + omega*(A' * (b - A * Fx));
rho(j) = norm(A*Fx - b);
disp([j rho(j)])
end;
Fx = reshape(Fx, N, N);
%imagesc(Fx);
%colorbar;
end
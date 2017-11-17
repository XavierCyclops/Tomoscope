function y=pulsocuadn(f,fs,N)

% f  : frecuencia 
% fs : frecuencia de meustreo
% N  : numero de muestras
% NT : numero de ciclos 
 %f   = 0.5e6;
 %fs  = 50e6;
 %N   = 2000;

k = 0;
for i = 1:N
  x  = i*(2*f);  
  if (x <= fs)
     k = k + 1;
  end      
end
 t = 1:k-1;
 Pl(t) = -1;
 y = [Pl zeros(1,10)];
end
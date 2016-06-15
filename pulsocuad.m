function y = pulsocuad(f,fs,N)

% f  : frecuencia 
% fs : frecuencia de meustreo
% N  : numero de muestras

 
k = 0;
for i = 1:N
  x  = i*(2*f);  
  if (x <= fs)
     k = k + 1;
  end      
end
 t = 1:k-1;
 Pl(t) = 1;
 y = [Pl zeros(1,10)];

end
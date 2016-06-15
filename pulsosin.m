function y = pulsosin(f,fs,N)
% pulso sinusoidal con envolvente gaussiana
% f  : frecuencia 
% fs : frecuencia de meustreo
% N  : numero de muestras
% NT : numero de ciclos 

 %f   = 0.5e6;
 %fs  = 50e6;
 %N   = 2000; %200000
NT  = 3;
Ts  = 1/fs;
w0  = 2*pi*f;
t   = 0:Ts:(N-1)*Ts; 
T   = inv(f*Ts);

even = mod((fix(NT*T)),2);
if even == 1
   W   = fftshift(gausswin(fix(NT*T),3.5))';
else
   W   = fftshift(gausswin(fix(NT*T)+1,3.5))'; 
end

xs  = (cos(w0.*t(1:length(W))));
x   = (fftshift(xs.*W));

ye  = x./(max(x));
Nye = length(ye);
y   = ye;
end
    
  
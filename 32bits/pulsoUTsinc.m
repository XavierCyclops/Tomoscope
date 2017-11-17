%Descripcion: Se genera un Sinc a F = 500KHz, para excitacion
%del transductor ultrasonico.
function y = pulsoUTsinc(f,fs,N)

w0 = 2*pi*f/fs;
n = 0:1:round(N);
x = zeros(1,length(n));

%%%---------------
for k = 1:length(n) 
   if (n(k) == 0)   
     x(k) = 1;
   else
     x(k) = sin(w0*n(k))/(w0*n(k));
   end
end
x2 = fliplr(x);
y = [x2 x];

end
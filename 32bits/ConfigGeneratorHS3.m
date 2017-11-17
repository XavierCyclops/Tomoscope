function ye = ConfigGeneratorHS3(sDll,Amplitude,Fsig,Fm,Opcion)
Signal=5; % <- Esto es muy tonto
%Modo lineal = 2 y Modo DDS = 1
if Signal == 5 % <- Esto es muy tonto x2
   Result = calllib(sDll,'SetFuncGenMode',2);
   disp(Result);
else
   Result = calllib(sDll,'SetFuncGenMode',1); 
   disp(Result);
end

Result = calllib( sDll, 'SetFuncGenSignalType',Signal);
disp(Result);
Result = calllib( sDll, 'SetFuncGenAmplitude',Amplitude);
disp(Result);
Result = calllib( sDll, 'SetFuncGenTrigSource',9);
disp(Result);
% calllib( sDll, 'SetFuncGenOutputOn',0); % No tiene sentido tenerlo aquí

Nven = 3000; %Numero de muestras a formar para la señal a enviar
if Signal == 5 % <- Esto es muy tonto x3
   FpG    = double(Fm);
 if (Opcion == 1) 
     ye     = pulsoUTsin(Fsig,FpG,Nven);  %Señal Pulso Gaussiano
 end 
 if (Opcion == 2 )
     ye     = pulsoUTcuad(Fsig,FpG,Nven); %Señal Pulso Cuadrado
 end 
  if (Opcion == 3 )
     ye     = pulsoUTcuadn(Fsig,FpG,Nven); %Señal Pulso Exponencial
  end 
  
 if (Opcion == 4)
     ye     = pulsoUTsinc(Fsig,FpG,Nven); %Señal Pulso Sinc
 end 
   y      = [ ye zeros(1,2^15)  zeros(1,2^16-2^15-Nven)];
   Gen   = y;
   Gen   =(2^15)*Gen + 2^15;
   Gen   = uint16(Gen); 
   
   pGenZeros = zeros(1,2^16);  %Es para borrar la memoria
   pGenZeros   = uint16(pGenZeros); 
   
   pGen = libpointer('uint16Ptr',Gen);
   pGenZeros = libpointer('uint16Ptr',pGenZeros);
  % calllib(sDll,'SetFuncGenOutputOn',0); 
   Result = calllib(sDll,'FillFuncGenMemory',2^16,pGenZeros); %Borra la memoria
   disp(Result);
   Result = calllib(sDll,'FillFuncGenMemory',2^16,pGen);      %Graba los datos
   disp(Result);
else
   FpG   = double(Freq); 
   ye    = 0;
end    
FppG   = libpointer('doublePtr',double(FpG));
[Result, dFrequency] = calllib(sDll,'SetFuncGenFrequency',FppG);
disp(Result);
%calllib(sDll, 'SetFuncGenOutputOn',0); 
%calllib(sDll, 'SetFuncGenEnable',1);
end

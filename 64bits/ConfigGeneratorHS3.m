function ye = ConfigGeneratorHS3(sDll,Amplitude,Fsig,Fm,Opcion)
Signal=5;
%Modo lineal = 2 y Modo DDS = 1
if Signal == 5
   calllib(sDll,'SetFuncGenMode',2);
else
   calllib(sDll,'SetFuncGenMode',1); 
end

calllib( sDll, 'SetFuncGenSignalType',Signal);
calllib( sDll, 'SetFuncGenAmplitude',Amplitude);
calllib( sDll, 'SetFuncGenTrigSource',9);
calllib( sDll, 'SetFuncGenOutputOn',0); 

Nven = 3000; %Numero de muestras a formar para la se�al a enviar
if Signal == 5
   FpG    = double(Fm);
 if (Opcion == 1) 
     ye     = pulsoUTsin(Fsig,FpG,Nven);  %Se�al Pulso Gaussiano
 end 
 if (Opcion == 2 )
     ye     = pulsoUTcuad(Fsig,FpG,Nven); %Se�al Pulso Cuadrado
 end 
  if (Opcion == 3 )
     ye     = pulsoUTcuadn(Fsig,FpG,Nven); %Se�al Pulso Exponencial
  end 
  
 if (Opcion == 4)
     ye     = pulsoUTsinc(Fsig,FpG,Nven); %Se�al Pulso Sinc
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
   calllib(sDll,'FillFuncGenMemory',2^16,pGenZeros); %Borra la memoria
   calllib(sDll,'FillFuncGenMemory',2^16,pGen);      %Graba los datos
else
   FpG   = double(Freq); 
   ye    = 0;
end    
FppG   = libpointer('doublePtr',double(FpG));
calllib(sDll,'SetFuncGenFrequency',FppG);
%calllib(sDll, 'SetFuncGenOutputOn',0); 
%calllib(sDll, 'SetFuncGenEnable',1);
end

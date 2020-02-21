function [dat1,dat2] = AdquirirHS(sDLL, Samples)

  data1  = double(1:Samples);  
  data2  = double(1:Samples );
  pData1 = libpointer( 'doublePtr' , data1 );
  pData2 = libpointer( 'doublePtr' , data2 ); 
  
  Estado = calllib(sDLL,'ADC_Start');
  disp(Estado);
    while ~calllib(sDLL,'ADC_Ready')
      pause(0.03); %Esta pausa es necesaria para refrescar el acceso a librerias
    end 
   [Result, dData] = calllib(sDLL,'ADC_GetDataVoltCh',2,pData1);
   disp(Result);
   [Result, dData] = calllib(sDLL,'ADC_GetDataVoltCh',1,pData2);
   disp(Result);
   dat1 = get( pData1 , 'Value' );
   dat2 = get( pData2 , 'Value' );
end
   
   
   
   
   
   
   
function [dat1,dat2] = AdquirirHS(sDLL, Samples)

  data1  = double(1:Samples);  
  data2  = double(1:Samples );
  pData1 = libpointer( 'doublePtr' , data1 );
  pData2 = libpointer( 'doublePtr' , data2 ); 
  
  Estado = calllib(sDLL,'ADC_Start');
    while ~calllib(sDLL,'ADC_Ready')      
      pause(0.03); %Esta pausa es necesaria para refrescar el acceso a librerias
    end 
   calllib(sDLL,'ADC_GetDataVoltCh',1,pData1);
   calllib(sDLL,'ADC_GetDataVoltCh',2,pData2);
   dat1 = get( pData1 , 'Value' );
   dat2 = get( pData2 , 'Value' );

end

   
   
   
   
   
   
   
%Descripcion: Esta funcion solo se encargar de configura al osciloscopio
%del HS3 para que bien adquiera las señales.

function ConfigHS(sDLL,Samples,Fm)

nChannelCount=2;
for i = 1:nChannelCount;
  % Set channel range in Volts:
  [Result dSens] = calllib( sDLL , 'SetSensitivity' , i , 12 );
  disp(Result);
  Result = calllib( sDLL , 'SetCoupling'     ,i , 0);
  disp(Result);
 end
Result = calllib( sDLL , 'SetRecordLength', Samples );
disp(Result);
% Get the actual record length:
% nRecordLength = calllib( sDLL , 'GetRecordLength' );
% Set the post sample count to same number as record length, to record all
% samples after the trigger:
Result = calllib( sDLL , 'SetPostSamples' , Samples/2 );
disp(Result);
% Set the resolution, if other than default resolution is needed:
Result = calllib( sDLL , 'SetResolution' , 12 );
disp(Result);
% Set and get the sample frequency:
[ Result rSampleFrequency ] = calllib( sDLL , 'SetSampleFrequencyF', Fm );
disp(Result);
% Set trigger time out to 100 ms to make sure a measurement is also done when there is no trigger.
% Note: trigger time out does only work with the HS805 and the Multi Channel DLL.
%calllib( sDLL , 'SetTriggerTimeOut' , 36e3 );
% Set channel 1 as trigger source:
Result = calllib(sDLL, 'SetTriggerSource' , 0 );
disp(Result);
Result = calllib(sDLL, 'SetTriggerMode'   ,1);
disp(Result);
Result = calllib(sDLL, 'SetTriggerLevel'  ,1,  -0.1);
disp(Result);
Result = calllib(sDLL, 'SetTriggerHys'    ,1,  0.1);
disp(Result);
%  
end


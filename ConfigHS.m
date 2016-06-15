%Descripcion: Esta funcion solo se encargar de configura al osciloscopio
%del HS3 para que bien adquiera las señales.

function ConfigHS(sDLL,SetOsc)

if strcmp(sDLL,'hs3')
  nChannelCount=2;
end
for i = 1:nChannelCount;
  % Set channel range in Volts:
  calllib( sDLL , 'SetSensitivity' , i , SetOsc.Sensitivity );
  calllib( sDLL , 'SetCoupling'     ,i , 0);
 end
calllib( sDLL , 'SetRecordLength', SetOsc.Samples );
% Get the actual record length:
% nRecordLength = calllib( sDLL , 'GetRecordLength' );
% Set the post sample count to same number as record length, to record all
% samples after the trigger:
Result = calllib( sDLL , 'SetPostSamples' , SetOsc.Samples-SetOsc.PostSamples );
% Set the resolution, if other than default resolution is needed:
Result = calllib( sDLL , 'SetResolution' , SetOsc.Resolution );
% Set and get the sample frequency:
calllib( sDLL , 'SetSampleFrequencyF', SetOsc.Fm );
% Set trigger time out to 100 ms to make sure a measurement is also done when there is no trigger.
% Note: trigger time out does only work with the HS805 and the Multi Channel DLL.
%calllib( sDLL , 'SetTriggerTimeOut' , 36e3 );
% Set channel 1 as trigger source:
calllib(sDLL , 'SetTriggerSource' , SetOsc.TriggerSource );
calllib(sDLL, 'SetTriggerMode'   ,1);
calllib(sDLL, 'SetTriggerLevel'  ,1,  -0.1);
calllib(sDLL, 'SetTriggerHys'    ,1,  0.1);
%  
end


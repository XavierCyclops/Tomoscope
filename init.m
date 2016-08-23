function [methodinfo,structs,enuminfo,ThunkLibName]=init
%INIT Create structures to define interfaces found in 'tiepie'.

%This function was generated by loadlibrary.m parser version  on Tue Jul 26 14:51:46 2016
%perl options:'tiepie.i -outfile=init.m -thunkfile=HS3_thunk_pcwin64.c -header=tiepie.h'
ival={cell(1,0)}; % change 0 to the actual number of functions to preallocate the data.
structs=[];enuminfo=[];fcnNum=1;
fcns=struct('name',ival,'calltype',ival,'LHS',ival,'RHS',ival,'alias',ival,'thunkname', ival);
MfilePath=fileparts(mfilename('fullpath'));
ThunkLibName=fullfile(MfilePath,'HS3_thunk_pcwin64');
% extern  word InitInstrument ( word wAddress ); 
fcns.thunkname{fcnNum}='uint16uint16Thunk';fcns.name{fcnNum}='InitInstrument'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16'};fcnNum=fcnNum+1;
% extern  word ExitInstrument ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='ExitInstrument'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word GetCalibrationDate ( dword * dwDate ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetCalibrationDate'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32Ptr'};fcnNum=fcnNum+1;
% extern  word GetSerialNumber ( dword * dwSerialNumber ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetSerialNumber'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32Ptr'};fcnNum=fcnNum+1;
% extern  word GetAvailableSensitivities ( double * dSensitivities ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetAvailableSensitivities'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr'};fcnNum=fcnNum+1;
% extern  word GetAvailableResolutions ( double * dResolutions ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetAvailableResolutions'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr'};fcnNum=fcnNum+1;
% extern  word GetNrChannels ( word * wValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetNrChannels'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16Ptr'};fcnNum=fcnNum+1;
% extern  double GetMaxSampleFrequencyF ( void ); 
fcns.thunkname{fcnNum}='doublevoidThunk';fcns.name{fcnNum}='GetMaxSampleFrequencyF'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='double'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  dword GetMaxRecordLength ( void ); 
fcns.thunkname{fcnNum}='uint32voidThunk';fcns.name{fcnNum}='GetMaxRecordLength'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint32'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  dword GetDCLevelStatus ( void ); 
fcns.thunkname{fcnNum}='uint32voidThunk';fcns.name{fcnNum}='GetDCLevelStatus'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint32'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word ADC_Start ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='ADC_Start'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word ADC_Running ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='ADC_Running'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word ADC_Abort ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='ADC_Abort'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word ADC_ForceTrig ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='ADC_ForceTrig'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word ADC_Triggered ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='ADC_Triggered'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word ADC_Ready ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='ADC_Ready'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word ADC_GetDataCh ( word wCh , word * wChData ); 
fcns.thunkname{fcnNum}='uint16uint16voidPtrThunk';fcns.name{fcnNum}='ADC_GetDataCh'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16', 'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word ADC_GetDataVoltCh ( word wCh , double * dChData ); 
fcns.thunkname{fcnNum}='uint16uint16voidPtrThunk';fcns.name{fcnNum}='ADC_GetDataVoltCh'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16', 'doublePtr'};fcnNum=fcnNum+1;
% extern  word GetDigitalInputValues ( word * wValues ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetDigitalInputValues'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word GetOneDigitalValue ( dword dwIndex , word * wValue ); 
fcns.thunkname{fcnNum}='uint16uint32voidPtrThunk';fcns.name{fcnNum}='GetOneDigitalValue'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32', 'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word SetDataReadyCallback ( TDataReady pAddress ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='SetDataReadyCallback'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'FcnPtr'};fcnNum=fcnNum+1;
% extern  word SetDataReadyEvent ( HANDLE hEvent ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='SetDataReadyEvent'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'voidPtr'};fcnNum=fcnNum+1;
% extern  word SetTransferMode ( dword dwMode ); 
fcns.thunkname{fcnNum}='uint16uint32Thunk';fcns.name{fcnNum}='SetTransferMode'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32'};fcnNum=fcnNum+1;
% extern  word GetTransferMode ( dword * dwMode ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetTransferMode'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32Ptr'};fcnNum=fcnNum+1;
% extern  word SetResolution ( byte byValue ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetResolution'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  word GetResolution ( byte * byValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetResolution'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetInstrumentConfig ( word wMode ); 
fcns.thunkname{fcnNum}='uint16uint16Thunk';fcns.name{fcnNum}='SetInstrumentConfig'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16'};fcnNum=fcnNum+1;
% extern  word GetInstrumentConfig ( word * wMode ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetInstrumentConfig'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word GetMeasureMode ( byte * byMode ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetMeasureMode'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetMeasureMode ( byte byMode ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetMeasureMode'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  dword GetRecordLength ( void ); 
fcns.thunkname{fcnNum}='uint32voidThunk';fcns.name{fcnNum}='GetRecordLength'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint32'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word SetRecordLength ( dword dwRecordLength ); 
fcns.thunkname{fcnNum}='uint16uint32Thunk';fcns.name{fcnNum}='SetRecordLength'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32'};fcnNum=fcnNum+1;
% extern  dword GetPostSamples ( void ); 
fcns.thunkname{fcnNum}='uint32voidThunk';fcns.name{fcnNum}='GetPostSamples'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint32'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word SetPostSamples ( dword dwPostSampleCount ); 
fcns.thunkname{fcnNum}='uint16uint32Thunk';fcns.name{fcnNum}='SetPostSamples'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32'};fcnNum=fcnNum+1;
% extern  double GetSampleFrequencyF ( void ); 
fcns.thunkname{fcnNum}='doublevoidThunk';fcns.name{fcnNum}='GetSampleFrequencyF'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='double'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word SetSampleFrequencyF ( double * dFreq ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='SetSampleFrequencyF'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr'};fcnNum=fcnNum+1;
% extern  word GetExternalClock ( word * wMode ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetExternalClock'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word SetExternalClock ( word wMode ); 
fcns.thunkname{fcnNum}='uint16uint16Thunk';fcns.name{fcnNum}='SetExternalClock'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16'};fcnNum=fcnNum+1;
% extern  word GetSensitivity ( byte byCh , double * dSensitivity ); 
fcns.thunkname{fcnNum}='uint16uint8voidPtrThunk';fcns.name{fcnNum}='GetSensitivity'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'doublePtr'};fcnNum=fcnNum+1;
% extern  word SetSensitivity ( byte byCh , double * dSensitivity ); 
fcns.thunkname{fcnNum}='uint16uint8voidPtrThunk';fcns.name{fcnNum}='SetSensitivity'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'doublePtr'};fcnNum=fcnNum+1;
% extern  word GetAutoRanging ( byte byCh , byte * byMode ); 
fcns.thunkname{fcnNum}='uint16uint8voidPtrThunk';fcns.name{fcnNum}='GetAutoRanging'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetAutoRanging ( byte byCh , byte byMode ); 
fcns.thunkname{fcnNum}='uint16uint8uint8Thunk';fcns.name{fcnNum}='SetAutoRanging'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'uint8'};fcnNum=fcnNum+1;
% extern  word GetCoupling ( byte byCh , byte * byMode ); 
fcns.thunkname{fcnNum}='uint16uint8voidPtrThunk';fcns.name{fcnNum}='GetCoupling'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetCoupling ( byte byCh , byte byMode ); 
fcns.thunkname{fcnNum}='uint16uint8uint8Thunk';fcns.name{fcnNum}='SetCoupling'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'uint8'};fcnNum=fcnNum+1;
% extern  word GetDcLevel ( byte byCh , double * dDcLevel ); 
fcns.thunkname{fcnNum}='uint16uint8voidPtrThunk';fcns.name{fcnNum}='GetDcLevel'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'doublePtr'};fcnNum=fcnNum+1;
% extern  word SetDcLevel ( byte byCh , double dDcLevel ); 
fcns.thunkname{fcnNum}='uint16uint8doubleThunk';fcns.name{fcnNum}='SetDcLevel'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'double'};fcnNum=fcnNum+1;
% extern  word GetTriggerSource ( byte * byTrigSource ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetTriggerSource'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetTriggerSource ( byte byTrigSource ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetTriggerSource'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  word GetTriggerMode ( byte * byMode ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetTriggerMode'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetTriggerMode ( byte byMode ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetTriggerMode'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  word GetTriggerModeCh ( byte byCh , byte * byMode ); 
fcns.thunkname{fcnNum}='uint16uint8voidPtrThunk';fcns.name{fcnNum}='GetTriggerModeCh'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetTriggerModeCh ( byte byCh , byte byMode ); 
fcns.thunkname{fcnNum}='uint16uint8uint8Thunk';fcns.name{fcnNum}='SetTriggerModeCh'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'uint8'};fcnNum=fcnNum+1;
% extern  word GetTriggerLevel ( byte byCh , double * dLevel ); 
fcns.thunkname{fcnNum}='uint16uint8voidPtrThunk';fcns.name{fcnNum}='GetTriggerLevel'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'doublePtr'};fcnNum=fcnNum+1;
% extern  word SetTriggerLevel ( byte byCh , double dLevel ); 
fcns.thunkname{fcnNum}='uint16uint8doubleThunk';fcns.name{fcnNum}='SetTriggerLevel'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'double'};fcnNum=fcnNum+1;
% extern  word GetTriggerHys ( byte byCh , double * dHysteresis ); 
fcns.thunkname{fcnNum}='uint16uint8voidPtrThunk';fcns.name{fcnNum}='GetTriggerHys'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'doublePtr'};fcnNum=fcnNum+1;
% extern  word SetTriggerHys ( byte byCh , double dHysteresis ); 
fcns.thunkname{fcnNum}='uint16uint8doubleThunk';fcns.name{fcnNum}='SetTriggerHys'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'double'};fcnNum=fcnNum+1;
% extern  word GetPXITriggerEnables ( byte * byEnables ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetPXITriggerEnables'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetPXITriggerEnables ( byte byEnables ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetPXITriggerEnables'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  word GetPXITriggerSlopes ( byte * bySlopes ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetPXITriggerSlopes'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetPXITriggerSlopes ( byte bySlopes ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetPXITriggerSlopes'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  word SetDigitalOutputs ( byte byValue ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetDigitalOutputs'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  word GetDigitalOutputs ( byte * byValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetDigitalOutputs'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word GetSquareWaveGenStatus ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='GetSquareWaveGenStatus'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  dword GetSquareWaveGenFrequency ( void ); 
fcns.thunkname{fcnNum}='uint32voidThunk';fcns.name{fcnNum}='GetSquareWaveGenFrequency'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint32'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word SetSquareWaveGenFrequency ( dword * dwFreq ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='SetSquareWaveGenFrequency'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32Ptr'};fcnNum=fcnNum+1;
% extern  word GetFunctionGenStatus ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='GetFunctionGenStatus'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word GetFuncGenMaxAmplitude ( double * dMaxAmplitude ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenMaxAmplitude'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr'};fcnNum=fcnNum+1;
% extern  word GetFuncGenOutputOn ( word * wValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenOutputOn'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word SetFuncGenOutputOn ( word wValue ); 
fcns.thunkname{fcnNum}='uint16uint16Thunk';fcns.name{fcnNum}='SetFuncGenOutputOn'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16'};fcnNum=fcnNum+1;
% extern  word GetFuncGenEnable ( word * wValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenEnable'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word SetFuncGenEnable ( word wValue ); 
fcns.thunkname{fcnNum}='uint16uint16Thunk';fcns.name{fcnNum}='SetFuncGenEnable'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16'};fcnNum=fcnNum+1;
% extern  word GetFuncGenSignalType ( word * wValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenSignalType'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word SetFuncGenSignalType ( word wValue ); 
fcns.thunkname{fcnNum}='uint16uint16Thunk';fcns.name{fcnNum}='SetFuncGenSignalType'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16'};fcnNum=fcnNum+1;
% extern  word SetFuncGenMode ( dword dwMode ); 
fcns.thunkname{fcnNum}='uint16uint32Thunk';fcns.name{fcnNum}='SetFuncGenMode'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32'};fcnNum=fcnNum+1;
% extern  word GetFuncGenMode ( dword * dwMode ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenMode'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32Ptr'};fcnNum=fcnNum+1;
% extern  word GetFuncGenAmplitude ( double * dValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenAmplitude'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr'};fcnNum=fcnNum+1;
% extern  word SetFuncGenAmplitude ( double dValue ); 
fcns.thunkname{fcnNum}='uint16doubleThunk';fcns.name{fcnNum}='SetFuncGenAmplitude'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'double'};fcnNum=fcnNum+1;
% extern  word GetFuncGenAmplitudeRange ( byte * byValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenAmplitudeRange'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetFuncGenAmplitudeRange ( byte byValue ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetFuncGenAmplitudeRange'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  word GetFuncGenDCOffset ( double * dValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenDCOffset'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr'};fcnNum=fcnNum+1;
% extern  word SetFuncGenDCOffset ( double dValue ); 
fcns.thunkname{fcnNum}='uint16doubleThunk';fcns.name{fcnNum}='SetFuncGenDCOffset'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'double'};fcnNum=fcnNum+1;
% extern  word GetFuncGenSymmetry ( double * dValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenSymmetry'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr'};fcnNum=fcnNum+1;
% extern  word SetFuncGenSymmetry ( double dValue ); 
fcns.thunkname{fcnNum}='uint16doubleThunk';fcns.name{fcnNum}='SetFuncGenSymmetry'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'double'};fcnNum=fcnNum+1;
% extern  word GetFuncGenFrequency ( double * dValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenFrequency'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr'};fcnNum=fcnNum+1;
% extern  word SetFuncGenFrequency ( double * dValue ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='SetFuncGenFrequency'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr'};fcnNum=fcnNum+1;
% extern  word SetFuncGenTrigSource ( byte byTrigSource ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetFuncGenTrigSource'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  word GetFuncGenTrigSource ( byte * byTrigSource ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetFuncGenTrigSource'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word FillFuncGenMemory ( dword dwSampleCount , word * FuncGenData ); 
fcns.thunkname{fcnNum}='uint16uint32voidPtrThunk';fcns.name{fcnNum}='FillFuncGenMemory'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32', 'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word FuncGenBurst ( word wNrPeriods ); 
fcns.thunkname{fcnNum}='uint16uint16Thunk';fcns.name{fcnNum}='FuncGenBurst'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16'};fcnNum=fcnNum+1;
% extern  word SetupOhmMeasurements ( word wMode ); 
fcns.thunkname{fcnNum}='uint16uint16Thunk';fcns.name{fcnNum}='SetupOhmMeasurements'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16'};fcnNum=fcnNum+1;
% extern  word GetOhmValues ( double * dValue1 , double * dValue2 ); 
fcns.thunkname{fcnNum}='uint16voidPtrvoidPtrThunk';fcns.name{fcnNum}='GetOhmValues'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr', 'doublePtr'};fcnNum=fcnNum+1;
% extern  word I2CWrite ( dword dwAddress , pointer pBuf , dword dwSize ); 
fcns.thunkname{fcnNum}='uint16uint32voidPtruint32Thunk';fcns.name{fcnNum}='I2CWrite'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32', 'voidPtr', 'uint32'};fcnNum=fcnNum+1;
% extern  word I2CWriteNoStop ( dword dwAddress , pointer pBuf , dword dwSize ); 
fcns.thunkname{fcnNum}='uint16uint32voidPtruint32Thunk';fcns.name{fcnNum}='I2CWriteNoStop'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32', 'voidPtr', 'uint32'};fcnNum=fcnNum+1;
% extern  word I2CRead ( dword dwAddress , pointer pBuf , dword dwSize ); 
fcns.thunkname{fcnNum}='uint16uint32voidPtruint32Thunk';fcns.name{fcnNum}='I2CRead'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32', 'voidPtr', 'uint32'};fcnNum=fcnNum+1;
% extern  word I2CReadNoStop ( dword dwAddress , pointer pBuf , dword dwSize ); 
fcns.thunkname{fcnNum}='uint16uint32voidPtruint32Thunk';fcns.name{fcnNum}='I2CReadNoStop'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32', 'voidPtr', 'uint32'};fcnNum=fcnNum+1;
% extern  word I2CGetSpeed ( dword * dwSpeed ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='I2CGetSpeed'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32Ptr'};fcnNum=fcnNum+1;
% extern  word I2CSetSpeed ( dword * dwSpeed ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='I2CSetSpeed'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32Ptr'};fcnNum=fcnNum+1;
% extern  word GetActiveHS2 ( byte * byActiveHS2 ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='GetActiveHS2'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8Ptr'};fcnNum=fcnNum+1;
% extern  word SetActiveHS2 ( byte byActiveHS2 ); 
fcns.thunkname{fcnNum}='uint16uint8Thunk';fcns.name{fcnNum}='SetActiveHS2'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8'};fcnNum=fcnNum+1;
% extern  word SetDAC1451 ( double dMotor1 , double dMotor2 ); 
fcns.thunkname{fcnNum}='uint16doubledoubleThunk';fcns.name{fcnNum}='SetDAC1451'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'double', 'double'};fcnNum=fcnNum+1;
% extern  word SetMotorOn ( byte byMotor1 , byte byMotor2 ); 
fcns.thunkname{fcnNum}='uint16uint8uint8Thunk';fcns.name{fcnNum}='SetMotorOn'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint8', 'uint8'};fcnNum=fcnNum+1;
% extern  dword GetMaxSampleFrequency ( void ); 
fcns.thunkname{fcnNum}='uint32voidThunk';fcns.name{fcnNum}='GetMaxSampleFrequency'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint32'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word StartMeasurement ( void ); 
fcns.thunkname{fcnNum}='uint16voidThunk';fcns.name{fcnNum}='StartMeasurement'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word GetMeasurement ( double * dCh1 , double * dCh2 ); 
fcns.thunkname{fcnNum}='uint16voidPtrvoidPtrThunk';fcns.name{fcnNum}='GetMeasurement'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr', 'doublePtr'};fcnNum=fcnNum+1;
% extern  word GetMeasurementRaw ( word * wCh1 , word * wCh2 ); 
fcns.thunkname{fcnNum}='uint16voidPtrvoidPtrThunk';fcns.name{fcnNum}='GetMeasurementRaw'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16Ptr', 'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word GetOneMeasurement ( dword dwIndex , double * dCh1 , double * dCh2 ); 
fcns.thunkname{fcnNum}='uint16uint32voidPtrvoidPtrThunk';fcns.name{fcnNum}='GetOneMeasurement'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32', 'doublePtr', 'doublePtr'};fcnNum=fcnNum+1;
% extern  word GetOneMeasurementRaw ( dword dwIndex , word * wCh1 , word * wCh2 ); 
fcns.thunkname{fcnNum}='uint16uint32voidPtrvoidPtrThunk';fcns.name{fcnNum}='GetOneMeasurementRaw'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32', 'uint16Ptr', 'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word GetOneMeasurementRawCh ( word wCh , dword dwIndex , word * wChData ); 
fcns.thunkname{fcnNum}='uint16uint16uint32voidPtrThunk';fcns.name{fcnNum}='GetOneMeasurementRawCh'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16', 'uint32', 'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word ADC_GetData ( word * wCh1 , word * wCh2 ); 
fcns.thunkname{fcnNum}='uint16voidPtrvoidPtrThunk';fcns.name{fcnNum}='ADC_GetData'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint16Ptr', 'uint16Ptr'};fcnNum=fcnNum+1;
% extern  word ADC_GetDataVolt ( double * dCh1 , double * dCh2 ); 
fcns.thunkname{fcnNum}='uint16voidPtrvoidPtrThunk';fcns.name{fcnNum}='ADC_GetDataVolt'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'doublePtr', 'doublePtr'};fcnNum=fcnNum+1;
% extern  dword GetSampleFrequency ( void ); 
fcns.thunkname{fcnNum}='uint32voidThunk';fcns.name{fcnNum}='GetSampleFrequency'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint32'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word SetSampleFrequency ( dword * dwFreq ); 
fcns.thunkname{fcnNum}='uint16voidPtrThunk';fcns.name{fcnNum}='SetSampleFrequency'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32Ptr'};fcnNum=fcnNum+1;
% extern  dword GetTriggerTimeOut ( void ); 
fcns.thunkname{fcnNum}='uint32voidThunk';fcns.name{fcnNum}='GetTriggerTimeOut'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint32'; fcns.RHS{fcnNum}=[];fcnNum=fcnNum+1;
% extern  word SetTriggerTimeOut ( dword dwTimeout ); 
fcns.thunkname{fcnNum}='uint16uint32Thunk';fcns.name{fcnNum}='SetTriggerTimeOut'; fcns.calltype{fcnNum}='Thunk'; fcns.LHS{fcnNum}='uint16'; fcns.RHS{fcnNum}={'uint32'};fcnNum=fcnNum+1;
enuminfo.TDeviceTypes=struct('dtHandyprobe2',0,'dtHandyscope2',1,'dtHandyscope3',2,'dtHandyscope4',3,'dtHS508',4,'dtHS801',5,'dtTP112',6,'dtTP208',7,'dtTP508',8,'dtTP801',9,'dtPCI801',10,'dtMultiCh',11);
methodinfo=fcns;
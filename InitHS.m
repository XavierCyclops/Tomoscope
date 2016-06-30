function [Const,Estado]  = InitHS(sDLL)

%warning off all
    TiePieDir = 'G:\Interfaz\tiepie.h';
    
    if ~libisloaded(sDLL)
       [notfound, warnings]=loadlibrary(sDLL, @init);
       pause(0.2)
    end

    if ~exist( 'Const' )
       %Load all #define constants in TiePie.h into the structure 'Const':  
        Const = GetConstDefines( 'tiepie.h' );
       %Constants like Const.ltsCh1 can now be used.
    end

    try
      Result = calllib(sDLL, 'InitInstrument' , 0 );
      Estado = Result;
    end
    
    
    % Get channel count:
    [ Result , nChannelCount ] = calllib( sDLL , 'GetNrChannels' , 0 );
    
    % Enable all channels:
    try
        for i = 1:nChannelCount;    
             Result = calllib( sDLL , 'SetChEnabled' , i , 1 );  
        end
    catch
        % If SetChEnabled is not supported by the DLL, use SetMeasureMode:
        Result = calllib( sDLL , 'SetMeasureMode' , 255 );  
    end
end

    
    
    
    
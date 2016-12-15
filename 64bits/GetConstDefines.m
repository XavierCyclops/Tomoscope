%Funcion GETCONSTDEFINES

function Const = GetConstDefines( sFileName )
  fid = fopen( sFileName );
  if ( fid == -1 )
    error( ['Unable to open file: ' sFileName] );
  end
  
  while( true )
    sLine = fgetl( fid );
    if ( sLine == -1 )
      fclose( fid );
      break;
    end
    d = strfind( sLine , '#define ' );
    if ( ~isempty(d) )
      % Remove // comment behind define, if present:
      nPos = strfind( sLine , '//' );
      if ( ~isempty( nPos ) )
        sLine = sLine(1:nPos-1);
      end    
      str = strtrim( sLine( d(1) + 8:end ) );    
      s = strfind( str , ' ' );
      if ( ~isempty(s) )
        nPos = strfind(str(1:s(1)-1),'('); % Skip macro defines.
        if ( isempty( nPos ) )
          % If the constant is in HEX, convert it to decimal:
          if ( ~isempty( strfind( str , '0x' ) ) )
            try
              sHex = regexprep( str , '.*0x(\w+)' , '$1' );
              str = regexprep( str , '(0x\w+)' , int2str( hex2dec( sHex ) ) );
            end
          end
          str(s(1)) = '=';
          str = [ 'Const.' str ';' ];
          try
            eval(str);
          catch
            str % Display the string if unable to execute it.
          end
        end
      end
    end
  end  
  
end 
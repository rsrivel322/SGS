package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;

public class function {

	public static String converter(byte[] cdr, String nombreFile,String fileXtencion) throws IOException {
		
		
		  String base64 = Base64.getEncoder().encodeToString(cdr);
		  byte[] Rivelinho = Base64.getDecoder().decode(base64);
		  File file = new File("/tmp/sgs/"+nombreFile+fileXtencion);
		  OutputStream fos = new FileOutputStream(file);
		  fos.write(Rivelinho);
		  
		  System.out.println("CDR: "+base64);
		
		  String res="exitoso";
		return res;
		
	}
	
}

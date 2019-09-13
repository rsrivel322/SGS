package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Base64;
import javax.swing.JOptionPane;
import efact.sgs.service.Authorization;
import efact.sgs.service.ExecutionException_Exception;
import efact.sgs.service.InterruptedException_Exception;
import efact.sgs.service.SgsTransactionService;
import efact.sgs.service.TransactionResponse;
import efact.sgs.service.TransactionServiceImplService;

public class envioSGS {

	public static void main(String[] args) throws IOException, ExecutionException_Exception, InterruptedException_Exception {
		
		//CONEXION
		TransactionServiceImplService sendService = new TransactionServiceImplService();
		SgsTransactionService sendSGS=sendService.getTransactionServiceImplPort();
		
		//PROCESOS
		 Authorization sendAuth = new Authorization();
		 File invoiceDoc= new File("/home/rrossel/Descargas/Rivel_Rossel/000 TRABAJO/2019 - 09 SEPTIEMBRE/13/SGS prueba java/F710-10136666.xml");
		 
		 byte[] fileContent = Files.readAllBytes(invoiceDoc.toPath());
		 
		 TransactionResponse result=sendSGS.sendInvoice(sendAuth, fileContent);
		 
		 //SALIDA

		 String id=result.getIdentifier();
		 String uuid =result.getUuid();
		 String msjOut =result.getOutString();
		 String outString=result.getOutString();
		 int type=result.hashCode();
		                     //salida cdr
		 String cdrFile64 = Base64.getEncoder().encodeToString(result.getCdrFile());
		                     //salida xml
		 byte[] xmlSigned=result.getXmlSigned();
		 String outputFolderXml="/home/rrossel/Descargas/Rivel_Rossel/000 TRABAJO/2019 - 09 SEPTIEMBRE/13/SGS prueba java/XML/";
		 File xmlFileDoc=new File(outputFolderXml+id+".xml");
		 OutputStream escribirXml=new FileOutputStream(xmlFileDoc);
		 escribirXml.write(xmlSigned);
		 
		 
		                     //salida pdf
		 byte[] pdfFile =result.getPdfFile();
		 String outputFolderPdf="/home/rrossel/Descargas/Rivel_Rossel/000 TRABAJO/2019 - 09 SEPTIEMBRE/13/SGS prueba java/PDF/";
		 File pdfFileDoc= new File(outputFolderPdf+id+".pdf");
		 OutputStream escribirPdf= new FileOutputStream(pdfFileDoc);
		 escribirPdf.write(pdfFile);
		 
		 //IMPRIMIR
		 
		 System.out.println("CDR: "+cdrFile64);
		 JOptionPane.showMessageDialog(null, "Identifier: "+id+"\n"+"UUID: "+uuid+"\n"+"OutString: "+outString+"\n"+"Mensaje: "+msjOut);
		
	}
	
}

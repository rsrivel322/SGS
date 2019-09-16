package main;

import java.io.IOException;
import java.util.Base64;

import javax.swing.JOptionPane;
import efact.sgs.service.Authorization;
import efact.sgs.service.ExecutionException_Exception;
import efact.sgs.service.InterruptedException_Exception;
import efact.sgs.service.SgsTransactionService;
import efact.sgs.service.TransactionResponse;
import efact.sgs.service.TransactionServiceImplService;

public class ExecEnvioSGS {

	public static void main(String[] args) throws IOException, ExecutionException_Exception, InterruptedException_Exception {
		
		//CONEXION
		
		TransactionServiceImplService sendService = new TransactionServiceImplService();
		SgsTransactionService sendSGS=sendService.getTransactionServiceImplPort();
		 Authorization sendAuth = new Authorization();
		 envioSGS sgsNew=new envioSGS();
		 sgsNew.setDocumentId("F710-10136678");
		 sgsNew.setInRoutFolder("/home/rrossel/Descargas/Rivel_Rossel/000 TRABAJO/2019 - 09 SEPTIEMBRE/16/SGS prueba java/");
		 sgsNew.setOutRoutFolder("/home/rrossel/Descargas/Rivel_Rossel/000 TRABAJO/2019 - 09 SEPTIEMBRE/16/SGS prueba java/");
		 sgsNew.setDocumentType(Integer.parseInt(JOptionPane.showInputDialog("ingrese el tipo de documento:")));
		 
		//String[] files = new File("/").list();
		 
		byte[] xmlByte =sgsNew.xmlToByte(sgsNew.getInRoutFolder()+sgsNew.getDocumentId());
		 TransactionResponse response=null;
		 
		 if(sgsNew.getDocumentType()==1) {
			 //factura
			  response=sendSGS.sendInvoice(sendAuth,xmlByte );
		 }else if (sgsNew.getDocumentType()==3) {
			 //boleta
			 response=sendSGS.sendBoleta(sendAuth, xmlByte);
		}else if (sgsNew.getDocumentType()==7) {
			//credit note
			response=sendSGS.sendCreditNote(sendAuth, xmlByte);
		}else if (sgsNew.getDocumentType()==8) {
			//debit note
			response=sendSGS.sendDebitNote(sendAuth, xmlByte);
		}
		 else {
			System.out.println("El tipo de documento no existe");
		}
		 
		 //SALIDA
		 String id=response.getIdentifier();
		 String uuid =response.getUuid();
		 String msjOut =response.getOutString();
		 String outString=response.getOutString();
		 int responseCode=response.getResponseCode();
		 System.out.println("ID: "+id);
		 System.out.println("UUID: "+uuid);
		 System.out.println("Mensaje"+msjOut);
		 System.out.println("OutString"+outString);
		 System.out.println("Codigo de respuesta: "+responseCode);
		 
		                     //salida cdr
		 byte[] cdrFileXml=response.getCdrFile();
		 String cdrFile64 = Base64.getEncoder().encodeToString(cdrFileXml);
		 envioSGS.conversorXMLPDF(cdrFileXml,sgsNew.getOutRoutFolder()+"CDR/", sgsNew.getDocumentId(), ".xml");

		                     //salida xml
		 byte[] xmlSigned=response.getXmlSigned();;
		 envioSGS.conversorXMLPDF(xmlSigned,sgsNew.getOutRoutFolder()+"XML/", sgsNew.getDocumentId(), ".xml");
		 
		                     //salida pdf
		 byte[] pdfFile =response.getPdfFile();
		 envioSGS.conversorXMLPDF(pdfFile,sgsNew.getOutRoutFolder()+"PDF/", sgsNew.getDocumentId(), ".pdf");
		 
		 //IMPRIMIR CDR
		 System.out.println("CDR: "+cdrFile64);
	}
	
}

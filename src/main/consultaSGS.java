package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.soap.SOAPFaultException;

import efact.sgs.service.Authorization;
import efact.sgs.service.SgsTransactionService;
import efact.sgs.service.TransactionResult;
import efact.sgs.service.TransactionServiceImplService;

public class consultaSGS {
public static void main(String[] args) {
 TransactionServiceImplService service = new TransactionServiceImplService();
 SgsTransactionService sgs = service.getTransactionServiceImplPort();
 
 Authorization auth = new Authorization();
 int doctype = 01;
 String id = "F710-10136655";
 auth.setUser("20100114349");
 
 String [] docs = "F710-10136655,F710-10136654".split(",");
 List<String> list = new ArrayList<>();
 for (int i = 0; i < docs.length; i++) {
  System.out.println("Documento:" + docs[i]);
  String NomArchivo = "20100114349-"+doctype+"-"+docs[i];
  System.out.println(NomArchivo);


 try {
  TransactionResult result = sgs.getStatus(auth, doctype, id);
  System.out.println("Digest Value: "+result.getDigestValue());
  System.out.println("Correlativo: "+result.getIdentifier());
  System.out.println("Mensaje: "+result.getMessage());
  
  
  byte [] cdr = result.getPdfFile();
  
//  String base64 = Base64.getEncoder().encodeToString(cdr);
//  byte[] Rivelinho = Base64.getDecoder().decode(base64);
//  File file = new File("/tmp/sgs/"+NomArchivo+".pdf");
//  OutputStream fos = new FileOutputStream(file);
//  fos.write(Rivelinho);
//  
//  System.out.println("CDR: "+base64);
 function.converter(cdr, NomArchivo, "xml");
  
 } catch (FileNotFoundException e) {
  // TODO: handle exception
 
 } catch (SOAPFaultException e) {
  System.out.println(e.getFault().getDetail().getTextContent());
 } catch (IOException e) {
//   list.add(docs[i]);
  e.printStackTrace();
 }
 list.add(docs[i]);
 
 }
 System.err.println(list);
}
}

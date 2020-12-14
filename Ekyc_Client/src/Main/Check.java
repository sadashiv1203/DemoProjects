package Main;

import java.io.StringReader;
import java.io.StringWriter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.sax.SAXSource;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;

import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;


import JaxB_Classes.*;
import com.component.common.NamespaceFilter;
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Auth a=new Auth();
		
		a.setTid(Tid.fromValue("registered"));
		a.setTxn("Hello");
		
		JAXBElement kycResElement = new JAXBElement(new QName(
				"http://www.uidai.gov.in/kyc/uid-kyc-response/2.0", "Auth"),
				Auth.class, a);
		StringWriter Authxml = new StringWriter();

		try {
			JAXBContext.newInstance(Auth.class).createMarshaller().marshal(
					kycResElement, Authxml);
			System.out.println("Auth data:-"+Authxml.toString());
		}
		catch(Exception e)
		{
			
		}
		
		String xml="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns2:Auth tid=\"registered\" txn=\"Hello\" xmlns:ns2=\"http://www.uidai.gov.in/kyc/uid-kyc-response/1.0\" xmlns=\"http://www.demo.com/Ekyc_Auth/5.0\"/>";
		
		try 
		{
			 Auth obj=(Auth)parseAuthResponseXML(Auth.class, xml);
			 System.out.println("Tid value222222222:-"+obj.getTid());
			 System.out.println("objectSAASA created");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//System.out.println(validateXMLSchema("E:\\Sadashiv Suryaji-java\\my java programs\\Ekyc_Client\\Common_Files\\Ekyc_Auth.xsd", "C:\\Users\\Shree\\Desktop\\files\\abc.xml"));
        
	
}
	
	
	public static boolean validateXMLSchema(String xsdPath, String xmlPath){
	      try {
	         SchemaFactory factory =
	            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	            Schema schema = factory.newSchema(new File(xsdPath));
	            Validator validator = schema.newValidator();
	            validator.validate(new StreamSource(new File(xmlPath)));
	      } catch (Exception e){
	         System.out.println("Exception: "+e.getMessage());
	         return false;
	      }
			
	      return true;
		
	   }
	
	private static Object parseAuthResponseXML(Class clazz, String xmlToParse)
			throws JAXBException {
		// Create an XMLReader to use with our filter
		try {
			// Prepare JAXB objects
			JAXBContext jc = JAXBContext.newInstance(clazz);
			Unmarshaller u = jc.createUnmarshaller();

			XMLReader reader;
			reader = XMLReaderFactory.createXMLReader();

			// Create the filter (to add namespace) and set the xmlReader as its
			// parent.
			NamespaceFilter inFilter = new NamespaceFilter(
					"http://www.uidai.gov.in/kyc/uid-kyc-response/4.0", true);
			inFilter.setParent(reader);

			// Prepare the input, in this case a java.io.File (output)
			InputSource is = new InputSource(new StringReader(xmlToParse));

			// Create a SAXSource specifying the filter
			SAXSource source = new SAXSource(inFilter, is);

			// Do unmarshalling
			Object res = u.unmarshal(source, clazz).getValue();
			return res;
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}

package Controller;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class DemoCalender {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			Date dob=null;
			DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			dob=df.parse( "2014-02-10 11:15:00" );
			GregorianCalendar cal = new GregorianCalendar();

			cal.setTime(dob);
			XMLGregorianCalendar xmlDate2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH), dob.getHours(),dob.getMinutes(),dob.getSeconds(),DatatypeConstants.FIELD_UNDEFINED, cal.getTimeZone().LONG).normalize();
			XMLGregorianCalendar xmlDate3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH),dob.getHours(),dob.getMinutes(),dob.getSeconds(),DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED);
			System.out.println(xmlDate2);
			System.out.println(xmlDate3);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}

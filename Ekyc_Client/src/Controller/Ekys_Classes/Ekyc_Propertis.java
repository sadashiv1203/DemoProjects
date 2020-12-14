package Controller.Ekys_Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public  class Ekyc_Propertis {
	
 static	String Tid;
 static	String Ac;
 static	String Sa;
 static	String Ver;
 static	String Txn;
 static	String Lk;
 static	String Pi;
 static	String Pa;
 static	String Pfa;
 static	String Bio;
 static	String Bt;
 static	String Pin;
 static	String Otp;
 static	String Udc;
 static	String Pip;
 static	String Idc;
 static	String Type;
 static Properties prop;
 
 public static String getTid() {
	return Tid;
}

public static void setTid(String tid) {
	Tid = tid;
}

public static String getAc() {
	return Ac;
}

public static void setAc(String ac) {
	Ac = ac;
}

public static String getSa() {
	return Sa;
}

public static void setSa(String sa) {
	Sa = sa;
}

public static String getVer() {
	return Ver;
}

public static void setVer(String ver) {
	Ver = ver;
}

public static String getTxn() {
	return Txn;
}

public static void setTxn(String txn) {
	Txn = txn;
}

public static String getLk() {
	return Lk;
}

public static void setLk(String lk) {
	Lk = lk;
}

public static String getPi() {
	return Pi;
}

public static void setPi(String pi) {
	Pi = pi;
}

public static String getPa() {
	return Pa;
}

public static void setPa(String pa) {
	Pa = pa;
}

public static String getPfa() {
	return Pfa;
}

public static void setPfa(String pfa) {
	Pfa = pfa;
}

public static String getBio() {
	return Bio;
}

public static void setBio(String bio) {
	Bio = bio;
}

public static String getBt() {
	return Bt;
}

public static void setBt(String bt) {
	Bt = bt;
}

public static String getPin() {
	return Pin;
}

public static void setPin(String pin) {
	Pin = pin;
}

public static String getOtp() {
	return Otp;
}

public static void setOtp(String otp) {
	Otp = otp;
}

public static String getUdc() {
	return Udc;
}

public static void setUdc(String udc) {
	Udc = udc;
}

public static String getPip() {
	return Pip;
}

public static void setPip(String pip) {
	Pip = pip;
}

public static String getIdc() {
	return Idc;
}

public static void setIdc(String idc) {
	Idc = idc;
}

public static String getType() {
	return Type;
}

public static void setType(String type) {
	Type = type;
}

   public static void Load()
	{
	 prop=new Properties();
		// TODO Auto-generated method stub
		try 
		{
			prop.load(new FileInputStream(new File("E:\\Sadashiv Suryaji-java\\my java programs\\Ekyc_Client\\Common_Files\\Ekyc.properties")));
			Tid=prop.getProperty("Tid");
			Ac=prop.getProperty("Ac");
			Sa=prop.getProperty("Sa");
			Ver=prop.getProperty("Ver");
			Txn=prop.getProperty("Txn");
			Lk=prop.getProperty("Lk");
			Pi=prop.getProperty("Pi");
			Pa=prop.getProperty("Pa");
			Pfa=prop.getProperty("Pfa");
			Bio=prop.getProperty("Bio");
			Bt=prop.getProperty("Bt");
			Pin=prop.getProperty("Pin");
			Otp=prop.getProperty("Otp");
			Udc=prop.getProperty("Udc");
			Pip=prop.getProperty("Pip");
			Idc=prop.getProperty("Idc");
			Type=prop.getProperty("Type");
		} catch (Exception e) {
			
		}
		

	}
	//private void poh() 
	
	
	

}

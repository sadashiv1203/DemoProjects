package Controller;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer str = new StringBuffer();
		String s[] = new String[5];
		s[0] = "a";
		s[1] = "b";
		s[2] = "c";
		s[3] = "d";
		s[4] = "e";
		
		for(int i=0; i<s.length; i++)
		{
			str.append("','");
			str.append(s[i]);
		}
		str.append("'");

		str.replace(0, 2, "");
		
		
		System.out.println(str);
		
	}

}

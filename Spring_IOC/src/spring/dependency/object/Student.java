package spring.dependency.object;

public class Student {
	
	//MathCheat cheat=new MathCheat();// this is not good practice of programming 
	//,when you are using new keyword is called tight coupling
	
	MathCheat cheat1;// its good practice
	
	
	
	public void setCheat1(MathCheat cheat1) {
		this.cheat1 = cheat1;
	}



	public void cheating()
	{
		cheat1.mathCheat();// 
	}

}

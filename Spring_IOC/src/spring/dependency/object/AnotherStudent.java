package spring.dependency.object;

public class AnotherStudent {
	
     MathCheat cheat;// its good practice
	
	

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void cheating()
	{
		cheat.mathCheat();// 
	}

}

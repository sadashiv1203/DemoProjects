package spring.IOC;

public class Airtel implements Sim
{

	Airtel()
	{
		System.out.println("Airtel Contructor Called");
	}
	
	@Override
	public void calling() {
		System.out.println("Airtel caling ");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Airtel Data");
		
	}

}

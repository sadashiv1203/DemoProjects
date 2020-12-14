package spring.IOC;

public class Vodafone implements Sim
{

	@Override
	public void calling() {
		System.out.println("Vodafone caling ");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Vodafone Data");
		
	}

}

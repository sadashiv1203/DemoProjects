package Controller;

public class Tea implements IHotDrink {
	
	@Override
	public void prepareHotDrink()
	{
		System.out.println("Hello Customer,we are preparing tea for you");
	}

}

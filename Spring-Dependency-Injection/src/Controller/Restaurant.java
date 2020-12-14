package Controller;


//In Dependency Injection removes the dependency of each other
//In case i want to change the Tea class To XpressTea Class then change is made in both that is also remove
//Suppoes to add constructor in Tea Class then also change in Restaurant that it also removed 

public class Restaurant {
	
	IHotDrink hotDrink;
	// Dependency Injection using Constructor way
	/*public Restaurant(IHotDrink hotDrink) 
	{
		this.hotDrink=hotDrink;
	}*/
	
	//Dependency Injection using SetterMethod
	public void sethotDrink(IHotDrink hotDrink)
	{
		this.hotDrink=hotDrink;
	}
	
	public void prepareHotDrink()
	{
		hotDrink.prepareHotDrink();
	}
}

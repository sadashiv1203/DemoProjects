package Controller;

public class Restaurant {
	
	private String welcomeNote;
	
	public void setwelcomeNote(String welcomeNote)
	{
		this.welcomeNote=welcomeNote;
	}
	
	public void greetCustomer()
	{
		System.out.println(welcomeNote);
	}

}


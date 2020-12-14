package spring.autowired;

public class Heart 
{
	private String nameofAnimal;
	private int noOfHeart;
	
	public String getNameofAnimal() {
		return nameofAnimal;
	}

	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public void pump()
	{
		System.out.println("heart pumping......");
	}

}

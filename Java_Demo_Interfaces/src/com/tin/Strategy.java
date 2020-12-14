package com.tin;

public class Strategy 
{
	
	calculator cal;
	
	Strategy(calculator cal)
	{
		this.cal=cal;
	}

	public int output(int x,int y)
	{
		return cal.cal(x, y);
	}
}

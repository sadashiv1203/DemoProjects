package Controller;

import java.util.ArrayList;

interface DemoTest
{
	void Test();
}

class Student implements DemoTest
{
	@Override
	public void Test() {
		System.out.println("Test.......Student");
	}
}

class CheckInterface extends Student
{
	@Override
	public void Test() {
		System.out.println("Test.........CheckInterface");
	}
}


public class TestInterfface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList t;
		CheckInterface obj=new CheckInterface();
		obj.Test();

	}

}

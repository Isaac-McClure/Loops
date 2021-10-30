package loopDemo;

public class Main 
{	
	public static void main(String[] args) 
	{		
		TestDataProjection test = new TestDataProjection();
		if(test.testDataProjection())
		{
			System.out.println("passed! :) ");
		}
		else
		{
			System.out.println("failed! :( ");
		}
	}	
}

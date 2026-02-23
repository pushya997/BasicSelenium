package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class script_1 
{
	@Test
	public void test1()
	{
		
		//System.out.println("hello");------o/p in console
		//Reporter.log("hello");-------- o/p in report
		Reporter.log("hello",true);
	}
	

}

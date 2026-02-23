package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethods {
	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().minimize();
		 driver.manage().window().fullscreen();
		 
		 driver.get("https://www.facebook.com/");
		 //before maximizing
		 Dimension size = driver.manage().window().getSize();
		 System.out.println(size);
		 System.out.println(size.getHeight());
		 System.out.println(size.getWidth());
		  //maximize the browser
		 driver.manage().window().maximize();
		  //after maximizing
		 System.out.println(driver.manage().window().getSize());
		 System.out.println(driver.manage().window().getSize().getHeight());
		 System.out.println(driver.manage().window().getSize().getWidth());
		 		 //setting the size
		 driver.manage().window().setSize(new Dimension(300,300));
		 		 //get position
		 Point position = driver.manage().window().getPosition();
		 System.out.println(position);
		 System.out.println("x cordinate="+position.getX());
		 System.out.println("y cordinate="+position.getY());
		 		 //set position
		 driver.manage().window().setPosition(new Point(300,300));
		 
		 

	}

}

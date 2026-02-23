package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.get("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.manage().window().setSize(new Dimension(300,500));
	driver.manage().window().setPosition(new Point(180,300));
	driver.manage().window().maximize();
	driver.manage().window().fullscreen();
	driver.manage().window().minimize();
	driver.close();
	
	
	

	}

}

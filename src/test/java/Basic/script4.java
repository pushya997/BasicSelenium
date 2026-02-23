package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		
		if(title.contains("Facebook")) {
			System.out.println("opened page");
		}else {
			System.out.println("Page not Found");
		}
		

	}

}

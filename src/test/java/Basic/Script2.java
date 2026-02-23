package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

}

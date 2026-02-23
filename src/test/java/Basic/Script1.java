package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
 driver.get("https://www.google.com/");
 driver.get("https://www.facebook.com/");
 driver.close();
	}

}

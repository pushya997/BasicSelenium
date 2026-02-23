package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMScript {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://support.orangehrm.com/portal/en/signin");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("OrangeHRM")) {
			System.out.println("opened page");
		} else {
			System.out.println("Page not Found");
		}
	}

}

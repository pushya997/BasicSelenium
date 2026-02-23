package Basic;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_verify {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Google")) {
			System.out.println("Google page is displayed");
		} else {
			System.out.println("Page not Found");
		}
			driver.manage().window().setSize(new Dimension(400, 500));
			driver.manage().window().setPosition(new Point(300, 450));
			driver.manage().window().maximize();
			driver.navigate().forward();
			String title1 = driver.getTitle();
			System.out.println(title1);
			if (title1.contains("Facebook")) {
				System.out.println("Facebook page is displayed");
			} else {
				System.out.println("Page not Found");
			}
				driver.navigate().refresh();
				driver.close();

			}

		}
	


package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
  

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook login page
        driver.get("https://www.facebook.com/login.php");


        // Enter email
        driver.findElement(By.id("email")).sendKeys("test0@gmail.com");
        Thread.sleep(10000); 

        // Enter password
        driver.findElement(By.id("pass")).sendKeys("pass123");

        // Click login button
        driver.findElement(By.name("login")).click();

        // Optional: wait and close
        try {
            Thread.sleep(500000); // wait to observe result
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
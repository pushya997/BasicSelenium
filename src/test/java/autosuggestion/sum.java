package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sum {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/gpras/OneDrive/Desktop/table.html");
		List<WebElement> marks = driver.findElements(By.xpath("//td[3]"));
	int sum=0;
	for(int i=0;i<marks.size()-1;i++) {
		
		WebElement ele = marks.get(i);
		String str = ele.getText();
		int n = Integer.parseInt(str);
		sum+=n;
	}
	System.out.println(sum);
	String str1 = driver.findElement(By.xpath("(//tr/td[3])[6]")).getText();
	int total=Integer.parseInt(str1);
	System.out.println(total);
	if(sum==total) {
		System.out.println("Sum of marks is equal to total marks");
		
	}
	else {
		System.out.println("Sum of marks is not equal to total marks");
	}

	}

}

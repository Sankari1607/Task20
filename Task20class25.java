package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task20class25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker");
		//WebElement allLinks =driver.findElement(By.tagName("p"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.close();
		
		
		}

}

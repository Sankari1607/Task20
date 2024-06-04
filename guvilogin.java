package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guvilogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		//WebElement allLinks =driver.findElement(By.tagName("p"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("Radhana. M");
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("littlecutiespreschool@gamil.com");
		WebElement passwords = driver.findElement(By.xpath("//input[@id='password']"));
		passwords.sendKeys("abcdefgh123");
		WebElement mobileno = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mobileno.sendKeys("8754045162");
		driver.findElement(By.xpath("//a[@id='signup-btn']]")).click();
		driver.close();
	}

}

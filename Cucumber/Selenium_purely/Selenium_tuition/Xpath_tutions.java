package Selenium_tuition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_tutions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
//	driver.get("https:\\www.google.com");
//	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("testing");
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//a[@class=\"gb_3 gb_4 gb_3d gb_3c\"]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://curasolutions.in/");
	WebElement target = driver.findElement(By.xpath("//li[@class='has-child']//a[text() = 'Services']"));
	Actions act = new Actions(driver);
	
	act.moveToElement(target).build().perform();
	driver.findElement(By.xpath("//li[@class='has-child']//a[text() = 'Quality Assurance']")).click(); // working fine
	}
	

}

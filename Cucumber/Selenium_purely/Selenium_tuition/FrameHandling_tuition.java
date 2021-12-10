package Selenium_tuition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling_tuition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Browser driver\\chromedriver.exe");
		ChromeDriver abc = new ChromeDriver();
		
		abc.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		abc.manage().window().maximize();
		Thread.sleep(200);
		
		abc.get("https://www.freecrm.com/");
		abc.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a/span[2]")).click();
		abc.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div/input")).sendKeys("kirkiran11@gmail.com");
		abc.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[2]/div/input")).sendKeys("Ka05kw4395");
		//abc.findElement(By.xpath("//input[@type='submit']")).click();
		 abc.findElement(By.cssSelector(".button")).click();
		Thread.sleep(3000);
		
		 WebElement target = abc.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/a"));
		 WebElement tgt1 = abc.findElement(By.xpath("//a[@class=\"money icon\"]aria-hidden"));
		 Actions  a= new Actions(abc);
		 a.moveToElement(target);
		 a.click(tgt1);
		 a.build().perform();
		 
		//abc.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		abc.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
	}

}

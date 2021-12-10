package Selenium_tuition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckVisibilityElement_tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Browser driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();

driver.get("https://www.facebook.com/"); // enter URL

//isDiplayed() Method:
boolean b1 = driver.findElement(By.cssSelector("#u_0_d_sk")).isDisplayed();
System.out.println(b1); //true

//before selecting checkbox --I agree
//isEnabled() method:
boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
System.out.println(b2); //false

//lets make submit button enabled:
driver.findElement(By.name("agreeTerms")).click(); //check I Agree checkbox

//after selecting checkbox --I agree
//isEnabled() method:
boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
System.out.println(b3); //true


//isSelected() method: only applicable for checkbox, dropdown, radiobutton
boolean flag1 = driver.findElement(By.name("agreeTerms")).isSelected();
System.out.println(flag1); //true
		
//de-select the checkbox-- I Agree
driver.findElement(By.name("agreeTerms")).click(); //check I Agree checkbox

boolean flag2 = driver.findElement(By.name("agreeTerms")).isSelected();
System.out.println(flag2); //false
	}

}

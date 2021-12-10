package Selenium_tuition;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Browser driver\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.facebook.com");

//1. get the total count of links on the page
//2. get the text of each link on the page

//all the links are represented by <a> html tag:

List <WebElement> linkList = driver.findElements(By.tagName("a"));

//size of linkList:
System.out.println(linkList.size());

for(int i=0; i<linkList.size(); i++){
	String linkText = linkList.get(i).getText();
	System.out.println(linkText);
}
	}

}

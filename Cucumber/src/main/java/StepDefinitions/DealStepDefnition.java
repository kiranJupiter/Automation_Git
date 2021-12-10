package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepDefnition {
	
	 WebDriver driver;

		
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	 System.setProperty("webdriver.chrome.driver","D:\\Browser driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.freecrm.com/index.html");
	 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	 }
	 
	 @SuppressWarnings("deprecation")
	@When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a/span[2]")).click();
	 //Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	 }
	 //
	 
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials) throws InterruptedException{
		List<List<String>> data = credentials.raw();
	 driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div/input")).sendKeys(data.get(0).get(0));
	 driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[2]/div/input")).sendKeys(data.get(0).get(1));
	Thread.sleep(500);
	 }
	
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	//WebElement loginBtn =
	  driver.findElement(By.cssSelector(".button")).click();
	 //JavascriptExecutor js = (JavascriptExecutor)driver;
	 //js.executeScript("arguments[0].click();", loginBtn);
	 }
	 
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("Cogmento CRM", title);
	 }
	 
	 
	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_deal_page() {
		//driver.findElement(By.cssSelector("#main-nav .icon")).click(); 
		driver.findElement(By.xpath("//*[contains(concat( \" \", @class, \" \" ), concat( \" \", \"item-text\", \" \" ))] | //*[(@id = \"main-nav\")]//*[contains(concat( \" \", @class, \" \" ), concat( \" \", \"icon\", \" \" ))]\r\n"
				+ "")).click();
		//driver.switchTo().frame("mainpanel");
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		//driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		
		}
	 
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData){
		 List<List<String>> dealValues =  dealData.raw();
		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
	 }
	 
	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
	 @When ("^user clicks on ad deals$")
	 public void user_clicks_on_ad_deals(){
		 Actions abc=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//i[@aria-hidden='true' and @class='plus inverted icon']"));
	abc.moveToElement(target).build().perform();
	driver.findElement(By.xpath("//i[@aria-hidden='true' and @class='plus inverted icon']//")).click();
	}
	
	
	

}

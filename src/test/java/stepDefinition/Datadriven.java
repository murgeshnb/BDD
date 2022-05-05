package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Base;
import util.Pages;

public class Datadriven {
	private Base base;
	public Datadriven(Base base)
	{
		this.base=base;
	}
//	public WebDriver driver;
//	@Given("launch {string} browser")
//	public void launch_browser(String browser) {
//		if(browser.equalsIgnoreCase("chrome")){
//			 WebDriverManager.chromedriver().setup();
//			 base.driver=new ChromeDriver();
//		}else if(browser.equalsIgnoreCase("firefox")){
//			WebDriverManager.firefoxdriver().setup();
//			base.driver=new FirefoxDriver();
//		}
//		base.driver.manage().window().maximize();
//		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
	@Given("enter the url {string}")
	public void enter_the_url(String url) {
		base.driver.get(url);
	}
	
	@When("i will login with {string} username and {string} password")
	public void i_will_login_with_username_and_password(String username, String password) {
//		base.driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(username);
//		base.driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(password);
		Pages.loginPage.getUsernameTF().sendKeys(username);
		Pages.loginPage.getPasswordTF().sendKeys(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
//		base.driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//		base.driver.quit();
		Pages.loginPage.getLoginBtn().click();
	}
	
	@Then("i will click on Mobiles img")
	public void i_will_click_on_mobiles_img() throws InterruptedException {
		Thread.sleep(1000);
	   Pages.homePage.getMobilesImg().click();
	}
	@Then("i will click on iphone12 mobile")
	public void i_will_click_on_iphone12_mobile() {
		 Pages.mobilesPAge.getIph12().click();
	}
	@Then("i will click on buy now button")
	public void i_will_click_on_buy_now_button() {
	    Pages.iph12Page.getBuyNow().click();
	    
	}
	
//	@Then("i will logout of the application")
//	public void i_will_logout_of_the_application() {
////	    WebElement myacc = driver.findElement(By.xpath("//div[.='My Account' and @class='go_DOp']"));
////	    Actions act=new Actions(driver);
////	    act.moveToElement(myacc);
//		base.driver.quit();
//	}
	
	
	
//	@When("I want to read data from below table")
//	public void i_want_to_read_data_from_below_table(io.cucumber.datatable.DataTable dataTable) {
//	    System.out.println(dataTable);
//	    List<List<String>> data=dataTable.asLists();
//	    System.out.println(data);
//	    System.out.println(data.get(1).get(0));
//	}

}

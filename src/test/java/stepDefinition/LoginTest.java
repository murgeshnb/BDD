package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest
{
	WebDriver driver;
	@Given("I will launch the browser")
	public void i_will_launch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("I will enter the url")
	public void i_will_emter_the_url() {
	    driver.get("https://www.facebook.com");
	}

	@When("Login page is displayed i will enter username and password")
	public void login_page_is_displayed_i_will_enter_username_and_password() {
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Murgesh Bechetti");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("malingagj");
	}

	@When("I will click on login")
	public void i_will_click_on_login() {
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("I will validate whether home page is displayed or not")
	public void i_will_validate_whether_home_page_is_displayed_or_not() {
	System.out.println("Success");
	driver.quit();
	}
	
	@When("Login page is displayed enter invalid username and password")
	public void login_page_is_displayed_enter_invalid_username_and_password() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Murgesh Bechetti5");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("malingagj");
	}
	@Then("I will validate error message is displayed or not")
	public void i_will_validate_error_message_is_displayed_or_not() {
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		 driver.quit();
	}

}

package stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Base;
import util.Pages;
import util.PropertyFile;
import util.WebDriverUtil;

public class Hook extends WebDriverUtil{
	public Base base;
	public Hook(Base base)
	{
		this.base=base;
	}
	
//	@Before(order=0)
//	public void configbeforesc()
//	{
//		System.out.println("Execute before first");
//	}
//	
	@Before//(order=1)
	public void beforescenario() throws IOException
	{
		PropertyFile plib=new PropertyFile();
		String browser = plib.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")){
			 WebDriverManager.chromedriver().setup();
			 base.driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			base.driver=new FirefoxDriver();
		}
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Pages.loadPages(base.driver);
	}
	
	
	@After//(order=0)
	public void afterscenario(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			takesScreenshot(base.driver, scenario.getName());
			TakesScreenshot ts=(TakesScreenshot)base.driver;
			byte[] imagebytes = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(imagebytes, "png", scenario.getName());
		}
		System.out.println("Execute after first");
		base.driver.close();
	}
	
//	@After(order=1)
//	public void configAfter()
//	{
//		System.out.println("Execute after second");
//	}

}

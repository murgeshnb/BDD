package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageFactory.HomePage;
import pageFactory.Iph12Page;
import pageFactory.LoginPage;
import pageFactory.MobilesPAge;

public class Pages {
	//declare all the pages as static
	public static LoginPage loginPage;
	public static HomePage homePage;
	public static Iph12Page iph12Page;
	public static MobilesPAge mobilesPAge;
	
	public static void loadPages(WebDriver driver)
	{
		loginPage=PageFactory.initElements(driver, LoginPage.class);
		homePage=PageFactory.initElements(driver, HomePage.class);
		iph12Page=PageFactory.initElements(driver, Iph12Page.class);
		mobilesPAge=PageFactory.initElements(driver, MobilesPAge.class);
	}

}

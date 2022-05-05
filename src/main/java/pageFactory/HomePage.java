package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
//	public HomePage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath="//div[.='Mobiles' and @class='xtXmba']")
	private WebElement mobilesImg;

	public WebElement getMobilesImg() {
		return mobilesImg;
	}
	
	public void clickLogin()
	{
		mobilesImg.click();
	}
	

}

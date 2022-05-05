package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iph12Page {
	
//	public Iph12Page(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	private WebElement buyNow;

	public WebElement getBuyNow() {
		return buyNow;
	}
	
	public void buyClick()
	{
		buyNow.click();
	}

}

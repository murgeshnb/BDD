package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesPAge {
	
//	public MobilesPAge(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath="//ancestor::a[.='iPhone 13 Mini']/following-sibling::a[.='iPhone 12']")
	private WebElement iph12;

	public WebElement getIph12() {
		return iph12;
	}
	
	public void iphClick()
	{
		iph12.click();
	}

}

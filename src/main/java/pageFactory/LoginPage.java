package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
//	public LoginPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
	//1.identify by @findby
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement usernameTF;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement passwordTF;
	
	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginBtn;
	
	
	public void loginTO(String username,String password)
	{
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
	}
	public void logInbtn(){
		loginBtn.click();
	}

}

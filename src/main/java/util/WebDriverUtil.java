package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil {
	public void takesScreenshot(WebDriver driver,String scenario) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dstn=new File("./scrrenshots/"+scenario+sysDate()+".png");
		FileUtils.copyFile(src, dstn);
	}
	
	public String sysDate()
	{
		SimpleDateFormat date=new SimpleDateFormat("dd_MMM_yyyy_hh_mm_ss");
		String dt = date.format(new Date());
		return dt;
	}
	
	public void awaitForvisibilityOfEle(WebDriver driver, final WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver input) {
				element.isDisplayed();
				return element;
			}
		});
	}
	public void awaitForPagetitle(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(d-> d.getTitle());
		}
	
	public void frame(WebDriver driver,int index){
		driver.switchTo().frame(index);
	}
	public void frame(WebDriver driver,String id){
		driver.switchTo().frame(id);
	}
	
	public void frame(WebDriver driver,WebElement element){
		driver.switchTo().frame(element);
	}
	public void mousehover(WebDriver driver,WebElement target){
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}
	public void acceptAlert(WebDriver driver){
		driver.switchTo().alert().accept();
	}
	public void dismissAlert(WebDriver driver){
		driver.switchTo().alert().dismiss();
	}
	public void dropdownByValue(WebElement element,String value){
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void dropDownByindex(WebElement element,int index){
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	public void dragDrop(WebDriver driver,WebElement sourceElement,WebElement targetElement)
	{
		Actions act=new Actions(driver);
		act.clickAndHold(sourceElement).moveToElement(targetElement).release(sourceElement).perform();
	}

}

package genericlibraries;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WebDriverUtilities 
{
	
	public void mouseHover(WebElement ele,WebDriver driver)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).perform();	
	}
	public void rightClick(WebElement ele,WebDriver driver)
	{
		Actions actions=new Actions(driver);
		actions.contextClick(ele).perform();	
	}
	
	public void doubleClick(WebElement ele,WebDriver driver)
	{
		Actions actions=new Actions(driver);
		actions.doubleClick(ele).perform();	
	}
	public void dropDown(WebElement ele,String text)
	{
		Select select=new Select(ele);
		select.selectByVisibleText(text);
	}
	public void framewithWebElementAddress(WebElement ele,WebDriver driver)
	{
		driver.switchTo().frame(ele);
	}
	public void frameWithIndex(int numb,WebDriver driver)
	{
		driver.switchTo().frame(numb);
	}
	public void switchingbackFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void alertacceptPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void alertdismissPopup(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void alertpopupText(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		Reporter.log(alert.getText(),true);
	}
	
	public void scrollbarTopToBottom(WebDriver driver)
	{
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(0,5000)");
		
	}
	public void scrollbarBottomToTop(WebDriver driver)
	{
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("window.scrollBy(0,-5000)");
		
	}
	public void scrollbarToEle(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
		javascriptexecutor.executeScript("arguments[0].scrollIntoView();");
		
	}
	public void switchChildwindow(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String ch:child)
		{
			driver.switchTo().window(ch);
		}
	}
	public void multipletabs(int index,WebDriver driver)
	{
		Set<String> child=driver.getWindowHandles();
		ArrayList<String> arraylist=new ArrayList<String>(child);
		driver.switchTo().window(arraylist.get(index));
	}
	public void waitElement(WebElement ele,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitElementClick(WebElement ele,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}

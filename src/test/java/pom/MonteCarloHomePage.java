package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonteCarloHomePage 
{
	@FindBy(xpath="(//a[@class='button button--primary'])[2]")
	private WebElement blanket;
	
	public MonteCarloHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void shopBlanket()
	{
		blanket.click();
	}

}

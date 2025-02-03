package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenStolePage 
{
	@FindBy(xpath="//img[@src='//www.montecarlo.in/cdn/shop/files/06_Stall.png?v=1732612664']")
	private WebElement stole;

	public WomenStolePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void stoleOnClick()
	{
		stole.click();
	}
	

}

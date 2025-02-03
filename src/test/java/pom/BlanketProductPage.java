package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlanketProductPage 
{
	@FindBy(xpath="(//a[contains(text(),'Printed')])[13]")
	private WebElement blanket;
	
	public BlanketProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickProduct()
	{
		blanket.click();
	}


}

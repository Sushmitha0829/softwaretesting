package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FullSleeveProduct 
{
	@FindBy(id="pincode")
	private WebElement pin;
	
	@FindBy(id="check-pincode")
	private WebElement clickpin;
	
	public FullSleeveProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pincode(String num)
	{
		pin.sendKeys(num);
	}
	
	public void clickPincode()
	{
		clickpin.click();
	}

}

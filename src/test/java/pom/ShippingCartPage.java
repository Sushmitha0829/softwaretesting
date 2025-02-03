package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingCartPage 
{
	@FindBy(xpath="(//a[@aria-label='Cart'])[2]")
	private WebElement cart;
	
	public ShippingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cartIcon()
	{
		cart.click();
	}

}

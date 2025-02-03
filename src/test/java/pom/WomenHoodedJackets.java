package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenHoodedJackets 
{
	@FindBy(xpath="(//a[@class='product-item-meta__title'])[7]")
	private WebElement product;
	
	public WomenHoodedJackets(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void women()
	{
		product.click();
	}

}

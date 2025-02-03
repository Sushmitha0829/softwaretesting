package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandTowelWhisListPage 
{
	@FindBy(xpath="//div[@class='flits-product-item']")
	private WebElement item;
	
	@FindBy(xpath="//div[@class='flits-product-item-card flits-product-card flits-wishlist-card']")
	private WebElement close;
	
	public HandTowelWhisListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getItem() 
	{
		return item;
	}
	
	public void closeButton()
	{
		close.click();
	}

}

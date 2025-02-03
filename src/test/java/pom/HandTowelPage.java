package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandTowelPage 
{
	@FindBy(xpath="(//a[@data-tippy-content='Add to Wishlist'])[7]")
	private WebElement whislist;
	
	@FindBy(xpath="//span[@class='icon-title']")
	private WebElement wishlisticon;
	
	
	
	
	public HandTowelPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public void wishlistIcon()
	{
		whislist.click();
	}
	
	public void wishlistButton()
	{
		wishlisticon.click();
	}
	
	

	
	

}

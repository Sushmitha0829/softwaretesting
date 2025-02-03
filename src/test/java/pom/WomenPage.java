package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage 
{
	@FindBy(xpath="(//a[@class='   header__linklist-link link--animated'])[2]")
	private WebElement click;
	
	public WomenPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void womenClick()
	{
		click.click();
	}

}

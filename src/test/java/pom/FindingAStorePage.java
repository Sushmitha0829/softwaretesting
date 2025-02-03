package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindingAStorePage 
{
	@FindBy(id="searchInput")
	private WebElement search;
	
	@FindBy(xpath="//a[@class='directions-btn']")
	private WebElement direction;
	
	public FindingAStorePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchText(String pincode)
	{
		search.sendKeys(pincode);
	}
	public void getDirection()
	{
		direction.click();
	}

}

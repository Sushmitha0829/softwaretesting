package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValentinesDayGiftCard 
{
	@FindBy(xpath="//a[@href='/products/valentines-day-gift-card']")
	private WebElement card;
	
	public ValentinesDayGiftCard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void valentineGift()
	{
		card.click();
	}

}

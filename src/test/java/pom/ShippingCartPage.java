package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingCartPage 
{
	@FindBy(xpath="(//a[@aria-label='Cart'])[2]")
	private WebElement cart;
	
	@FindBy(xpath="//button[@class='link text--subdued']")
	private WebElement ordernote;
	
	@FindBy(name="note")
	private WebElement note;
	
	@FindBy(name="checkout")
	private WebElement checkout;
	
	public ShippingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cartIcon()
	{
		cart.click();
	}
	public void addNote()
	{
		ordernote.click();
	}
	public void textNote(String name)
	{
		note.sendKeys(name);
	}
	public void checkOut()
	{
		checkout.click();
	}

}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardDetailsPage 
{
	@FindBy(xpath="(//label[@class='block-swatch__item'])[2]")
	private WebElement amount;
	
	@FindBy(id="name")
	private WebElement receiptname;
	
	@FindBy(id="mobilenumber")
	private WebElement mobile;
	
	@FindBy(id="email")
	private WebElement mailId;
	
	@FindBy(id="message")
	private WebElement message;
	
	@FindBy(xpath="//button[text()='Buy Now']")
	private WebElement buy;
	
	@FindBy(xpath="//button[@class='drawer__close-button tap-area']")
	private WebElement close;
	
	public GiftCardDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void amountSelect()
	{
		amount.click();
	}
	public void sendReceiptName(String name)
	{
		receiptname.sendKeys(name);
	}
	public void sendNumber(String number)
	{
		mobile.sendKeys(number);
	}
	public void sendEmail(String mail)
	{
		mailId.sendKeys(mail);
	}
	public void messageText(String text)
	{
		message.sendKeys(text);
	}
	public void buyNow()
	{
		buy.click();
	}
	public void closeButton()
	{
		close.click();
	}
}

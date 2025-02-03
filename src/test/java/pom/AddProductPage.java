package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage 
{
	
	@FindBy(xpath="//a[@data-tippy-content='Add to Wishlist']")
	private WebElement addWishlist;
	
	@FindBy(xpath="//span[@class='icon-title']")
	private WebElement wishlist;
	
	@FindBy(xpath="//p[text()='Printed 100% Polyster Single Bed Comforter for AC Room']")
	private String text;
	
	@FindBy(xpath="(//label[@class='block-swatch__item'])[2]")
	private WebElement size;
	
	@FindBy(xpath="(//button[@class='quantity-selector__button'])[2]")
	private WebElement button;
	
	@FindBy(xpath="(//span[text()='Add to cart'])[2]")
	private WebElement cart;
	
	@FindBy(name="checkout")
	private WebElement checkout;
	
	@FindBy(xpath="//span[@class='ft__']")
	private WebElement productdesc;
	
	@FindBy(xpath="(//a[@class='link--faded'])[113]")
	private WebElement store;
	
	@FindBy(xpath="(//span[@class='loader-button__text'])[2]")
	private WebElement addcart;

	
	@FindBy(id="order-note-toggle")
	private WebElement note;
	
	@FindBy(id="cart[note]")
	private WebElement sendnote;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//button[@title='Close']")
	private WebElement close;
	
	@FindBy(xpath="//label[@class='block-swatch__item']")
	private WebElement womensize;
	

	public AddProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void saveButton()
	{
		save.click();
	}
	public void sendNotes(String text)
	{
		sendnote.sendKeys(text);
	}
	public void orderNote()
	{
		note.click();
	}
	public void closeButton()
	{
		close.click();
	}
	public void addProduct()
	{
		addcart.click();
	}
	
	public void ourStore()
	{
		store.click();
	}
	public void productDescription()
	{
		productdesc.click();
	}
	public void initiateCheckout()
	{
		checkout.click();
		
	}
	
	public void addWishlistIcon()
	{
		addWishlist.click();
		
	}
	public void wishlistButton()
	{
		wishlist.click();
	}
	public void selectSize()
	{
		size.click();
	}
	public void selectButton()
	{
		button.click();
	}
	public void addToCart()
	{
		cart.click();
	}
	public String getText() 
	{
		return text;
	}
	public void womenProductSize()
	{
		womensize.click();
	}
	
	

}

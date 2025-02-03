package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage 
{
	
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement add;
	
	@FindBy(xpath="(//a[@data-flits-product-title='Women Brown Self Design Stole'])[1]")
	private WebElement wish;
	
	@FindBy(xpath="//p[@class='flits-h2 flits-tingle-modal-popup-header-title']")
	private String text;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(xpath="//button[text()=' Add to Wishlist ']")
	private WebElement wishlist;
	
	@FindBy(xpath="//span[@class='flits-tingle-moda-closeIcon']")
	private WebElement close;
	
	public WishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addCart()
	{
		add.click();
	}
	
	public void wishlist()
	{
		wish.click();
	}
	
	
	public String getText() 
	{
		return text;
	}

	public void emailSent(String mail)
	{
		email.sendKeys(mail);
	}
	public void wishlistBtn()
	{
		wishlist.click();
	}
	public void closebtn()
	{
		close.click();
	}
	

	
	
	
	

}

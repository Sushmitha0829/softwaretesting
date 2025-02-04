package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccount_Page 
{
	@FindBy(xpath="(//a[@class='   header__linklist-link link--animated'])[5]")
	private WebElement homefurnishing;
	
	@FindBy(xpath="//a[text()='AC Comforter']")
	private WebElement accomforter;
	
	@FindBy(xpath="//a[@aria-controls='desktop-menu-1']")
	private WebElement men;
	
	@FindBy(xpath="//a[text()='Round Neck Sweaters']")
	private WebElement roundneck;
	
	@FindBy(xpath="(//a[contains(@class,'header')])[11]")
	private WebElement search;
	
	@FindBy(name="q")
	private WebElement text;
	
	@FindBy(xpath="(//span[@class='product-item-meta__title text--small'])[4]")
	private WebElement towel;
	
	@FindBy(xpath="//a[@aria-label='Search']")
	private WebElement searchbar;
	
	@FindBy(xpath="//button[text()='View all results']")
	private WebElement view;
	
	@FindBy(xpath="//img[@class='header__logo-image2']")
	private WebElement montehome;
	
	@FindBy(xpath="//a[text()='Addresses']")
	private WebElement address;
	
	@FindBy(xpath="(//a[@class='header__icon-wrapper tap-area '])[2]")
	private WebElement cart;
	
	@FindBy(xpath="//a[text()='Start shopping']")
	private WebElement start;
	
	
	
	
	
	public UserAccount_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void startShopping()
	{
		start.click();
	}
	public void cartIcon()
	{
		cart.click();
	}
	public void addAddress()
	{
		address.click();
	}
	
	public void monteCarloHome()
	{
		montehome.click();
	}
	
	
	

	public WebElement getHomefurnishing() 
	{
		return homefurnishing;
	}
	

	public WebElement getMen() 
	{
		return men;
	}

	public void accomforter() 
	{
		accomforter.click();
	}
	
	public void roundNeck()
	{
		roundneck.click();
	}
	
	public void searchBar()
	{
		search.click();
	}
	
	public void searchText(String name)
	{
		text.sendKeys(name);
	}
	
	public void searchTowel()
	{
		towel.click();
	}
	public void womenSearchBar()
	{
		searchbar.click();
	}
	public void viewAll()
	{
		view.click();
	}
	

	

	
	
	

}

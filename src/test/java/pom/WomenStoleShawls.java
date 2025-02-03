package pom;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenStoleShawls 
{
	@FindBy(id="filter.v.price.lte")
	private WebElement setprize;
	
	@FindBy(xpath="(//a[@data-action='clear-filters'])[3]")
	private WebElement reset;
	
	@FindBy(name="filter.v.price.gte")
	private WebElement num;
	
	@FindBy(id="filter.v.price.lte")
	private WebElement num1;
	
	@FindBy(xpath="//a[text()='Women Brown Self Design Stole']")
	private WebElement product;
	
	public WomenStoleShawls(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPrize(String number)
	{
		setprize.sendKeys(number);
		setprize.sendKeys(Keys.ENTER);
	}
	public void resetFilter()
	{
		reset.click();
	}
	public void setnum(String number1)
	{
		num.sendKeys(number1);
		num.sendKeys(Keys.ENTER);
	}
	public void setnum1(String number2)
	{
		num1.sendKeys(number2);
		num1.sendKeys(Keys.ENTER);
	}
	public void selectProduct()
	{
		product.click();
	}

}

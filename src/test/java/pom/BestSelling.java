package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSelling 
{
	@FindBy(xpath="//button[@class='popover-button hidden-pocket']")
	private WebElement sort;
	
	@FindBy(xpath="//span[text()='Date, old to new']")
	private WebElement select;
	
	@FindBy(xpath="//span[text()='Price, high to low']")
	private WebElement sortingfromhightolow;
	
	@FindBy(xpath="//a[text()='Womens Beige Printed Top']")
	private WebElement product;
	
	@FindBy(xpath="//a[contains(text(),'300 TC Cotton ')]")
	private WebElement clickproduct;
	
	public BestSelling(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sortSelling()
	{
		sort.click();
	}
	public void selectOne()
	{
		select.click();
	}
	public void sortingFromHighToLow()
	{
		sortingfromhightolow.click();
	}
	public void clickProduct()
	{
		product.click();
	}
	public void clickProductBed()
	{
		clickproduct.click();
	}

}

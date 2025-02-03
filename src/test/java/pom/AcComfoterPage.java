package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcComfoterPage 
{
	@FindBy(xpath="(//div[@class='uu_plus'])[2]")
	private WebElement size;
	
	@FindBy(xpath="//label[@class='block-swatch__item']")
	private WebElement selectingsize;
	
	@FindBy(xpath="(//div[@class='uu_plus'])[3]")
	private WebElement colour;
	
	@FindBy(xpath="//label[@class='color-swatch__item']")
	private WebElement selectingcolour;
	
	@FindBy(xpath="(//div[@class='uu_plus'])[7]")
	private WebElement brand;
	
	@FindBy(xpath="//label[text()='Monte Carlo (7)‎']")
	private WebElement montecarlo;
	
	@FindBy(xpath="(//div[@class='uu_plus'])[8]")
	private WebElement availability;
	
	@FindBy(xpath="//label[text()='In stock (7)‎']")
	private WebElement selectingavailability;
	
	@FindBy(xpath="//a[text()='Printed 100% Polyster Single Bed Comforter for AC Room']")
	private WebElement bedsheet;
	
	@FindBy(xpath="(//div[@class='uu_plus'])[9]")
	private WebElement brands;
	
	@FindBy(xpath="//label[text()='Rock.it (5)‎']")
	private WebElement rockit;
	
	@FindBy(xpath="(//label[@class='block-swatch__item'])[3]")
	private WebElement mensize;
	
	@FindBy(xpath="(//div[@class='uu_plus'])[11]")
	private WebElement sleeve;
	
	@FindBy(xpath="//label[text()='Full Sleeve (5)‎']")
	private WebElement fullsleeve;
	
	@FindBy(xpath="(//a[text()='Men Black Solid Round Neck Full Sleeve Pullover'])[2]")
	private WebElement image;
	
	
	public AcComfoterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickBrand()
	{
		brand.click();
	}
	public void monteCarlo()
	{
		montecarlo.click();
	}
	
	public void selectImage()
	{
		image.click();
	}
	public void selectFullSleeve()
	{
		fullsleeve.click();
	}
	public void clickSleeve()
	{
		sleeve.click();
	}
	
	public void clickSize()
	{
		size.click();
	}
	public void selectSize()
	{
		selectingsize.click();
	}
	public void clickColour()
	{
		colour.click();
	}
	public void selectingColour()
	{
		selectingcolour.click();
	}
	public void clickBrands()
	{
		brands.click();
	}
	public void clickAvailability()
	{
		availability.click();
	}
	public void selectAvailability()
	{
		selectingavailability.click();
	}
	public void bedSheet()
	{
		bedsheet.click();
	}
	public void selectMenSize()
	{
		mensize.click();
	}
	public void selectRockit()
	{
		rockit.click();
	}
	
}


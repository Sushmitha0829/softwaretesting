package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage 
{
	@FindBy(xpath="//button[@aria-controls='drawer-new-address']")
	private WebElement address;
	
	@FindBy(id="address-new[first_name]")
	private WebElement firstname;
	
	@FindBy(id="address-new[last_name]")
	private WebElement lastname;
	
	@FindBy(id="address-new[company]")
	private WebElement company;
	
	@FindBy(id="address-new[phone]")
	private WebElement phone;
	
	@FindBy(id="address-new[address1]")
	private WebElement address1;
	
	@FindBy(id="address-new[address2]")
	private WebElement address2;
	
	@FindBy(id="address-new[city]")
	private WebElement city;
	
	@FindBy(id="address-new[province]")
	private WebElement country;
	
	@FindBy (id="address-new[zip]")
	private WebElement zipCode;
	
	@FindBy (xpath="//label[@class='text--subdued']")
	private WebElement addresscheckBox;
	
	@FindBy (xpath ="//span[text()='Add a new address']")
	private WebElement newAddressButton;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement delete;
	
	public AddressesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void deletingAddress()
	{
		delete.click();
	}
	
	
	
	public WebElement getCountry() 
	{
		return country;
	}



	public void addingAddress()
	{
		address.click();
	}
	public void firstName(String first)
	{
		firstname.sendKeys(first);
	}
	public void lastName(String last)
	{
		lastname.sendKeys(last);
	}
	public void companyName(String cmp)
	{
		company.sendKeys(cmp);
	}
	public void phoneNumber(String num)
	{
		phone.sendKeys(num);
	}
	public void address(String address)
	{
		address1.sendKeys(address);
	}
	public void mainAddress(String address)
	{
		address2.sendKeys(address);
	}
	public void city(String cityname)
	{
		city.sendKeys(cityname);
	}
	public void newAddressButtonClick() {
		newAddressButton.click();
	}
 
	public void addresscheckBoxClick() {
		addresscheckBox.click();
	}
 
	public void zipcode(String zipcode1) {
		zipCode.sendKeys(zipcode1);
	}
	

}

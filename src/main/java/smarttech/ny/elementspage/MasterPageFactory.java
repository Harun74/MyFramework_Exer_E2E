package smarttech.ny.elementspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttech.ny.basepage.ParentClass;
import smarttech.ny.generic.CommonUtil;

public class MasterPageFactory extends ParentClass{

	// Initialization PageFactory
	public MasterPageFactory() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//input[@name ='email'])[1]")
    @CacheLookup
    private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}
	@FindBy(xpath = "//input[@name ='password']")
    @CacheLookup
    private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterEmail;
	}
	@FindBy(xpath = "(//button[@type ='submit'])[1]")
    @CacheLookup
    private WebElement clickOnLoginBTN;

	public WebElement getClinckOnLoninBTN() {
		return clickOnLoginBTN;
	}

	
	public void getLogin(String userName ,String pwd) {
		
		getEnterEmail().sendKeys("userName");
		getEnterPassword().sendKeys("pwd");
		CommonUtil.ActionClick(getClinckOnLoninBTN());
		
	     //getClinckOnLoninBTN().click();
		//Actions ac = new Actions(driver);
		//ac.click(getClinckOnLoninBTN()).build().perform();
		
		
		
		
	}
}

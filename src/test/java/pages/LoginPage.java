package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy (id="password")
	private WebElement password;
	
	@FindBy (id = "login")
	private WebElement login;
	
	public LoginPage (WebDriver driver) {
		super(driver);
		
	}
	
	public void Input()
	{
		username.sendKeys("venkatvp");
		password.sendKeys("123456");
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

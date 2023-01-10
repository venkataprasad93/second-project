package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testcases.BaseTest;

public class SelectHotel extends BaseClass {
	
	@FindBy (id = "radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id= "continue")
	private WebElement cont;
	
	public SelectHotel (WebDriver driver) {
		super(driver);
	}
	
	public void con() {
		radiobtn.click();
		cont.click();
	}

}

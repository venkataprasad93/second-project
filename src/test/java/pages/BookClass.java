package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookClass extends BaseClass {
	@FindBy(id= "first_name")
	private WebElement fname;
	
	@FindBy (id= "last_name")
	private WebElement lname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement cardno;
	
	@FindBy (id = "cc_type")
	private WebElement cardtype;
	
	@FindBy(id= "cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id ="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement book;
	
	
	public BookClass(WebDriver driver) {
		super(driver);
	}
	
	public void book () {
		fname.sendKeys("venkat");
		lname.sendKeys("prasad");
		address.sendKeys("gandhi nagar");
		cardno.sendKeys("12345678901234");
		Select s8 = new Select(cardtype);
		s8.selectByVisibleText("VISA");
		Select s9 = new Select (expmonth);
		s9.selectByValue("8");
		Select s10 = new Select (expyear);
		s10.selectByValue("2022");
		cvv.sendKeys("456");
		book.click();
	}

}

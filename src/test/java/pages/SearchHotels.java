package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchHotels extends BaseClass {
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy (id = "hotels")
	private WebElement hotels;
	
	@FindBy (id ="room_type")
    private WebElement roomtype;
	
	@FindBy(id= "room_nos")
	private WebElement roomnos;
	
	@FindBy(id = "datepick_in")
	private WebElement datein;
	
	@FindBy (id = "datepick_out")
	private WebElement dateout;
	
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	
	@FindBy (id = "child_room")
	private WebElement childroom;
	
	@FindBy(id = "Submit")
	private WebElement submit;
	
	public SearchHotels (WebDriver driver) {
		super(driver);
	}
	
	public void search() {
		Select s1 =new Select (location);
		s1.selectByVisibleText("Sydney");
		
		Select s2 = new Select (hotels);
		s2.selectByIndex(3);
		
		Select s3 = new Select (roomtype);
		s3.selectByVisibleText("Double");
		
		Select s4 = new Select (roomnos);
		s4.selectByValue("3");
		
		datein.sendKeys("05.01.2023");
		dateout.sendKeys("08.01.2023");
		
		Select s5 = new Select (adultroom);
		s5.selectByValue("2");
		
		Select s6 = new Select (childroom);
		s6.selectByValue("2");
		
		submit.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

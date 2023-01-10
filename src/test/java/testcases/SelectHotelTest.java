package testcases;

import org.junit.Test;

import pages.BookClass;
import pages.LoginPage;
import pages.SearchHotels;
import pages.SelectHotel;

public class SelectHotelTest extends BaseTest {
	LoginPage lp = new LoginPage(driver);
	SearchHotels sh = new SearchHotels(driver);
	SelectHotel si = new SelectHotel(driver);
	BookClass bc = new BookClass (driver);
	
	@Test
public void vs () {
		lp.Input();
		sh.search();
		si.con();
		bc.book();
	}
}

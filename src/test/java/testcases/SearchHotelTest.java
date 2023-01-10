package testcases;

import org.junit.Test;

import pages.LoginPage;
import pages.SearchHotels;

public class SearchHotelTest extends BaseTest {
	LoginPage lp = new LoginPage(driver);
	SearchHotels sh = new SearchHotels(driver);
	@Test
	public void select() {
		lp.Input();
		sh.search();
	}

}

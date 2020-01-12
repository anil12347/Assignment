package com.amazonandflipkart.price.comparsion.Assignment1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TripAdvisorTestCase extends BaseClass{	
	AmazonAndFlipkartPriceComparisonPages pages=new AmazonAndFlipkartPriceComparisonPages();
	ElementsRepository element=new ElementsRepository();
	TripAdvisorPages tripPages=new TripAdvisorPages();
	@BeforeMethod
	@Parameters("BrowserType")
	public void setUp(String browser) {
		initialization(browser);
	
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}
	@Test
	public void test() throws InterruptedException {
		pages.naviagteUrl(prop.getProperty("TripAdvsiorLink"));
		pages.maximizeBrowser();
		pages.click(element.searchButtonTrip);
		pages.inputText(element.mainSearchTrip, prop.getProperty("TripSearch"));
		pages.click(element.mainSearchButtonTrip);
		pages.click(element.selectListOfTrip);
		tripPages.windowOperations();
		tripPages.mouseHover(element.mousehoverTrip);	
		
		pages.inputText(element.writeTitle, prop.getProperty("writeTitle"));
		
		pages.inputText(element.writeReviewArea, prop.getProperty("reviewMessage"));
		
		tripPages.jsScroll(element.scrolltill);
		
		tripPages.mouseHover(element.hotelReview);
		pages.click(element.submitReviewCheckBox);
		pages.click(element.submitReview);
		tripPages.wdWait(2000);
	}
}

package com.amazonandflipkart.price.comparsion.Assignment1;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonAndFlipkartPriceComparisonTestcase extends BaseClass{
	AmazonAndFlipkartPriceComparisonPages pages=new AmazonAndFlipkartPriceComparisonPages();
	ElementsRepository element=new ElementsRepository();

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

	public void priceComparing() throws IOException, InterruptedException {

		pages.naviagteUrl(prop.getProperty("AmazonLink"));
		pages.maximizeBrowser();
		pages.inputText(element.searchElementAmazon,prop.getProperty("SearchKey"));
		pages.click(element.goButton);
		pages.click(element.selectProductAmazon);
		String amazonPrice=pages.switchToWindow(element.productPriceOfAmazon);
		pages.naviagteUrl(prop.getProperty("flipkartLink"));
		pages.click(element.closeFlipkart);
		pages.inputText(element.seacrhElementFlipkart, prop.getProperty("SearchKey"));
		pages.click(element.submitButtonFlipkart);
		pages.click(element.selectProductFlipkart);
		String flipkartPrice=pages.switchToWindow(element.productPriceFlipkart);

		pages.amazonComparisionFlipkart(amazonPrice,flipkartPrice);

	}


}

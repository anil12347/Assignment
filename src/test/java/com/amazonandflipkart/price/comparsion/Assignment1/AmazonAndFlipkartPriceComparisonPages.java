package com.amazonandflipkart.price.comparsion.Assignment1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class AmazonAndFlipkartPriceComparisonPages extends BaseClass{

	public void maximizeBrowser() {
		try {		
			driver.manage().window().maximize();			

		} catch (Exception e) {		
			System.out.println("Window is not maximized");

		}	
	}

	public void naviagteUrl(String url) {
		try {
			driver.get(url);
		}catch (Exception e) {
			System.out.println("Url is not navigated");
		}

	}

	public void inputText(String searchElement,String inputText) {
		try {
			driver.findElement(By.xpath(searchElement)).clear();	
			driver.findElement(By.xpath(searchElement)).click();
			driver.findElement(By.xpath(searchElement)).sendKeys(inputText);
		}catch (Exception e) {

			System.out.println("Element is not found");
		}


	}

	public void click(String clickButton) {
		try {
			driver.findElement(By.xpath(clickButton)).click();
		}catch (Exception e) {
			System.out.println("Click is not performed");
		}
	}

	public String switchToWindow(String productPrice) {
		String textElement = null;
		try {
			Set<String> handles=driver.getWindowHandles();
			Iterator<String> it=handles.iterator();
			String parentWindow=it.next();		
			String childWindow=it.next();
			driver.switchTo().window(childWindow);
			textElement=driver.findElement(By.xpath(productPrice)).getText();
			driver.close();
			driver.switchTo().window(parentWindow);

		}catch (Exception e) {
			System.out.println("Window handling is not performed");

		}
		return textElement.toString();
	}

	public String formatString(String text) {		
		String formattedText = text.replaceAll("\\\\n", "");		
		formattedText = formattedText.replaceAll(" ", "");	
		formattedText = formattedText.replaceAll(",", "");
		formattedText = formattedText.replaceAll("^\"|\"$", "");		
		formattedText = formattedText.trim();		
		return formattedText;	
	}

	public void amazonComparisionFlipkart(String amazonPrice, String flipkartPrice) {
		String amazonPriceStr=amazonPrice.substring(2,8);
		String flipkartPriceStr=flipkartPrice.substring(1);
		String amazonFormatPrice=formatString(amazonPriceStr);
		String flipkartFormatPrice=formatString(flipkartPriceStr);
		int finalAmazonPrice=Integer.parseInt(amazonFormatPrice);
		int finalFlipkartPrice=Integer.parseInt(flipkartFormatPrice);

		System.out.println(finalAmazonPrice);
		System.out.println(finalFlipkartPrice);

		if(finalAmazonPrice<=finalFlipkartPrice) {
			System.out.println("Amazon having less price as compared with flipkart");
		}else {
			System.out.println("Flipkart having less price as compared with amazon");
		}


	}
}

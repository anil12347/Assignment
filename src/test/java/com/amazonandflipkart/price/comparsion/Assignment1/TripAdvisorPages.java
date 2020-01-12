package com.amazonandflipkart.price.comparsion.Assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TripAdvisorPages extends BaseClass{
	AmazonAndFlipkartPriceComparisonPages pages=new AmazonAndFlipkartPriceComparisonPages();
	ElementsRepository element=new ElementsRepository();

	public void windowOperations() {

		try {

			switchwindow();
			jsScrollAndClick(element.writeReviewTrip);
			switchwindow();


		}catch (Exception e) {
			System.out.println("Window handling is not performed");

		}

	}

	public void switchwindow() {
		for (String subchildWindow : driver.getWindowHandles()) {

			driver.switchTo().window(subchildWindow); 
		}
	}

	public void jsScrollAndClick(String element) {
		try {			

			WebElement ele = driver.findElement(By.xpath(element));						
			JavascriptExecutor js = (JavascriptExecutor) driver;	
			js.executeScript("arguments[0].scrollIntoView();", ele);
			js.executeScript("arguments[0].click()", ele);

		} catch (Exception e) {							
			System.out.println("JS Scroll and click is not working");

		}	

	}

	public void jsScroll(String element) {
		try {			

			WebElement ele = driver.findElement(By.xpath(element));						
			JavascriptExecutor js = (JavascriptExecutor) driver;	
			js.executeScript("arguments[0].scrollIntoView();", ele);

		} catch (Exception e) {							
			System.out.println("JS click is not working");

		}	

	}

	public void mouseHover(String mousehoverTrip) throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath(mousehoverTrip));
		actions.moveToElement(slider,500,0).perform();
		slider.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;	
		
		}
	
	public void wdWait(int timeOutInMilliSeconds){
		
		try{		
			Thread.sleep(timeOutInMilliSeconds);	
			}catch(Exception e){		
				
			}		
		}
	
	}


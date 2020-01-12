package com.amazonandflipkart.price.comparsion.Assignment1;

public class ElementsRepository {
	/*
	 * Amazon FlipKart Objects
	 */
	public static String searchElementAmazon="//input[@id='twotabsearchtextbox']";
	public static String goButton="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']";
	public static String selectProductAmazon="(//*[@class='a-size-medium a-color-base a-text-normal'])[1]";
	public static String productPriceOfAmazon="//span[@id='priceblock_ourprice']";
	public static String closeFlipkart="//button[@class='_2AkmmA _29YdH8']";
	public static String seacrhElementFlipkart="//input[@placeholder='Search for products, brands and more']";
	public static String submitButtonFlipkart="//button[@type='submit']";
	public static String selectProductFlipkart="//div[@class='_3wU53n']";
	public static String productPriceFlipkart="//div[@class='_1vC4OE _3qQ9m1']";

	/*
	 * TripAdvisor Objects
	 */
	public static String searchButtonTrip="//*[contains(@class,'searchButton')]";
	public static String mainSearchTrip="//*[contains(@id,'mainSearch')]";
	public static String mainSearchButtonTrip="//*[contains(@id,'SEARCH_BUTTON_CONTENT')]";
	public static String selectListOfTrip="//span[contains(text(),'Club Mahindra Madikeri, Coorg')]";
	public static String writeReviewTrip="//a[@class='ui_button primary']";
	public static String mousehoverTrip="//span[@id='bubble_rating']";
	public static String clickOnFifth="//span[@class='ui_bubble_rating fl bubble_50']";
	
	public static  String writeTitle="//*[contains(@id,'ReviewTitle')]";
	public static String writeReviewArea="//textarea[@id='ReviewText']";
	public static String scrolltill="//div[contains(text(),'Hotel Ratings')]";
	public static String hotelReview="//span[@id='qid12_bubbles']";
	public static String submitReviewCheckBox="//input[@id='noFraud']";
	public static String submitReview="//span[contains(text(),'Submit your review')]";


}

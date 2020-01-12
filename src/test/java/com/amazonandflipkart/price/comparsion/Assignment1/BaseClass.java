package com.amazonandflipkart.price.comparsion.Assignment1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {

	public static WebDriver driver;
	public static String CHROMEDRIVER = System.getProperty("user.dir") + "/Resources/chromedriver.exe";
	public static String GECKODRIVER = System.getProperty("user.dir") + "/Resources/geckodriver.exe";
	public static String TESTDATA=System.getProperty("user.dir") + "/TestData/testData.properties";
	public static  Properties prop=new Properties();

	public static void initialization(String browser) {
		switch (browser) {
		case "Chrome":
			try {
				System.setProperty("webdriver.chrome.driver", CHROMEDRIVER);										
				driver = new ChromeDriver();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			}catch(Exception e) {
				System.out.println("Unable to load Chrome driver : "+browser);
			}
			break;
		case "Firefox":
			try {
				System.setProperty("webdriver.gecko.driver", GECKODRIVER);	
				driver= new FirefoxDriver();
			}catch (Exception e) {
				System.out.println("Unable to load firefox driver : "+browser);
			}

		}

	}
	//Calling it has instant block to access the data
	{

		try {

			FileInputStream fis= new FileInputStream(TESTDATA);

			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

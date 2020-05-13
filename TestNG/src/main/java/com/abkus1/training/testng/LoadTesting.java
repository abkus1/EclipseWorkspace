package com.abkus1.training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//--import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//--import org.testng.Assert;
//--import org.testng.AssertJUnit;

public class LoadTesting {
	WebDriver driver;
	
  @BeforeClass
	  public void startBrowser() {
	        System.setProperty("webdriver.chrome.silentOutput","true");
			System.setProperty("webdriver.chrome.driver","/Users/abhaykushwaha/chromedriver");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			driver = new ChromeDriver(chromeOptions);
		}	
  @Test
  public void validateGoogleId() throws Exception {
	  	System.out.println("Opening Browser");
		driver.get("https://www.ebay.com/");
		System.out.println("Clicking signin Link");
		driver.findElement(By.xpath("//*[@href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F']")).click();
		System.out.println("Clicking username field");
		driver.findElement(By.xpath("//input[@id='userid']")).click();
		System.out.println("Entering Username");
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("abhaykushwaha@hotmail.com");
		System.out.println("Clicking Continue");
		driver.findElement(By.xpath("//*[@id='signin-continue-btn']")).click();
		System.out.println("Clicking password field");
		driver.findElement(By.xpath("//input[@id='pass']")).click();
		System.out.println("Entering password");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Possessi@n");
		System.out.println("Clicking Signin button");
		driver.findElement(By.xpath("//button[@id='sgnBt']")).click();
	}
  
  @AfterClass
  public void closeBrowser() {
		driver.quit();
		}
}
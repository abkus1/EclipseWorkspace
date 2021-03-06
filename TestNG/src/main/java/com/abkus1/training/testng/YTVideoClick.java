package com.abkus1.training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YTVideoClick {
	WebDriver driver;
	WebDriver ChromeOptions;
	
  @BeforeMethod
	  public void startBrowser() {
	        System.setProperty("webdriver.chrome.silentOutput","true");
			System.setProperty("webdriver.chrome.driver","/Users/abhaykushwaha/chromedriver");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-notifications");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
		}	
  @Test
  public void validateGoogleId() throws Exception {
	  	System.out.println("Opening youtube.");
		driver.get("https://www.youtube.com");
		System.out.println("Clicking Sign-in.");
		driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']//yt-formatted-string[@id='text']")).click();
		System.out.println("Providing email-id.");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abkus7");
		System.out.println("Clicking next.");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		System.out.println("Providing password.");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P0ssess1@n");
		System.out.println("Clicking next.");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		System.out.println("Playing Video");
		List<WebElement> all= driver.findElements(By.id("video-title"));
		all.get(0).click();
		Thread.sleep(5000);
		System.out.println("Navigating Back");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Taarak Mehta Ka Ooltah Chashmah - तारक मेहता - Episode 1533 - 3rd November 2014");
		Thread.sleep(2000);
		System.out.println("Clicking search button");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		System.out.println("Clicking on video to play");
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer'][contains(text(),'Taarak Mehta Ka Ooltah Chashmah - तारक मेहता - Episode 1533 - 3rd November 2014')]")).click();
		Thread.sleep(6000);
		System.out.println("Liking/Unliking the video");
		driver.findElement(By.xpath("//ytd-toggle-button-renderer[1]//a[1]//yt-icon-button[1]")).click();
		Thread.sleep(2000);
		System.out.println("Subscribing to the channel");
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-subscribe-button-renderer'][contains(text(),'Subscribe')]")).click();
		Thread.sleep(2000);
		System.out.println("Scrolling down.");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		System.out.println("Writing comment on channel");
		driver.findElement(By.xpath("//yt-formatted-string[@id='simplebox-placeholder']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='contenteditable-root']")).sendKeys("Hilarious");
		Thread.sleep(2000);
		System.out.println("Clicking on comment button.");
		driver.findElement(By.xpath("//ytd-button-renderer[@id='submit-button']//a[@class='yt-simple-endpoint style-scope ytd-button-renderer']")).click();
		Thread.sleep(2000);
		System.out.println("Navigating Back");
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Clicking on Subscriptions.");
		driver.findElement(By.xpath("//yt-formatted-string[@class='title style-scope ytd-guide-entry-renderer'][contains(text(),'Subscriptions')]")).click();
		Thread.sleep(2000);
		System.out.println("Clicking on Avatar.");
		driver.findElement(By.xpath("//img[@alt='Avatar image']")).click();
		Thread.sleep(2000);
		System.out.println("Clicking Signout.");
		driver.findElement(By.xpath("//yt-formatted-string[@id='label' and text()='Sign out']")).click();
		Thread.sleep(3000);
	}
  
  @AfterMethod
  	public void closeBrowser() {
		driver.quit();
	}
}
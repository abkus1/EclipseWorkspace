import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementTryCatch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver", "/Users/abhaykushwaha/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Opening youtube.");
		driver.get("https://www.youtube.com");
		System.out.println("Clicking Sign-in.");
		driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']//yt-formatted-string[@id='text']")).click();
		System.out.println("Providing email-id.");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abkus7");
		System.out.println("Clicking next.");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Providing password.");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P0ssess1@n");
		System.out.println("Clicking next.");
		try
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		catch(StaleElementReferenceException e)
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		System.out.println("Clicking on avatar image.");
		driver.findElement(By.xpath("//img[@alt='Avatar image']")).click();
		//System.out.println("Clicking on signout button.");
		//driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
		//driver.quit();
	}

}
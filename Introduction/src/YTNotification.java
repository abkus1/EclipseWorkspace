import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YTNotification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver", "/Users/abhaykushwaha/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
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
		System.out.println("Clicking on Subscriptions.");
		driver.findElement(By.xpath("//yt-formatted-string[@class='title style-scope ytd-guide-entry-renderer'][contains(text(),'Subscriptions')]")).click();
		Thread.sleep(6000);
		System.out.println("Clicking on Avatar.");
		driver.findElement(By.xpath("//img[@alt='Avatar image']")).click();
		Thread.sleep(2000);
		System.out.println("Clicking Signout.");
		driver.findElement(By.xpath("//yt-formatted-string[@id='label' and text()='Sign out']")).click();
	}

}

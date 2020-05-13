import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class YouTube {
	WebDriver driver;
	@BeforeMethod
	public void browserlaunch()
	{
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver", "/Users/abhaykushwaha/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
	}
			@Test
				public void Login() throws InterruptedException
				{
					WebElement login= driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
					login.click();
					WebElement email=driver.findElement(By.xpath("//input[@id='identifierId']"));
					email.sendKeys("dummyselenium1992@gmail.com");
					WebElement Next= driver.findElement(By.xpath("//span[text()='Next']"));
					Next.click();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					WebDriverWait wait = new WebDriverWait(driver, 300);
					System.out.println("Providing password.");
					driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@2020");
					System.out.println("Clicking next.");
					try
					{
						driver.findElement(By.xpath("//span[text()='Next']")).click();
					}
					catch(StaleElementReferenceException e)
					{
						driver.findElement(By.xpath("//span[text()='Next']")).click();
					}
					System.out.println("Clicking Subscriptions.");
					WebElement Subscriptions = driver.findElement(By.xpath("//body/ytd-app/div[@id='content']/app-drawer[@id='guide']/div[@id='contentContainer']/div[@id='guide-wrapper']/div[@id='guide-content']/div[@id='guide-inner-content']/ytd-guide-renderer[@id='guide-renderer']/div[@id='sections']/ytd-guide-section-renderer[1]/div[1]/ytd-guide-entry-renderer[3]/a[1]"));
					Subscriptions.click();
					WebElement imageClk = driver.findElement(By.xpath("//button[@id='avatar-btn']"));
					imageClk.click();
					System.out.println("Clicking Avatar.");
					WebElement SignOut= driver.findElement(By.xpath("//yt-formatted-string[@id='label' and text()='Sign out']"));
					wait.until(ExpectedConditions.elementToBeClickable(SignOut));
					SignOut.click();
					System.out.println("Sign out");
				}
			}
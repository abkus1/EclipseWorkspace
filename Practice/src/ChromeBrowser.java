
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver", "/Users/abhaykushwaha/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Opening Facebook page.");
		driver.get("https://facebook.com");
		System.out.println("Clicking on email field and entering email-id.");
		driver.findElement(By.id("email")).sendKeys("abhaylfs.lfs6@gmail.com");
		System.out.println("Clicking on password field and entering password.");
		driver.findElement(By.id("pass")).sendKeys("Pr0cess!@n");
		System.out.println("Clicking on login button.");
		driver.findElement(By.id("u_0_b")).click();
		//driver.quit();
		}

}
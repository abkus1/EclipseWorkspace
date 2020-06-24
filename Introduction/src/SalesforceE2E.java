import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceE2E {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver", "/Users/abhaykushwaha/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediffmail.com");
		//Thread.sleep(3000);
		System.out.println("Clicking on signin button");
		//driver.findElement(By.xpath("//*[@title='Already a user? Sign in']")).click();
		driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
		System.out.println("Clicking on username");
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("username");
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("userid");
		System.out.println("Clicking on password field");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");
		System.out.println("Clicking on the submit button");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) {
		//Create driver object from Chrome
		/* Class name = X          (This is a class X),
		   X objectName = new X(); (This is how to create an object for the class X)*/
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver", "/Users/abhaykushwaha/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		driver.navigate().back();
		//driver.wait(15);
		//driver.close(); //closes current browser
		driver.quit(); //closes all the browsers opened by Selenium script
	}

}
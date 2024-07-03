package z_Bamboohr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupClass {
	public static ChromeDriver driver;

	@BeforeSuite
	public static void OpenChromebrowser() throws InterruptedException {

		String Url = "https://app.bamboohr.com/login/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("#domain")).sendKeys("onway");
		//Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.cssSelector("#lemail")).sendKeys("shresthaa775@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("9843840458@aA");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[contains(text(),'Yes, Trust this Browser')]")).click();
	}

	@AfterSuite
	public static void CloseChrombrowser() throws InterruptedException {
		Thread.sleep(20000);
		driver.quit();

	}

}

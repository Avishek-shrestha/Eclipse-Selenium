package z_Bamboohr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Report_module extends RQTimeOFF {

	@Test(priority = 5)
	public static void Add_newreport() {
		// Click on Report.
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
		// Click on Newreport.
		driver.findElement(By.xpath("//span[contains(text(),'New Report')]")).click();
		// Add report name.
		driver.findElement(By.cssSelector("#name")).sendKeys("New Report");
		// Choose fields.
		driver.findElement(By.xpath(
				"//body/div[3]/section[1]/div[1]/form[1]/fieldset[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/div[3]/section[1]/div[1]/form[1]/fieldset[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[3]"))
				.click();
		// Scroll function.
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		WebElement scrollablecontainer = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#available")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[1];", scrollablecontainer, 50);
		// choose fields.
		driver.findElement(By.xpath(
				"//body/div[3]/section[1]/div[1]/form[1]/fieldset[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[8]"))
				.click();
		driver.findElement(By.xpath(
				"//body/div[3]/section[1]/div[1]/form[1]/fieldset[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[9]"))
				.click();
		driver.findElement(By.xpath(
				"//body/div[3]/section[1]/div[1]/form[1]/fieldset[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[25]"))
				.click();

		WebElement scrollablecontainer1 = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#available")));
		JavascriptExecutor jsa = (JavascriptExecutor) driver;
		jsa.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", scrollablecontainer1);
		driver.findElement(By.xpath(
				"//body/div[3]/section[1]/div[1]/form[1]/fieldset[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'First Aid - Completed')]")).click();
		// Click save.
		driver.findElement(By.xpath("//body/footer[@id='siteFooter']/div[2]/div[1]/div[1]/button[1]")).click();
		WebDriverWait Validationmsg = new WebDriverWait(driver, Duration.ofNanos(10));
		Validationmsg.until(
				ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Report saved')]")));

	}

	@Test(priority = 6)
	public static void Delete_Report() {
		// Click on Report header.
		driver.findElement(By.cssSelector(
				"body.content-tight-top:nth-child(2) div.BhrPage-wrap:nth-child(4) div.SiteHeader-js:nth-child(1) div:nth-child(1) div:nth-child(3) header.SiteHeader.js-SiteHeader nav.SiteNavigation > a.SiteNavigation__link.SiteNavigation__link--active:nth-child(6)"))
				.click();
		// Hover and Click on Three dot option.
		Actions actions = new Actions(driver);
		WebElement hoverElement = driver.findElement(By.xpath(
				"//body[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[4]"));
		actions.moveToElement(hoverElement).perform();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement threeDotButton = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//body[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[2]/div[1]/div[1]/button[1]")));
		threeDotButton.click();
		// Click on delete.
		driver.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
		// Type confirmation msg.
		driver.findElement(By.xpath("//input[@id='confirmation-content-input']")).sendKeys("Delete");
		driver.findElement(By.xpath("//span[contains(text(),'Yes, Delete Report')]")).click();
		WebDriverWait Validationmsg = new WebDriverWait(driver, Duration.ofNanos(10));
		Validationmsg.until(
				ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Report Deleted')]")));

	}

	@Test(priority = 7)
	public static void missinginfo() {
		// Click on Newreport.
		driver.findElement(By.xpath("//span[contains(text(),'New Report')]")).click();
		// Click on save button without filling any thing.
		driver.findElement(By.xpath("//body/footer[@id='siteFooter']/div[2]/div[1]/div[1]/button[1]")).click();
		// Wait for validation massage.
		WebDriverWait Validationmsg = new WebDriverWait(driver, Duration.ofNanos(100));
		Validationmsg.until(ExpectedConditions.invisibilityOfElementLocated(
				By.xpath("//div[contains(text(),'Whoops... No worries. Please fix any missing or in')]")));
		// Click on cancel.
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();

	}

	@Test(priority = 8)
	public static void Contains_onlyreportname() {
		// Click on Newreport.
		driver.findElement(By.xpath("//span[contains(text(),'New Report')]")).click();
		// Add report name.
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Second New Report");
		// Click on save button without filling any thing.
		driver.findElement(By.xpath("//body/footer[@id='siteFooter']/div[2]/div[1]/div[1]/button[1]")).click();
		// Wait for validation massage.
		WebDriverWait Validationmsg = new WebDriverWait(driver, Duration.ofNanos(100));
		Validationmsg.until(
				ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Report saved')]")));

	}
	
	@Test(priority = 9)
	public static void Create_newfolder() {
		// Click on Report header.
				driver.findElement(By.cssSelector(
						"body.content-tight-top:nth-child(2) div.BhrPage-wrap:nth-child(4) div.SiteHeader-js:nth-child(1) div:nth-child(1) div:nth-child(3) header.SiteHeader.js-SiteHeader nav.SiteNavigation > a.SiteNavigation__link.SiteNavigation__link--active:nth-child(6)"))
						.click();
				//Click on new folder icone.
				driver.findElement(By.xpath("//body/div[@id='poRoot']/main[@id='micro-container2']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]/*[1]")).click();
		//Give new folder a name.
				//driver.findElement(By.xpath("//input[@id='Create a New Folder-Give your new folder a name-23']")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/div[14]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("This is my new folder");
		//Click on create new folder.
		driver.findElement(By.xpath("//span[contains(text(),'Create Folder')]")).click();
		//wait for validation msg.
		WebDriverWait Validationmsg = new WebDriverWait(driver, Duration.ofSeconds(5));
		Validationmsg.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[20]/div[1]/div[1]/div[1]")));
		
				
				
	}
	
}

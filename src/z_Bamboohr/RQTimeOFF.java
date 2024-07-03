package z_Bamboohr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RQTimeOFF extends SetupClass {

	@Test(priority = 1)
	public static void Past_date_req() {
		// Click the Request time off button.
		driver.findElement(
				By.xpath("//body/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]"))
				.click();
		// Enter start and end dates.
		driver.findElement(By.cssSelector("#time-off-id-start-date")).sendKeys("04/09/2024");
		driver.findElement(By.cssSelector("#time-off-id-end-date")).sendKeys("04/11/2024");
		// select the time off category
		driver.findElement(By.xpath(
				"//body/div[@id='poRoot']/main[@id='micro-container2']/div[1]/div[1]/div[2]/div[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]"))
				.click();
		driver.findElement(By.xpath("//body/div[13]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]")).click();
		// Write a note.
		driver.findElement(By.xpath(
				"//body[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/main[1]/form[1]/div[1]/div[4]/div[1]/div[2]/textarea[1]"))
				.sendKeys("Need twentyfour hour leave to balance leave data.");
		// Click on Send Request button.
		driver.findElement(By.xpath(
				"//body/div[@id='poRoot']/main[@id='micro-container2']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
	}

	@Test(priority = 2)
	public static void Timeoff() {
		// Click on home page.
		driver.findElement(By.cssSelector(
				"body.content-tight-top.employeeSection.content-tight-top.employeeSection:nth-child(2) div.BhrPage-wrap:nth-child(4) div:nth-child(1) header.SiteHeader.js-SiteHeader:nth-child(3) nav.SiteNavigation > a.SiteNavigation__link:nth-child(2)"))
				.click();
		// Click the Request time off button.
		driver.findElement(
				By.xpath("//body/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]"))
				.click();
		// Enter start and end dates.
		driver.findElement(By.cssSelector("#time-off-id-start-date")).sendKeys("07/01/2024");
		driver.findElement(By.cssSelector("#time-off-id-end-date")).sendKeys("07/03/2024");
		// select the time off category
		driver.findElement(By.xpath(
				"//body/div[@id='poRoot']/main[@id='micro-container2']/div[1]/div[1]/div[2]/div[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]"))
				.click();
		driver.findElement(By.xpath("//body[1]/div[13]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))
				.click();
		// Write a note.
		driver.findElement(By.xpath(
				"//body[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/main[1]/form[1]/div[1]/div[4]/div[1]/div[2]/textarea[1]"))
				.sendKeys("I will be taking leave for Three working days.");
		// Click on Send Request button.
		driver.findElement(By.xpath(
				"//body/div[@id='poRoot']/main[@id='micro-container2']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();

	}

	@Test(priority = 3)
	public static void edit_leave_req() {
		// Click edit button.
		driver.findElement(By.xpath(
				"//body/div[3]/section[1]/div[2]/div[2]/main[1]/div[1]/div[3]/section[1]/ul[1]/li[1]/div[1]/div[3]/div[4]/button[1]/span[1]/*[1]"))
				.click();
		// Edit the required time.
		driver.findElement(By.cssSelector("#time-off-id-end-date")).sendKeys("07/04/2024");
		// Update the note.
		WebElement noteTextarea = driver
				.findElement(By.xpath("//textarea[contains(text(),'I will be taking leave for Three working days.')]"));
		noteTextarea.sendKeys(" Plus one day.");
		// click on save button.
		driver.findElement(By.xpath(
				"//body/div[22]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"))
				.click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[contains(text(),'Time off request updated successfully')]")));

	}

	@Test(priority = 4)
	public static void missing_mandatory_field() {
		// Click on home page.
		driver.findElement(By.cssSelector(
				"body.content-tight-top.employeeSection.content-tight-top.employeeSection:nth-child(2) div.BhrPage-wrap:nth-child(4) div:nth-child(1) header.SiteHeader.js-SiteHeader:nth-child(3) nav.SiteNavigation > a.SiteNavigation__link:nth-child(2)"))
				.click();
		// Click the Request time off button.
		driver.findElement(
				By.xpath("//body/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]"))
				.click();
		// Click on Send Request button.
		driver.findElement(By.xpath(
				"//body/div[@id='poRoot']/main[@id='micro-container2']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		// wait for validation massage to be shown.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[contains(text(),'Whoops! Check that the form is filled out correctl')]")));
	}

}

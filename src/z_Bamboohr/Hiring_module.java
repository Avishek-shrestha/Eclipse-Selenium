package z_Bamboohr;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Hiring_module extends Report_module {
	
	@Test(priority = 10)
	public static void Add_jobopening() {
		//Click on Hiring.
		driver.findElement(By.xpath("//a[contains(text(),'Hiring')]")).click();
		//Click on Add job opening.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/a[1]/button[1]/span[2]")).click();
		//Fill the required info.
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Manager");
		//choose job status.
		driver.findElement(By.xpath("//div[contains(text(),'Draft')]")).click();
		driver.findElement(By.xpath("//body/div[18]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		//Hiring lead.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[19]/div[1]/div[2]/div[2]/div[1]/div[10]/div[1]/div[1]")).click();
		//Department.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[20]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]")).click();
		//Employment Type.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[21]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		//Minimum Experience.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[22]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]")).click();
		//Job location.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[2]/div[1]/label[1]")).click();
		//Location.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[23]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		//Job Description
		driver.findElement(By.cssSelector("#js-mce-message")).sendKeys("This is the job opening of manager post.");
		//Job code.
		JavascriptExecutor jso = (JavascriptExecutor) driver;
		jso.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[9]/div[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[9]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("8895");
		//Click Next.
		JavascriptExecutor jsp = (JavascriptExecutor) driver;
		jsp.executeScript("window.scrollBy(0,-300)");
		driver.findElement(By.xpath("//span[contains(text(),'Next: Application Details')]")).click();
		//Click Next Job Boards.
		driver.findElement(By.xpath("//span[contains(text(),'Next: Job Boards')]")).click();
		//Click Save Job.
		driver.findElement(By.xpath("//span[contains(text(),'Save Job')]")).click();
			
	}

	@Test (priority = 11)
	public static void Fill_Mandatoryfield_Only() {
		//Back to Hiring page.
		driver.findElement(By.xpath("//a[contains(text(),'Hiring')]")).click();
		//Click on Add job opening.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/a[1]/button[1]/span[2]")).click();
		//Fill the mandatory info only.
		//Posting Title.
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Accountant");
		//choose job status.
		driver.findElement(By.xpath("//div[contains(text(),'Draft')]")).click();
		driver.findElement(By.xpath("//body/div[18]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]")).click();
		//Hiring lead.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[19]/div[1]/div[2]/div[2]/div[1]/div[10]/div[1]/div[1]")).click();
		//Employment Type.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[20]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		//Job location.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[2]/div[1]/label[1]")).click();
		//Location.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'London, UK')]")).click();
		//Job Description
		driver.findElement(By.cssSelector("#js-mce-message")).sendKeys("This is the job opening of Accounting post.");
		//Click Next.
		JavascriptExecutor jsp = (JavascriptExecutor) driver;
		jsp.executeScript("window.scrollBy(0,-300)");
		driver.findElement(By.xpath("//span[contains(text(),'Next: Application Details')]")).click();
		//Click Next Job Boards.
		driver.findElement(By.xpath("//span[contains(text(),'Next: Job Boards')]")).click();
		//Click Save Job.
		driver.findElement(By.xpath("//span[contains(text(),'Save Job')]")).click();
						
	}
	
	@Test(priority = 12)
	public static void No_Mandatory_info() {
		//Back to Hiring page.
		driver.findElement(By.xpath("//a[contains(text(),'Hiring')]")).click();
		//Click on Add job opening.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/a[1]/button[1]/span[2]")).click();	
		//Click Next without filling any info.
		driver.findElement(By.xpath("//span[contains(text(),'Next: Application Details')]")).click();
		//Validation msg.
		WebDriverWait wot = new WebDriverWait(driver, Duration.ofSeconds(100));
		wot.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Please fix any missing or incorrect information an')]")));
		
	}
	
	@Test(priority = 13)
	public static void Check_uncheck_application_question() {
		//Click on Hiring.
		driver.findElement(By.xpath("//a[contains(text(),'Hiring')]")).click();
		//Click on Add job opening.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/a[1]/button[1]/span[2]")).click();
		//Fill the required info.
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("HR Manager");
		//choose job status.
		driver.findElement(By.xpath("//div[contains(text(),'Draft')]")).click();
		driver.findElement(By.xpath("//body/div[18]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		//Hiring lead.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[19]/div[1]/div[2]/div[2]/div[1]/div[10]/div[1]/div[1]")).click();
		//Department.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[20]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]")).click();
		//Employment Type.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[21]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		//Minimum Experience.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[22]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]")).click();
		//Job location.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[2]/div[1]/label[1]")).click();
		//Location.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[23]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		//Job Description
		driver.findElement(By.cssSelector("#js-mce-message")).sendKeys("This is the job opening of HR Manager post.");
		//Job code.
		JavascriptExecutor jso = (JavascriptExecutor) driver;
		jso.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[9]/div[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[9]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("8899");
		//Click Next.
		JavascriptExecutor jsp = (JavascriptExecutor) driver;
		jsp.executeScript("window.scrollBy(0,-300)");
		driver.findElement(By.xpath("//span[contains(text(),'Next: Application Details')]")).click();
		//Check and uncheck the option box.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/label[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/label[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[10]/div[1]/div[1]/label[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/label[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[12]/div[1]/div[1]/label[1]/span[1]/input[1]")).click();
		//Click Next Job Boards.
		driver.findElement(By.xpath("//span[contains(text(),'Next: Job Boards')]")).click();
		//Click Save Job.
		driver.findElement(By.xpath("//span[contains(text(),'Save Job')]")).click();
		
	}
	
	@Test(priority = 14)
	public static void Save_finishlater_missing_mandatoryfield() {
		//Click on Hiring.
		driver.findElement(By.xpath("//a[contains(text(),'Hiring')]")).click();
		//Click on Add job opening.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/a[1]/button[1]/span[2]")).click();
		//Fill some information.
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Supervisor");
		//Missing Job status which is mandatory.
		//Hiring lead.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.cssSelector("div.fab-MenuVessel.fab-MenuVessel--attached.fab-MenuVessel--top div.fab-MenuVessel__list div.fab-MenuList div.fab-MenuList__scrollContainer div.fab-MenuOption.fab-MenuOption--sizeMedium:nth-child(10) div.fab-MenuOption__content > div.fab-MenuOption__row")).click();
		//Missing Employment Type.
		//Job location.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[2]/div[1]/label[1]")).click();
		//Location.
		driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'London, UK')]")).click();
		//Job Description
	    driver.findElement(By.cssSelector("#js-mce-message")).sendKeys("This post of job is open to every deserving candidate.");
		//Click on Save & Finish later.
	    JavascriptExecutor jsp = (JavascriptExecutor) driver;
		jsp.executeScript("window.scrollBy(0,-300)");
	    driver.findElement(By.xpath("//body/div[3]/section[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
	    //Wait for validation msg.
	    WebDriverWait wot1 = new WebDriverWait(driver, Duration.ofSeconds(100));
		wot1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Please fix any missing or incorrect information an')]")));
	    
	}
}

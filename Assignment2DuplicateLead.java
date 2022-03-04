package Week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup webdriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//open url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize window
		driver.manage().window().maximize();
		
		driver.manage() .timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter UserName
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		//Enter  Password 
		WebElement elementpassword = driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		
		//Click on Login Button
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		
		//Click on CRM/SFA Link
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		// Click on Leads Button
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
					
		// Click on Leads Button
		WebElement elementFindLeads = driver.findElement(By.linkText("Find Leads"));
		elementFindLeads.click();
		
		//click Email
		 driver.findElement(By.xpath("//ul[@class ='x-tab-strip x-tab-strip-top']/li[3]")).click();
		 
		 //Enter Email
		 driver.findElement(By.xpath("(//input[@name ='emailAddress'])")).sendKeys("santhoshn318@gmail.com");
		 
		 //Click on find leads
		 WebElement elementFindLead = driver.findElement(By.xpath("//button[text() = 'Find Leads']"));
			elementFindLead.click();
			
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			WebElement elementfirstlead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]"));
			String leadname = elementfirstlead.getText();

			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a[1]")).click();
	
			driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

			String pagename = driver.getTitle();
			System.out.println(pagename);

			if (pagename.contains("Duplicate Lead")) {

				driver.findElement(By.className("smallSubmit")).click();
			} 
			else {
				System.out.println("Page name is not Duplicate Lead");
			}
				
				String duplicateName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();

				if (duplicateName.contains(leadname)) {
					System.out.println("Both the Name matched");
				} else {
					System.out.println("original Name and Duplicate Name did not match");
				}

				driver.close();

			}

}
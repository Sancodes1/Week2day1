package Week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
				
				//Click on phone
				driver.findElement(By.xpath("//ul[@class ='x-tab-strip x-tab-strip-top']/li[2]")).click();

				//Enter phone number
				 driver.findElement(By.xpath("(//input[@name ='phoneNumber'])")).sendKeys("9916360513");
				 
				//Click on find leads
				 WebElement elementFindLead = driver.findElement(By.xpath("//button[text() = 'Find Leads']"));
				 elementFindLead.click();
				 
				//Find name
					WebElement elementFindname = driver.findElement(By.xpath("//td[@class ='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div"));
					 String txt = elementFindname.getText();
					
					 {
						 System.out.println(txt);
					 }
					 
					 //Click on First lead
					 driver.findElement(By.xpath("//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
					 
					 //Delete
					 driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
					 
	
					// Click on Leads Button
					driver.findElement(By.linkText("Find Leads")).click();
					
					Thread.sleep(2000);
					//Enter the captured Lead Id
					
					driver.findElement(By.xpath("//div[@class ='x-form-item x-tab-item']//input")).sendKeys(txt);
					 
					
					//click on find leads
					driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
					
					Thread.sleep(3000);
					
					String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
					if (text2.equals("No records to display")) {
						System.out.println("Record is deleted successfully");
					}
					else {
						System.out.println("Record is not deleted ");
					}
					 
	}
	


}

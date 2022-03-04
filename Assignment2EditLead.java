package Week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2EditLead {

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
				
				//Enter name
				WebElement elementFindLeadfirstname = driver.findElement(By.xpath("//div[@class ='x-form-item x-tab-item'][2]//input"));
				elementFindLeadfirstname.sendKeys("santhosh");
				
				//click on find leads
				WebElement elementFindLead = driver.findElement(By.xpath("//button[text() = 'Find Leads']"));
				elementFindLead.click();
				
				WebElement elementFirstlead = driver.findElement(By.xpath("//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a"));
				elementFirstlead.click();
				
				//Get the Title of Resulting Page
				String pageTitle = driver.getTitle();
				System.out.println(pageTitle);

				if (pageTitle.contains("View Lead")) {
					System.out.println("Page Title Verified");
										
				}
				
				driver.findElement(By.xpath("(//a[@class ='subMenuButton'])[3]")).click();
				
			 driver.findElement(By.id("updateLeadForm_companyName")).clear();
				
				WebElement elementupdatename = driver.findElement(By.id("updateLeadForm_companyName"));
				elementupdatename.sendKeys("Accenture");
				
				driver.findElement(By.xpath("//input[@class ='smallSubmit']")).click();
				
				WebElement elementupdatedCompany = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
				System.out.println(elementupdatedCompany.getText());
				
				 if (elementupdatedCompany.getText().contains("Accenture")) {
						System.out.println("Company Updated as Expected");
					} else {
						System.out.println("Company not updated");

					}

					driver.close();
					
}
	}

				
				
	

	
	



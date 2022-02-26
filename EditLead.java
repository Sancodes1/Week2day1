package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//setup webdriver
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			
			//open url
			driver.get("http://leaftaps.com/opentaps/control/main");
			//maximize window
			driver.manage().window().maximize();
			
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
			
			//Click on Create Lead 
			WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
			elementCreateLead.click();
			
			//Enter CompanyName Field
			WebElement elementcreateLeadForm_companyName = driver.findElement(By.id("createLeadForm_companyName"));
			elementcreateLeadForm_companyName.sendKeys("Google");
			
			//Enter FirstName Field
			WebElement elementcreateLeadForm_firstName = driver.findElement(By.id("createLeadForm_firstName"));
			elementcreateLeadForm_firstName.sendKeys("Santhosh");
			
			//Enter LastName
			WebElement elementcreateLeadForm_lastName= driver.findElement(By.id("createLeadForm_lastName"));
			elementcreateLeadForm_lastName.sendKeys("N");
			
			//Enter FirstName(Local)
			WebElement elementcreateLeadForm_firstNameLocal= driver.findElement(By.id("createLeadForm_firstNameLocal"));
			elementcreateLeadForm_firstNameLocal.sendKeys("Santhu");
			
			//Enter Department
			WebElement elementcreateLeadForm_departmentName= driver.findElement(By.id("createLeadForm_departmentName"));
			elementcreateLeadForm_departmentName.sendKeys("QualityAssurance");
			
			//Enter Description 
			WebElement elementcreateLeadForm_description= driver.findElement(By.id("createLeadForm_description"));
			elementcreateLeadForm_description.sendKeys("Testing script");
			
			//Enter your email
			WebElement elementcreateLeadForm_primaryEmail= driver.findElement(By.id("createLeadForm_primaryEmail"));
			elementcreateLeadForm_primaryEmail.sendKeys("santhoshn318@gmail.com");
			
			//Select State/Province
			WebElement provinceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select province=new Select(provinceElement);
			province.selectByVisibleText("New York");
			
			//Click on Create Button
			WebElement elementsmallSubmit = driver.findElement(By.className("smallSubmit"));
			elementsmallSubmit.click();
			
			//Click on Edit
			driver.findElement(By.linkText("Edit")).click();
			
			//Clear Description
			driver.findElement(By.id("updateLeadForm_description")).clear();
		 
			//Fill ImportantNote Field with Any text
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("sample important note");
			
			//Click on update button 
			 driver.findElement(By.className("smallSubmit")).click();
			
			//Get the Title of Resulting Page
			System.out.println("The title is "+driver.getTitle());
			
		
			

	}

	}



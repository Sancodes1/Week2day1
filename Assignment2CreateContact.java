package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2CreateContact {

	
	public static void main(String[] args) {
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
		
		WebElement elementContact = driver.findElement(By.linkText("Contacts"));
        elementContact.click();
        
        WebElement elementcreateContact = driver.findElement(By.linkText("Create Contact"));
        elementcreateContact.click();
        
        WebElement elementfirstNameField = driver.findElement(By.id("firstNameField"));
        elementfirstNameField.sendKeys("Santhosh");
		
        WebElement elementlastNameField = driver.findElement(By.id("lastNameField"));
        elementlastNameField.sendKeys("N");
		
        WebElement elementcreateContactForm_firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
        elementcreateContactForm_firstNameLocal.sendKeys("sancodes");
		
        WebElement elementcreateContactForm_lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
        elementcreateContactForm_lastNameLocal.sendKeys("san");
        
        WebElement elementdepartmentName = driver.findElement(By.name("departmentName"));
        elementdepartmentName.sendKeys("Testing");
        
        WebElement elementdescription = driver.findElement(By.name("description"));
        elementdescription.sendKeys("Descriptionsample");
        
        WebElement elementemail = driver.findElement(By.id("createContactForm_primaryEmail"));
        elementemail.sendKeys("santhoshn318@gmail.com");
        
        WebElement provinceElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select province=new Select(provinceElement);
		province.selectByVisibleText("New York");
		
		WebElement elementsmallSubmit = driver.findElement(By.className("smallSubmit"));
		elementsmallSubmit.click();
		
		WebElement elementEdit = driver.findElement(By.linkText("Edit"));
		elementEdit.click();
		
		//Clear Description
		driver.findElement(By.id("updateContactForm_description")).clear();
	 
		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("sample important note");
        
		WebElement elementupdate = driver.findElement(By.xpath("//input[@value='Update']"));
		elementupdate .click();
		
		//Get the Title of Resulting Page
		System.out.println("The title is "+driver.getTitle());
		
	}
	
}

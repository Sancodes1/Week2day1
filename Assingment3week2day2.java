package Week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingment3week2day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup webdriver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				
				//open url
				driver.get( "https://acme-test.uipath.com/login");
				//maximize window
				driver.manage().window().maximize();
				
				driver.manage() .timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				// Enter email
				WebElement elementemail =driver.findElement(By.id("email"));
				  elementemail.sendKeys("kumar.testleaf@gmail.com");
				  
				  //Enter Password 
				  WebElement elementpasswd =driver.findElement(By.id("password"));
				  elementpasswd.sendKeys("leaf@12");
				  
				  //Click on login
				  
				  WebElement elementlogin =driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
				  elementlogin.click();
				  
				  //Get page title
				  
				  System.out.println("The title is "+driver.getTitle());
				  
				  WebElement elementlogout =driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
				  elementlogout.click();
				  
				  driver. close();
	}

	
	
		
	}



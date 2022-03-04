package Week2day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2day2Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup webdriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//open url
		driver.get(" https://en-gb.facebook.com/");
		//maximize window
		driver.manage().window().maximize();
		
		driver.manage() .timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement elementcreatenew = driver.findElement(By.linkText("Create New Account"));
		elementcreatenew.click();
		
		  WebElement elementfm =driver.findElement(By.xpath("//input[@name='firstname']"));
		  elementfm.sendKeys("Santhosh");
		  
		  WebElement elementln = driver.findElement(By.xpath("//input[@name='lastname']"));
		  elementln.sendKeys("N");
		  
		  
		  WebElement elementnumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		  elementnumber.sendKeys("9916360513");
		 
		 
		 WebElement elementpassword = driver.findElement(By.id("password_step_input"));
		 elementpassword.sendKeys("Testing");
		 
		 WebElement elementday = driver.findElement(By.name("birthday_day"));
		 Select sel = new Select(elementday);
		 sel.selectByValue("18");
		 
		  WebElement elementmonth = driver.findElement(By.xpath("//Select[@id ='month']"));
		  Select mon = new Select(elementmonth);
		  mon.selectByValue("10");
		 
		  WebElement elementyear = driver.findElement(By.xpath("//Select[@id ='year']"));
		  Select year = new Select(elementyear);
		  year.selectByValue("1994");
			/*
			 * WebElement elementmonth = driver.findElement(By.id("month")); Select mon =
			 * new Select(elementmonth); mon.selectByValue("Sep");
			 * 
			 * WebElement elementyear = driver.findElement(By.name("birthday_year")); Select
			 * year = new Select(elementyear); year.selectByValue("1994");
			 */
		 WebElement elementsex = driver.findElement(By.xpath("//input[@value='2']"));
			elementsex.click();
		 
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium jars n file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//id
		WebElement uname=driver.findElement(By.id("txtUsername"));
		uname.sendKeys("Admin");
		
		//Another way
		//By pass=By.name("txtPassword");
		//driver.findElement(pass).sendKeys("admin123");
		
		//Name
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//ClassName
		driver.findElement(By.className("textInputContainer")).click();
		
		
	}

}

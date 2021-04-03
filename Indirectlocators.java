package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indirectlocators {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium jars n file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Xpath
				driver.findElement(By.xpath("//*[@id='txtUsername']")).click();
				
				//CSS
				driver.findElement(By.cssSelector("#txtPassword")).click();
}
				
}

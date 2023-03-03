package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com"); 
        driver.manage().window().maximize();
        
        WebElement signin=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]//parent::div[@class='gb_Se']"));
        signin.click();
        
        WebElement email=driver.findElement(By.xpath("//child::input[@type='email']"));
        email.sendKeys("sudha123@gmail.com");
       
        driver.findElement(By.xpath("//child::span[contains(text(),'Next')]")).click();
	}
}

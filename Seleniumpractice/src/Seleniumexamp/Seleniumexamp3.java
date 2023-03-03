package Seleniumexamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumexamp3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com"); 
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
         
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')][1]")).click();
        
        WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("ksudhasubha@gmail.com");
        
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        
        
        if(url.contains("https://www.google.com"))
        {
        	System.out.println("PASS");
        }
        	else {
            	System.out.println("FAIL");
        }
	}
}

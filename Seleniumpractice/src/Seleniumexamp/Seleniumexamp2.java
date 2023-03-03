package Seleniumexamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumexamp2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in"); 
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
        
        WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
        email.sendKeys("ksudha@gmail.com");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        
        WebElement pass=driver.findElement(By.xpath("//input[@id='ap_password']"));
        pass.sendKeys("Sudha@456");
        
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
                
        if(url.contains("https://www.amazon.in"))
        {
        	System.out.println("PASS");
        }
        	else {
            	System.out.println("FAIL");
        }
	}
}

package Seleniumexamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumexamp4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com"); 
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement email=driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
        email.sendKeys("ksudhasubha@gmail.com");
        
        WebElement pass=driver.findElement(By.xpath("//input[@aria-label='Password']"));
        pass.sendKeys("Sudha@123");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.findElement(By.xpath("//a[@href='/accounts/password/reset/']")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();

        WebElement mobile=driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));
        mobile.sendKeys("ksudha@gmail.com");
        
        WebElement fullname=driver.findElement(By.xpath("//input[@aria-label='Full Name']"));
        fullname.sendKeys("SUDHA");
        
        WebElement user=driver.findElement(By.xpath("//input[@aria-label='Username']"));
        user.sendKeys("SUDHA KUMAR");
        
        WebElement password=driver.findElement(By.xpath("//input[@aria-label='Password']"));
        password.sendKeys("Sudha@12345");
        
        driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
        
        if(url.contains("https://www.instagram.com"))
        {
        	System.out.println("PASS");
        }
        	else {
            	System.out.println("FAIL");
        }
	}
}

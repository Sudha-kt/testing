package Seleniumexamp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitdemo {

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
        email.sendKeys("8072179255");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        
        WebElement pass=driver.findElement(By.xpath("//input[@id='ap_password']"));
        pass.sendKeys("Yuvi@12345");
        
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
        	.withTimeout(Duration.ofSeconds(30))	
        	.pollingEvery(Duration.ofSeconds(5))
        	.ignoring(NoSuchElementException.class);
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Home Improvement"))).click();        
	}
}

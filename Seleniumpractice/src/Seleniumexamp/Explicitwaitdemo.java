package Seleniumexamp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("ksudhasubha@gmail.com");
        
        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("Sudha@123");
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']"))).click();
        System.out.println("Done");
	}
}

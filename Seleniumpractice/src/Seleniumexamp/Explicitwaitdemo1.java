package Seleniumexamp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.titleContains("Facebook"));
        System.out.println(driver.getTitle());
	}
}

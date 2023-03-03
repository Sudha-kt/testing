package seleniumexample;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ClickOnSecondElement {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\YUVARAJ\\eclipse-workspace\\Seleniumpractice\\exe\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.amazon.in");
	        String title=driver.getTitle();    
	        System.out.println(title);
	        String url=driver.getCurrentUrl();
	        System.out.println(url);
	        driver.manage().window().maximize();
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
	        search1.sendKeys("oneplus mobiles",Keys.ENTER);
	        
	        String window=driver.getWindowHandle();
	        System.out.println("id= " +window);
	        
	        WebElement product1=driver.findElement(By.xpath("//img[@data-image-index='2']"));
	        product1.click();
	        driver.switchTo().window(window);
	        
	        WebElement search2=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        search2.clear();
	        search2.sendKeys("iphone",Keys.ENTER);
	        
	        WebElement product2=driver.findElement(By.xpath("//img[@data-image-index='2']"));
	        product2.click();
	        driver.switchTo().window(window);
	        
	        

	}

}

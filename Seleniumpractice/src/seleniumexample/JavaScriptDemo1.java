package seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com"); 
        driver.manage().window().maximize();
        
         JavascriptExecutor js = (JavascriptExecutor) driver;
		
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')][1]"));
        signin.click();
        
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		js.executeScript("arguments[0].setAttribute('value','ksudhasubha@gmail.com')", email);
		
		WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		next.click();
		
		String emailStr = (String) js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println("Username= "+emailStr);
	}

}

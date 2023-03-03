package seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com"); 
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		js.executeScript("arguments[0].setAttribute('value','ksudhasubha@gmail.com')", email);
		
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		js.executeScript("arguments[0].setAttribute('value','Sudha@123')", password);

		String emailStr = (String) js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println("Username= "+emailStr);
		
		String passwordStr =  (String) js.executeScript("return arguments[0].getAttribute('value')", password);
		System.out.println("Pass= "+passwordStr);

	}

}

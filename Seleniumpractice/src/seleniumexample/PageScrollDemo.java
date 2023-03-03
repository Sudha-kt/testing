package seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in"); 
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
        
        WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
        js.executeScript("arguments[0].setAttribute('value','8072179255')",email);
        		    
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        
        WebElement pass=driver.findElement(By.xpath("//input[@id='ap_password']"));
		js.executeScript("arguments[0].setAttribute('value','Yuvi@12345')",pass);

        
        WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        signin.click();
        
        //scroll by using pixel
        //Thread.sleep(3000);
        //js.executeScript("window.scrollBy(0,2000)", "");
        
        //scroll till we find am element
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //WebElement element=driver.findElement(By.xpath("//a[@href='https://www.amazonpay.in/merchant']"));
        //js.executeScript("arguments[0].scrollIntoView();",element);
        //element.click();
        
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}

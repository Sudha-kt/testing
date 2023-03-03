package Seleniumexamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumexamp1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com"); 
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//a[contains(text(),'New to Flipkart? Create an account')]")).click();
       
       WebElement mobno=driver.findElement(By.xpath("//input[@maxlength='10']"));
       mobno.sendKeys("9626260184");
       
       driver.findElement(By.xpath("//span[contains(text(),'CONTINUE')]")).click();

       driver.findElement(By.xpath("//span[contains(text(),'Forgot')]")).click();

        if(url.contains("https://www.flipkart.com"))
        {
        	System.out.println("PASS");
        }
        	else {
            	System.out.println("FAIL");
        }      
	}
}

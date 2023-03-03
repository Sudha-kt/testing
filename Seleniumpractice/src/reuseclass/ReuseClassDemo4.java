package reuseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReuseClassDemo4 extends ReuseClass {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("https://www.facebook.com");
		GetTitle();
		GetUrl();
        MaximizeWindow();         
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        WebElement day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
        day.click();
        
        SelectByValue(day,"2");
        Thread.sleep(2000);
        
        SelectByIndex(day,22);
        Thread.sleep(2000); 
        
        WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
        month.click();
        
        SelectByVisibleText(month,"Feb");
	}
}


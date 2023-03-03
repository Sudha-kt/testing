package Seleniumexamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddattributeoptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        WebElement day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
        day.click();
        
        Select select=new Select(day);
        
        select.selectByValue("2");
        Thread.sleep(2000);
        
        select.selectByIndex(22);
        Thread.sleep(2000);
                
        List<WebElement> list=select.getOptions();
        int size=list.size();
        
        for(int i=0;i<size;i++)
        {
        	WebElement Day=list.get(i);
        	String text=Day.getText();
        	System.out.println(text);
        }            
	}
	}

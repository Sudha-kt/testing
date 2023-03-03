package Seleniumexamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowntextoption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        
        WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
        year.click();
        
        Select select=new Select(year);
        
        select.selectByIndex(2);
        
        List<WebElement> list=select.getOptions();
        int size=list.size();
        
        for(int i=0;i<size;i++)
        {
        	WebElement Year=list.get(i);
        	String text=Year.getText();
        	System.out.println(text);
        }            
	}
}

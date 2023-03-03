package Seleniumexamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddalternativemonths {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        WebElement alternativemonth=driver.findElement(By.xpath("//select[@aria-label='Month']"));
        alternativemonth.click();
        
        Select select=new Select(alternativemonth);
       
        List<WebElement> list=select.getOptions();

        for(int i=0;i<select.getOptions().size();i++)
        {	
        	if(i%2==0) 
        	{
        WebElement alternative=list.get(i);
        String alternativevalue=alternative.getText();
        System.out.println(alternativevalue);
        	}
	}
	}
}

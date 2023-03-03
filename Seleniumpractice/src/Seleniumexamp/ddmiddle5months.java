package Seleniumexamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddmiddle5months {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        WebElement middlefive=driver.findElement(By.xpath("//select[@aria-label='Month']"));
        middlefive.click();
        
        Select select=new Select(middlefive);
       
        List<WebElement> list=select.getOptions();

        for(int i=((select.getOptions().size()/2)-1)-1;i<=8;i++)
        {	
        WebElement middleindex=list.get(i);
        String middlevalue=middleindex.getText();
        System.out.println(middlevalue);
	}

	}

}

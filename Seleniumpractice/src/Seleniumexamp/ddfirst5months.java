package Seleniumexamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddfirst5months {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        WebElement firstfive=driver.findElement(By.xpath("//select[@aria-label='Month']"));
        firstfive.click();
        
        Select select=new Select(firstfive);
       
        List<WebElement> list=select.getOptions();

        for(int i=select.getOptions().size()-12;i<=4;i++)
        {	
        WebElement firstindex=list.get(i);
        String firstvalue=firstindex.getText();
        System.out.println(firstvalue);
	}
}
}


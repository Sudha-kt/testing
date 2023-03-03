package seleniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlternativeRowsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        
        WebElement table=driver.findElement(By.id("customers"));
        
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        int length=rows.size();
        System.out.println("Length= " +length);
        
        for(int i=0;i<rows.size();i++)
        {	
        	if(i%2==0) 
        	{
           System.out.println(rows.get(i).getText());
        	}
	    }
	}
}

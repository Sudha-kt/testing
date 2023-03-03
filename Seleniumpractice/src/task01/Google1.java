package task01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google1 {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\YUVARAJ\\eclipse-workspace\\Seleniumpractice\\exe\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        
        WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
        search.sendKeys("Java");
                
        Select select=new Select(search);
        List<WebElement> list= select.getOptions();
        
        for(int i=0;i<select.getOptions().size();i++)
        {
        	if(i==4);
        	{
        	 WebElement element=list.get(4);
             element.click();        	   	 
        	}
        }

	}

}

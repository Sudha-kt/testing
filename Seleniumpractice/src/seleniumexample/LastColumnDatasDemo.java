package seleniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastColumnDatasDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        
        List<WebElement> country=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
        
        for(int i=0;i<country.size();i++)
        {
        	System.out.println(country.get(i).getText());
        }     
	}
}

package seleniumexample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("iphone",Keys.ENTER);
        
        String id=driver.getWindowHandle();
        System.out.println("id= " +id);
        
        WebElement phone1=driver.findElement(By.xpath("//span[text()='iPhone 14 128GB Starlight']"));
        phone1.click();
        
        WebElement phone2=driver.findElement(By.xpath("//span[text()='iPhone 14 Plus 128GB (Product) RED']"));
        phone2.click();  
        
        WebElement phone3=driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Blue']"));
        phone3.click();  
        
        WebElement phone4=driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (128GB) - Blue']"));
        phone4.click(); 
        
        WebElement phone5=driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - White']"));
        phone5.click(); 
        
        Set<String> id1=driver.getWindowHandles();
        System.out.println("id= " +id1);
        
         
         String[] values = id1.toArray(new String[id1.size()]); 
         System.out.println(id1.size());
         
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the input a: ");
         int a=sc.nextInt();
         System.out.println("The Value is : " + id1);
         driver.switchTo().window(values[a]);
      }     
	}	


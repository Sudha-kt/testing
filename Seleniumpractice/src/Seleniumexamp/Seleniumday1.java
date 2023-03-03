package Seleniumexamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday1 {

	public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com"); 
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        //WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        //email.sendKeys("ksudhasubha@gmail.com");
        
        //WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
        //password.sendKeys("Sudha@123");
        
        //WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login']"));
        //loginbutton.click();
        
        //WebElement fg=driver.findElement(By.xpath("//a[@class='_97w4']"));
        //fg.click();
                
        //driver.findElement(By.xpath("//a[@class='_9o1v']")).click();

        //driver.findElement(By.xpath("//div[@class='_9o1y']")).click();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
        firstname.sendKeys("SUDHA");
        
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("KUMAR");
        
        WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("ksudha@gmail.com");

        WebElement emailconfirmation=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        emailconfirmation.sendKeys("ksudha@gmail.com");
        
        WebElement newpass=driver.findElement(By.xpath("//input[@aria-label='New password']"));
        newpass.sendKeys("Sudha@987");
        
        WebElement day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
        day.sendKeys("23");
        
        WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
        month.sendKeys("February");
        
        WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
        year.sendKeys("1994");
        
        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        
        if(url.contains("https://www.facebook.com"))
        {
        	System.out.println("PASS");
        }
        	else {
            	System.out.println("FAIL");
                 }
        }
	
	    
}

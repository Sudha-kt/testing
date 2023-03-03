package Seleniumexamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumexamp5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ajio.com"); 
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        WebElement Signin=driver.findElement(By.xpath("//span[@class='  login-form login-modal']"));
        Signin.click();
        
        WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
        Username.sendKeys("9626260184");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement gender=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));      
        gender.click();
        
        WebElement name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
        name.sendKeys("Diya");
        
        WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("diya123@gmail.com");
        
        WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        pass.sendKeys("diya@123");
        
        WebElement code=driver.findElement(By.xpath("//input[@placeholder='Invite code (optional)']"));
        code.sendKeys("DIVYA123");
        
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        
        WebElement otp=driver.findElement(By.xpath("//input[@value='SEND OTP']"));
        otp.click();
        
        
        

	}

}

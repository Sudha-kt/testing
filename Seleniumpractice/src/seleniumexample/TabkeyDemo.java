package seleniumexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabkeyDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com"); 
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        Robot robot1=new Robot();
        robot1.keyPress(KeyEvent.VK_TAB);
        
        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("Sudha@123");
        
        WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login']"));
        loginbutton.click();
        Thread.sleep(3000);
        Robot robot2=new Robot();
        robot2.keyPress(KeyEvent.VK_ENTER);
	}
}

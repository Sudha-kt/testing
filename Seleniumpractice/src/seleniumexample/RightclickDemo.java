package seleniumexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickDemo {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        WebElement gmail=driver.findElement(By.linkText("Gmail"));
        
        Actions obj=new Actions(driver);
        obj.contextClick(gmail).perform();
        
        Robot robot1=new Robot();
        robot1.keyPress(KeyEvent.VK_DOWN);
        robot1.keyRelease(KeyEvent.VK_DOWN);

        robot1.keyPress(KeyEvent.VK_DOWN);
        robot1.keyRelease(KeyEvent.VK_DOWN);

        robot1.keyPress(KeyEvent.VK_DOWN);
        robot1.keyRelease(KeyEvent.VK_DOWN);

        robot1.keyPress(KeyEvent.VK_ENTER); 
        robot1.keyRelease(KeyEvent.VK_ENTER);
	}
}

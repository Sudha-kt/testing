package seleniumexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClickOnInspectUsingForLoop {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        String title=driver.getTitle();    
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        WebElement element=driver.findElement(By.xpath("//img[@alt='Home kitchen']"));
               
        Actions obj=new Actions(driver);
		obj.contextClick(element).perform();
		
		
		Robot robot1=new Robot();

		for(int i=1;i<=10;i++) {
				robot1.keyPress(KeyEvent.VK_ENTER);
			}
	}
}

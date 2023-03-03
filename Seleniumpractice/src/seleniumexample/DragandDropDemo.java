package seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
      
        Actions act=new Actions(driver);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        WebElement scroll=driver.findElement(By.xpath("//div[text()='Interactions']"));
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true)",scroll);
    
        WebElement interaction=driver.findElement(By.xpath("//div[text()='Interactions']"));
        js.executeScript("arguments[0].click()",interaction);
        
        WebElement droppable=driver.findElement(By.xpath("//span[text()='Droppable']"));
        js.executeScript("arguments[0].scrollIntoView(true)",scroll);
        Thread.sleep(3000);
        js.executeScript("arguments[0].click()", droppable);
        
        WebElement from=driver.findElement(By.id("draggable"));
        
        WebElement to=driver.findElement(By.id("droppable"));
        
        act.dragAndDrop(from, to).build().perform();
        
        Thread.sleep(2000);
               
	}
}

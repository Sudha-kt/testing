package Seleniumexamp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumalertdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Alert obj=driver.switchTo().alert();
        String name=obj.getText();
        System.out.println(name);
        obj.accept();
       
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
        Thread.sleep(5000);
        Alert object=driver.switchTo().alert();
        String text=object.getText();
        System.out.println(text);
        object.accept();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        Alert confirm=driver.switchTo().alert();
        String button=object.getText();
        System.out.println(button);
        confirm.dismiss();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(2000);
        Alert promt=driver.switchTo().alert();
        String message=promt.getText();
        System.out.println(message);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        promt.sendKeys("Sudha");
        Thread.sleep(3000);
	}
}

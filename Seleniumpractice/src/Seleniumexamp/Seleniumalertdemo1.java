package Seleniumexamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumalertdemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert okalert=driver.switchTo().alert();
        Thread.sleep(2000);
        String name=okalert.getText();
        System.out.println(name);
        okalert.accept();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        String text=alert.getText();
        System.out.println(text);
        alert.accept();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert textalert=driver.switchTo().alert();
        Thread.sleep(2000);
        String namee=textalert.getText();
        System.out.println(namee);
        textalert.sendKeys("Sudha");
        Thread.sleep(3000);
        textalert.accept();
	}

}



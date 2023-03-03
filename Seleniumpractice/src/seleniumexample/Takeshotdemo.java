package seleniumexample;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takeshotdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        
        DateFormat formatdate = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
        Date systemDate = new Date();
        String dateofsystem = formatdate.format(systemDate);
        System.out.println(dateofsystem);
        
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("ksudhasubha@gmail.com");
        
        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("Sudha@123");
        
        TakesScreenshot screenshot=(TakesScreenshot) driver;	
        File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);

                
        String path="./screenshot/" + dateofsystem + ".png";
        File DestFile=new File(path);
        FileUtils.copyFile(sourcefile, DestFile);
        System.out.println("Done Screenshot");
	}
}

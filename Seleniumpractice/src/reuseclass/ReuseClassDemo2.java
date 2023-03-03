package reuseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ReuseClassDemo2 extends ReuseClass {

	public static void main(String[] args) {
		LaunchBrowser("https://www.amazon.in");
		GetTitle();
		GetUrl();
        MaximizeWindow();
        
        JavaScript();
        
        WebElement search1=xpathById("twotabsearchtextbox");
        search1.sendKeys("oneplus mobiles",Keys.ENTER);
        
        
        WebElement product1=driver.findElement(By.xpath("//img[@data-image-index='2']"));
        product1.click();
        WindowHandle();
        
        WebElement search2=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search2.clear();
        search2.sendKeys("iphone",Keys.ENTER);
        
        WebElement product2=driver.findElement(By.xpath("//img[@data-image-index='2']"));
        product2.click();
        WindowHandle();
	}

}

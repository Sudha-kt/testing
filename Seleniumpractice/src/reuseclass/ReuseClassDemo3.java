package reuseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

public class ReuseClassDemo3 extends ReuseClass {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser("https://demoqa.com/alerts");
		GetTitle();
		GetUrl();
        MaximizeWindow();
        
        xpathClick("//button[@id='alertButton']");
        ConfirmAlert();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        xpathClick("//button[@id='timerAlertButton']");
        Thread.sleep(5000);
        ConfirmAlert();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        xpathClick("//button[@id='confirmButton']");
        DismissAlert();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        xpathClick("//button[@id='promtButton']");
        Alert promt=driver.switchTo().alert();
        String message=promt.getText();
        System.out.println(message);
        promt.sendKeys("Sudha");
        Thread.sleep(3000);
        promt.accept();
	}
}



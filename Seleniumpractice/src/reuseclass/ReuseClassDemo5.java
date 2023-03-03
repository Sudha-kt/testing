package reuseclass;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReuseClassDemo5 extends ReuseClass{

	public static void main(String[] args) throws AWTException {
		LaunchBrowser("https://google.com");
		GetTitle();
		GetUrl();
        MaximizeWindow();  
        
        WebElement gmail=driver.findElement(By.linkText("Gmail"));
        
        RightClick(gmail);
        
        RobotDown();
        RobotDown();
        RobotDown();
        RobotEnter();

	}

}

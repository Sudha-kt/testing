package reuseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReuseClassDemo6 extends ReuseClass{

	public static void main(String[] args) {
		LaunchBrowser("https://www.amazon.in");
		GetTitle();
		GetUrl();
        MaximizeWindow();  
        
       
	}

}

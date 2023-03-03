package reuseclass;

import org.openqa.selenium.WebElement;

public class ReuseClassDemo1 extends ReuseClass {

	public static void main(String[] args) {
		LaunchBrowser("https://www.amazon.in");
		GetTitle();
		GetUrl();
        MaximizeWindow();
        
        xpathClick("//span[@id='nav-link-accountList-nav-line-1']");
        
        WebElement email=xpath("//input[@id='ap_email']");
		SendKey(email, "ksudhasubha@gmail.com");
		
		xpathClick("//input[@id='continue']");
		
		WebElement password=xpath("//input[@id='ap_password']");
		SendKey(password,"Yuvi@12345");
		
		xpathClick("//input[@id='signInSubmit']");
		
		UrlCheck("https://www.amazon.in");
		
	}
} 


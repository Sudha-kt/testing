package seleniumexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YUVARAJ\\eclipse-workspace\\Seleniumpractice\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://makemytrip.com");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		

	}

}

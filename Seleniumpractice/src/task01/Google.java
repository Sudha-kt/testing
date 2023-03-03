package task01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\YUVARAJ\\eclipse-workspace\\Seleniumpractice\\exe\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
	
	WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
	search.sendKeys("Java");
	Thread.sleep(3000);
	
	List<WebElement> list = driver.findElements(By.xpath("//li[@data-view-type='1']"));   //(//div[@class="wM6W7d"]/span/b)[5]
	Thread.sleep(1000);
	String result = list.get(4).getText();
	WebElement resFour = list.get(4);
	resFour.click();
	System.out.println(list.size() + result);
//	String[] sas = new String[list.size()];
//	
//	for(int i=0;i<=list.size();i++) {
//		 sas[i]= list.get(i).getText();	 			
//		}
//		for (String x : sas) {
//			System.out.println(x);
//		}
//		
	
/*int count=0;
	for(WebElement element :list)
	{
	count ++;
	if(count==4)
	{
	element.click();
	}*/
	}	
}

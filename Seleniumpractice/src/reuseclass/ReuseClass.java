package reuseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReuseClass {
	
	   public static WebDriver driver;

	public static void LaunchBrowser(String URL) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        driver=new ChromeDriver();
        driver.get(URL); 
	}
	
	public static void GetTitle() {
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	
	public static void GetUrl() {
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
	}
	
	public static void MaximizeWindow() {
        driver.manage().window().maximize();
	}
	
	public static WebElement xpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public static void xpathClick(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static WebElement xpathById(String xpath) {
		return driver.findElement(By.id(xpath));
	}
	
	public static void SendKey(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	public static void ButtonClick(WebElement element) {
		element.click();
	}
	
	public static boolean TitleCheck(String title) {
		if(title.equals(driver.getTitle())) {
			return true;
		}
		else {
			return false;
		}	
	}
    
	public static boolean UrlCheck(String url) {
		if(url.contains(driver.getCurrentUrl())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void WindowHandle() {
		String window=driver.getWindowHandle();
        System.out.println(window);
		driver.switchTo().window(window);
	}
	
	public static JavascriptExecutor JavaScript() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
	}
	
	public String PageSource() {
		return driver.getPageSource();	
	}
	
	public static void QuitBrowser() {
		driver.quit();
	}
	
	public static void CloseBrowser() {
		driver.close();	
	}
	
	public static void RightClick(WebElement element) {
		Actions obj=new Actions(driver);
		obj.contextClick(element).perform();		
	}
	
	public static void JsInput(WebElement element,String input) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','input')",element);
	}
	
	public static  List<WebElement> SelectOption(WebElement element) {
		Select select=new Select(element);
        List<WebElement> list=select.getOptions();
        return list;
	}
	
	public static Select SelectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
		return select;
	}
	
	public static void ConfirmAlert() {
		Alert object=driver.switchTo().alert();
        String obj=object.getText();
        System.out.println(obj);
        object.accept();
	}
	
	public static void DismissAlert() {
		Alert object=driver.switchTo().alert();
        String obj=object.getText();
        System.out.println(obj);
        object.dismiss();
	}
	
	public static Select SelectByIndex(WebElement element, int value) {
		Select select=new Select(element);
		select.selectByIndex(value);
		return select;
	}
	
	public static Select SelectByVisibleText(WebElement element, String input) {
		Select select=new Select(element);
		select.selectByVisibleText(input);
		return select;
	}
	
	public static TakesScreenshot Screenshot() {
		TakesScreenshot screenshot=(TakesScreenshot) driver;	
        screenshot.getScreenshotAs(OutputType.FILE);
        return screenshot;
	}
	
	public static void RobotTab(Robot robot) throws AWTException {
		new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
	}
	
	public static void RobotDown() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void RobotEnter() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void ScrollByPixel(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(int,int)", "");
	}
	
	public static void ScrollTillFindAnElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
	}
	
	public static void ScrollByHeight(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	

}

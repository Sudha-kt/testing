package seleniumexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoqaForm {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\YUVARAJ\\Desktop\\Driver\\Webdriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(),'Forms')]")).click();
        
        driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
        
        WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
        firstname.sendKeys("SUDHA");

        WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
        lastname.sendKeys("KUMAR");
        
        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("ksudha@gmail.com");
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
        
        WebElement mobileno=driver.findElement(By.xpath("//input[@id='userNumber']"));
        mobileno.sendKeys("8072179255");
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement dob=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        js.executeScript("arguments[0].scrollIntoView();",dob);
        dob.click();
        
        WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        month.click();
        Select selectobj=new Select(month);
        selectobj.selectByValue("1");
        
        WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        year.click();
        Select select=new Select(year);
        select.selectByVisibleText("1994");
        
        WebElement day=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--023']"));
        day.click();
        
        WebElement subject=driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("Selenium");
        Thread.sleep(2000);
        
        WebElement hobbies=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
        hobbies.click();
        
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        address.sendKeys("Anna Nagar South Street, Attur, Salem-636109");	
        
        js.executeScript("document.body.style.zoom='50%';");
        
        Robot robot1=new Robot();
        robot1.keyPress(KeyEvent.VK_TAB);
        
        WebElement state=driver.findElement(By.id("state"));
        js.executeScript("arguments[0].click()",state);
        
        //To select the state from the dropdown
        Robot robot2=new Robot();
        robot2.keyPress(KeyEvent.VK_DOWN);
        robot2.keyPress(KeyEvent.VK_DOWN);
        robot2.keyPress(KeyEvent.VK_ENTER);

        Robot robot3=new Robot();
        robot3.keyPress(KeyEvent.VK_TAB);
        
        WebElement city=driver.findElement(By.xpath("//div[text()='Select City']"));
        js.executeScript("arguments[0].click()",city);
        
        Robot robot4=new Robot();
        robot4.keyPress(KeyEvent.VK_DOWN);
        robot4.keyPress(KeyEvent.VK_ENTER);
        
        Robot robot5=new Robot();
        robot5.keyPress(KeyEvent.VK_TAB);
        
        WebElement submit=driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click()",submit);
        robot5.keyPress(KeyEvent.VK_ENTER);              
 }
}
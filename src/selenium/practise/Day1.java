package practise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.asynchttpclient.cookie.ThreadSafeCookieStore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


//Ctrl+Shift+o -> import necessary  and unnecessary imports 
public class Day1 {
	WebDriverWait webDriverWait ;
	WebDriver driver;
	
	
	public void clickElementWhenRaed(By locators, int timeOut) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(locators)).click();
	}
	public WebElement fluientwaitElemt(By locator, int timeout,int poolingTime) {
		 FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofSeconds(poolingTime))
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.ignoring(Exception.class)
					.withMessage("--- time out is done ..emement is not found ..");

return fluentWait.until(ExpectedConditions.elementToBeClickable(locator)
);
	}
	public static void main(String[] args) throws InterruptedException {
		
		String url="https://letcode.in/windows"; 
		File file;
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("120");
		ChromeDriver driver = new ChromeDriver(co);

	
	WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	 FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
	 
//	 driver.get(url);
//		driver.navigate().to(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	
//		WebElement webElement = driver.findElement(By.xpath(""));
//	Actions actions = new Actions(driver);
//	actions.click(webElement).perform();
//	actions.moveToElement(webElement).perform();
//	actions.click().perform();
//	actions.contextClick().perform();
//	
//	int x = webElement.getRect().x;
//	int y = webElement.getRect().y;
//	
//	actions.moveToElement(webElement, x, y).perform();
//	actions.clickAndHold(webElement).perform();
//	
//	actions.dragAndDrop(webElement, webElement).perform();
//	actions.getActiveKeyboard().createKeyDown(x);
//	actions.sendKeys(Keys.ENTER);
//	actions.sendKeys(webElement,"sdfd").perform();
//	
//	
////	actions.getActiveWheel().createScroll(100, 120, 130, Duration.ofSeconds(2), WheelInput.ScrollOrigin);
//	
//	Select select = new Select(webElement);
//	
//	select.selectByIndex(0);
//	select.selectByValue("");
//	select.selectByVisibleText("");
//	boolean multiple = select.isMultiple();
//	select.deselectByIndex(0);
//	select.deselectByValue("");
//	select.deselectByVisibleText("");
//	select.deselectAll();
//	List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
//	
//	try {
//TakesScreenshot ss= ((TakesScreenshot)driver);	
//byte[] screenshotAs2 = ss.getScreenshotAs(OutputType.BYTES);
//
//	File screenshotAs = webElement.getScreenshotAs(OutputType.FILE);
//
//		FileUtils.copyFile(screenshotAs, new File("./scrrenshot/pic.png"));
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	Set<String> windowHandles = driver.getWindowHandles();
//	
//	ArrayList<String> arrayList = new ArrayList<>(windowHandles);
//	for (String string : arrayList) {
//		
//	}
	
//	System.out.println(driver.getTitle());
//	driver.findElement(By.id("multi")).click();
//	Thread.sleep(5000);
//	System.out.println(driver.getTitle());
//	String parentWindow = driver.getWindowHandle();
//	Set<String> windowHandles = driver.getWindowHandles();
//	ArrayList<String> arrayList = new ArrayList<>(windowHandles);
//	System.out.println(arrayList.size());
//	driver.navigate().back();
	
	WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
	newWindow.get("https://www.myntra.com/");
	newWindow.manage().window().maximize();
	WebDriver tabwin = newWindow.switchTo().newWindow(WindowType.TAB);
	tabwin.get("https://playwright.dev/");
	Thread.sleep(5000);
	newWindow.findElement(By.xpath("//a[@data-group='men']")).click();
	
//	WebDriver tab = driver.switchTo().newWindow(WindowType.TAB);
//	String tabwindow = tab.getWindowHandle();
//	Thread.sleep(5000);
//	
//	String windowHandle = newWindow.getWindowHandle();
//	Thread.sleep(5000);
//	
//	WebDriver tabdriver = driver.switchTo().window(tabwindow);
//	
//	WebDriver newWinDrive = driver.switchTo().window(windowHandle);
//	newWinDrive.get("https://www.myntra.com/");
//	driver.manage().window().maximize();
	
	}
}

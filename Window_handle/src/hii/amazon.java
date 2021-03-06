package hii;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebElement;

public class amazon {
	private WebDriver driver;
	private String parent;
	private String child;
    @BeforeTest
    public void launch() {
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		parent = driver.getWindowHandle();
		System.out.println("Parent window ID : "+parent);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
    }
    
    @Test
	public void amazon_order() throws InterruptedException {    	
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus nord");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'OnePlus Nord 5G (Gray Onyx, 12GB RAM, 256GB Storage)')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'OnePlus Nord 5G (Blue Marble, 12GB RAM, 256GB Storage)')]")).click();
		Set<String>allWindowHandles=driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while(iterator.hasNext())
		{
			child = iterator.next();
			//System.out.println(child);
		if(!parent.equalsIgnoreCase(child)) {
			      System.out.println("Child Window ID : "+child);
		          driver.switchTo().window(child);
		          JavascriptExecutor js = (JavascriptExecutor)driver;
		          WebElement add_cart=driver.findElement(By.id("add-to-cart-button"));
		          js.executeScript("arguments[0].scrollIntoView();", add_cart);
		          add_cart.click();
		          //Thread.sleep(4000);
		          WebElement text=driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='attachAccessoryModal_feature_div']/div[@id='attach-dss-placeholder']/div[@id='attach-desktop-sideSheet']/div[@id='attach-accessory-pane']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]"));
		          WebDriverWait wait = new WebDriverWait(driver,5);
		          wait.until(ExpectedConditions.visibilityOf(text));
		          String content=text.getText();
		          System.out.println(content);
		          Assert.assertEquals(content, "Added to Cart");
		}
		}
	}
    
    
    @AfterTest
    public void terminate() throws InterruptedException {
    	Thread.sleep(6000);
    	driver.close();
    	driver.switchTo().window(parent);
    	Thread.sleep(2000);
    	driver.close();
    }
}
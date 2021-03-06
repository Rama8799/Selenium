package cross_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross_browser {
	private WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void launch(String browser) {
    	if(browser.equalsIgnoreCase("Chrome")){
    		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    		driver= new ChromeDriver();
        }
    	else if(browser.equalsIgnoreCase("FireFox")) {
    		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
    		driver= new FirefoxDriver();
    	}
    	    	
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
	public void login() {
		
		driver.findElement(By.name("firstname")).sendKeys("San");
		driver.findElement(By.name("lastname")).sendKeys("Joe");
		driver.findElement(By.name("reg_email__")).sendKeys("rama.mi6@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rama.mi6@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ssdcspass1");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("8");
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Jul");
		new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("1989");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}
    @AfterTest
    public void terminate() throws InterruptedException {
    	//System.out.println("Hello Rama");
    	Thread.sleep(2500);
		driver.quit();
    }

}

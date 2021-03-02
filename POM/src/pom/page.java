package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class page {
	WebDriver driver;
	test obj;
    @BeforeTest
    public void setup()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://www.instagram.com/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void login() {
    	obj = new test(driver);
    	obj.setUserName("rama_8799");
    	obj.setPassword("Ram@1999");
    	obj.clickLogin();
    }
    @AfterTest
    public void terminate() throws InterruptedException {
    	Thread.sleep(30000);
    	driver.close();
    }
	

}

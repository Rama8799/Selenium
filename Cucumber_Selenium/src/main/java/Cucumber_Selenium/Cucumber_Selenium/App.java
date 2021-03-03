package Cucumber_Selenium.Cucumber_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{ WebDriver driver;
    public static void main( String[] args )
    {
       System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");    	
    }
    public void launch() {
    	driver= new ChromeDriver();
    	driver.get("https://www.facebook.com/r.php");
    	System.out.println("bxua");
   }
}

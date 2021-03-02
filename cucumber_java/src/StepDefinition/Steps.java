package StepDefinition;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				
    WebDriver driver;
     
    @Given("^Open the google chrome and launch the facebook sign up page$")				
    public void launching_facebook_signup_page() throws Throwable							
    {	  	
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    	driver= new ChromeDriver();
    	driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
     
    @When("^Enter the first name as \"([^\"]*)\" and last name as \"([^\"]*)\"$")					
    public void enter_the_firstname_and_lastname(String f_name , String l_name) throws Throwable 							
    {		
       driver.findElement(By.name("firstname")).sendKeys(f_name);
	   driver.findElement(By.name("lastname")).sendKeys(l_name);
	}
    
    @And("^Enter the email as \"(.+)\" and password as \"(.+)\"$")
    public void enter_the_email_and_password(String email , String password) throws Throwable
    {
    	driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
    }
    
    @And("^Enter the birth day as \"([^\"]*)\" and month as \"([^\"]*)\" and year as \"([^\"]*)\"$")
    public void enter_the_birth_day(String day , String month , String year) throws Throwable
    {
    	new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText(day);
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText(month);
		new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText(year);
	}
    
    @And("^Enter the gender as \"([^\"]*)\" and click the sign up button$")
    public void enter_the_gender_and_signup(String gender) throws Throwable
    { String a="Male";
    	if(gender.contains(a)) {
    		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
    	}
    	else {
    		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
    	}
		driver.findElement(By.name("websubmit")).click();
    }
    
    @Then("^You are able to create a Facebook account$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        Thread.sleep(2000);
        driver.close();
    }		

}
package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class test {
   WebDriver driver;
   By userName = By.name("username");
   By password = By.name("password");
   By loginButton = By.xpath("//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]");

   public test(WebDriver driver) {
		this.driver=driver;
	}
    
   public void setUserName(String u_name) {
	   driver.findElement(userName).sendKeys(u_name);
   }
   
   public void setPassword(String pass) {
	   driver.findElement(password).sendKeys(pass);
   }
   
   public void clickLogin() {
	   driver.findElement(loginButton).click();
   }

}

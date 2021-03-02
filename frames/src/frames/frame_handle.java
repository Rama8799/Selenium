package frames;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_handle {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 List<WebElement> iFrameElements = driver.findElements(By.tagName("iFrame"));
		 int noOfFrames = iFrameElements.size();
		 System.out.println(noOfFrames);
		 for(WebElement element: iFrameElements) {
			 System.out.println(element.getText());
		 }
		 driver.close();
	}

}

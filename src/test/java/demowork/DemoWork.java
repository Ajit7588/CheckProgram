package demowork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWork 
{
	 @Test
	  public void flipkart() 
	  {
		  
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions option=new ChromeOptions();
		  option.addArguments("--remote-allow-origins=*");
		  WebDriver driver=new ChromeDriver(option);
		  
		  driver.get("https://www.flipkart.com");
		  
		  
		  
		  System.out.println("Ajit kumar Tung");
		  

		  
	  }
}

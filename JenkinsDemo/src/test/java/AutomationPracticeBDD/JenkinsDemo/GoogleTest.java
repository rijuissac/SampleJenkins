package AutomationPracticeBDD.JenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
	@Test
	public void TC01() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		  WebDriver myD=new ChromeDriver();
		  myD.get("https://www.google.com/");
		  Thread.sleep(4000);
		  System.out.println(myD.getTitle());
		  myD.close();
		
	}

}

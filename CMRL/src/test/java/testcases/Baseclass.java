package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.Dimension;  
import org.testng.annotations.BeforeClass;

public class Baseclass {
    
    public String BaseURL = "https://ganeshvana-cmrl-august-staging-14993916.dev.odoo.com/web?debug=1#action=menu&cids=1";
    public String username = "admin";
    public String password = "admin";
    public String username1 = "dharmaraj.g@cmrl.in";
    public String password1 = "admin";
    public String username2 = "test";
    public String password2 = "admin";
    public static WebDriver driver; 
	
	

	
	@BeforeClass()
	public void setup()
	{

		System.getProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Driver\\chromedriver-win64\\chromedriver.exe");	
		 driver = new ChromeDriver();
		 
		 long startTime = System.currentTimeMillis();
		 
		 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.get("https://ganeshvana-cmrl-august-staging-14993916.dev.odoo.com/web?debug=1#action=menu&cids=1");
		
		//long endTime = System.currentTimeMillis();

        // Calculate the duration (endTime - startTime)
        //long totalTime = endTime - startTime;

        // Print out the execution time
        //System.out.println("Total time taken to run the test: " + totalTime + " Seconds");
		
	}
}





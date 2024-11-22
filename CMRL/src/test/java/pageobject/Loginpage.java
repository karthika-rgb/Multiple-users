package pageobject;
 
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
 
public class Loginpage {

	
	//to initialize the webdriver 
WebDriver ldriver;
WebDriver driver;
	public  Loginpage(WebDriver rdriver) 
{
ldriver=rdriver;	
PageFactory.initElements(rdriver, this);
	}

//xpath
	
	//path for login name
	 @FindBy(name="login")
		WebElement txtUserName;

	 
		//path for password
		@FindBy(name="password")
		WebElement txtPassword;
		
		
		//path for clicking submit button
		 @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
		 WebElement txtsubmit;

		 
		 //to close popup
		 @FindBy(how = How.XPATH, using = "//i[@class='oi oi-close']")
		 WebElement popup;
		 
		 
		 //to click subscription module
		 @FindBy(how = How.XPATH, using = "//*[@id=\"result_app_6\"]")
		 WebElement subscription;
		 
		 //to click new button
		 @FindBy(how = How.XPATH, using = "//div[@class='o_control_panel_main_buttons d-flex gap-1 d-empty-none d-print-none']")
		 WebElement newbutton;
		 
		 
		 //to click customer field
		 @FindBy(how = How.XPATH, using = "//input[@id='partner_id_0']")
		 WebElement customer;
		 
		 
		 //to select customer name
		 @FindBy(id="partner_id_0_0_0")
		WebElement  Testcustomer;
		 
		 
		 //to select recurring plan
		 @FindBy(how = How.XPATH, using = "//*[@id='plan_id_0']")
		  WebElement rp;
	     @FindBy(id="plan_id_0_0_4")
		 WebElement mr;

	     
	     //to click years field
			 @FindBy(how = How.XPATH, using = "//*[@id='year_id_0']")
			 WebElement years;

			 //select years
			 @FindBy(id="year_id_0_0_2")
			 WebElement years1;

			 
			 //select date
			 @FindBy(how = How.XPATH, using = "//*[@id=\"date_start_0\"]")
			 WebElement date;
			 
			 
			 @FindBy(how = How.XPATH, using = "//input[@id='quarter_id_0']")
			 WebElement Quarter;
			 @FindBy(id="quarter_id_0_0_1")
				WebElement Quartersel;
			 @FindBy(how = How.XPATH, using = "//input[@id='duplicate_0']")
			 WebElement Maintanance;
			 @FindBy(name="action_confirm")
				WebElement confirm;
			 @FindBy(how = How.XPATH, using = "//button[@class='dropdown-toggle py-1 py-lg-0']")
			 WebElement close;
			 @FindBy(how = How.XPATH, using = "//a[@data-menu='logout']")
			 WebElement logout;

			 //action methods

			 public void loginTest(String uname, String pwd) {
				 txtUserName.sendKeys(uname);
				 txtPassword.sendKeys(pwd);
			 }

 
		
		 public void submit()
		 {
			 txtsubmit.click();
		 }
 
		 
		 public void popup() { 

			 try { 

			 popup.click(); 

			 System.out.println("Popup clicked successfully."); 

			 } catch (Exception e) { 

			 } 

			 } 

 
		 public void sub()
		 {
			subscription.click();
		 }
		 public void newbutton()
		 {
			 newbutton.click();
		 }

		 public void customer()
		 {
			 customer.click();
		 }
		 public void Testcustomer()
		 {
			 Testcustomer.click();
		 }
		 public void rp()
		 {
			rp.click();
		 }
		 public void monthlyreport()
		 {
			mr.click();
		 }
		 public void years(int year)
		 {
			years.click();
		 }
		 public void years(String date)
		 {   
			years.sendKeys("01/01/24");
		 }
		 public void years1()
		 {
			years1.click();
		 }

		 public void date()
		 {
			date.click();
			date.sendKeys("01/01/2024");
		 }
		 public void Quarter()
		 {
			 Quarter.click();
		 }
		 public void Quartersel()
		 {
			 Quartersel.click();
		 }
		 public void Maintanance()
		 {
			 Maintanance.click();
		 }
		 public void confirm()
		 {
			confirm.click();
		 }
		 public void close()
		 {
			close.click();
		 }
		 public void logout()
		 {
			logout.click();
		 }
 
 
}
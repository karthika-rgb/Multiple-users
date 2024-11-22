package testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageobject.Loginpage;

public class TC_LoginTest_001 extends Baseclass {
	
	//only test methods
	
	
@Test	 
public void loginTest()
{
	driver.get(baseURL);
 Loginpage lp= new Loginpage(driver);
 lp.setUserName(username);
 lp.setPassword(password);
 lp.submit();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
 lp.back();
 lp.sales();
 lp.close();
 
 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 //new button
 lp.newbutton();
 
 //customer name
 lp.cname();
 lp.nclick();
 
 //add prod
 lp.product();
 lp.cproduct();
 lp.sproduct();
 
 //save
 lp.save();
 
 //confirm
 lp.confirmo(); 
 
 //delivery
 lp.delivery();
 //3rd
 lp.third();
 
 
 lp.createinvoice();
 lp.enteramount();
 lp.draftinvoice();
 lp.confirm();
 lp.clogout();
 lp.logout();
 

}
}

1. click the button






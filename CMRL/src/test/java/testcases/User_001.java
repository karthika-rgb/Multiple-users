package testcases;
 
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import pageobject.Loginpage;
 
 
public class User_001 extends Baseclass{

	
	//call the data provider with name
@Test(dataProvider="LoginData")
	public void loginTest(String uname, String pwd) throws  IOException, InterruptedException
	{
		 
	//object created to call the methods
		Loginpage lp= new Loginpage(driver);
		
		
		//called uname & pwd
	   lp.loginTest(uname, pwd);
	 
	   
	   //take screenshot of login page
	   //File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 
	 	//FileUtils.copyFile(src, new File("E:\\CMRL\\New folder\\"+ System.currentTimeMillis() + "screenshot.png"));
		
	   
	   //submit button
	   lp.submit();
		
	   
	   //to close popup 
		Thread.sleep(1000);
		lp.popup();
		
		//to click subscription
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"result_app_6\"]")));
		
		//Thread.sleep(2000);
        lp.sub();
        
        //to click new button
        Thread.sleep(2000);
       lp.newbutton();
       
       
       //to click customer field
       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='partner_id_0']")));
    	
		//Thread.sleep(2000);
		lp.customer();
		
		//to select customer
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	       WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("partner_id_0_0_0")));
		
		lp.Testcustomer();
		Thread.sleep(2000);
		
		//to click confirm button
		lp.confirm();
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 
	 //to click the logout menu 
		lp.close();
		
		//click logout
		Thread.sleep(2000);
		lp.logout();
		
		
	}



//data provider to  store all un & pwd  
@DataProvider(name = "LoginData")
public String[][] getData() {
return new String[][]{
  {"admin", "admin"},
  {"test", "admin"},
  
    };
}
}

//concept to store all un & pwd in single excel sheet

	 // @DataProvider(name = "LoginData")
	 // public Object[][] getData() {
	        // Path to the Excel file
	 // String excelFilePath = "E:\\CMRL\\New folder\\Test data.xlsx";
	 // Object[][] data = null;
 
	 //  XSSFWorkbook workbook = null;
//			FileInputStream fileInputStream = null;
//			try {
//	        	fileInputStream = new FileInputStream(new File(excelFilePath));
//	            workbook = new XSSFWorkbook(fileInputStream);
//	            
//	            // Get the first sheet
//	            XSSFSheet sheet = workbook.getSheetAt(0);
//	            int rowCount = sheet.getPhysicalNumberOfRows();
//	            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
//
//	            // Initialize the data array
//	            data = new Object[rowCount - 1][colCount]; //skip the header row.
//
//	            // Loop through all rows in the sheet starting from the second row (index 1)
//	            for (int i = 1; i < rowCount; i++) {
//	                Row row = sheet.getRow(i);
//	                for (int j = 0; j < colCount; j++) {
//	                    Cell cell = row.getCell(j);
//	                    if (cell.getCellType() == CellType.STRING) //Reads string values
//	                    {
//	                        data[i - 1][j] = cell.getStringCellValue();
//	                    } 
// else {
//	                        data[i - 1][j] = "";
//	                    }
//	                }
//	            }
//
//	        } catch (IOException e) {
//	            e.printStackTrace(); //debug if an error occurs while reading the file
//	        } finally {
//	            // Close resources in the finally block
//	            try {
//	                if (workbook != null) {
//	                    workbook.close();
//	                }
//	                if (fileInputStream != null) {
//	                    fileInputStream.close();
//	                }
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	            }
//	        }
//
//	        return data;
//	    }
//	}
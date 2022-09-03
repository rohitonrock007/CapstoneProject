package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;


@Listeners(TestNgListenerClass.class)
public class LoginTest extends BaseClass {
	
	
	//
//		WebDriver driver;
	//	
//		@BeforeMethod
//		public void setup() {
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//			
//			driver = new ChromeDriver();
//			//WebDriver driver = new FirefoxDriver();
//			
//			driver.get("https://www.simplilearn.com/");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//			
//		}
	//	
//		@AfterMethod
//	    public void teardown() {
//	    	
//	    	driver.quit();
//			
//			
//		}
		
		@Test
		public void LoginFailiureTest() {
			
//			test = report.startTest("LoginFailiureTest");
			
			LoginPage login = new LoginPage();
			
			login.LoginFunction("xyz@gmail.com","Abc@12345");
			
			WebElement ErrorMsg = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div")); 
			
			String ActualMsg = ErrorMsg.getText();
			String ExpMsg = "Username and Password is invalid!";
			
			Assert.assertEquals(ActualMsg, ExpMsg);//hard assertion
			
//			report.endTest(test);
			
//			if(ActualMsg.equals(ExpMsg)) {
//				System.out.println("TC Passed");
//			}else {
//				System.out.println("TC Failed");
			}
			
		@Test
		public void LoginSucessTest() {
			test = report.startTest("LoginSucessTest");
			LoginPage login = new LoginPage();
			login.LoginFunction("abc@gmail.com", "1234");
			
			WebElement Paracetamol = driver.findElement(By.xpath("//*[contains(@class, 'col-md-9')]/div[3]/div/div/h5"));
			
			JavascriptExecutor obj = (JavascriptExecutor) driver;
			obj.executeScript("arguments[0].scrollIntoView();", Paracetamol);

			WebElement View = driver.findElement(By.xpath("//*[contains(@class, 'col-md-9')]/div[3]/div/div/div/a"));
						View.click();
						
			WebElement Addtocart = driver.findElement(By.xpath("//*[contains(@class, 'btn-success')]"));
			Addtocart.click();
			
//			WebElement Logout = driver.findElement(By.xpath("//a[text()='Logout']"));
//			Logout.click();
//			
//			System.out.println("Logout  "+ Logout.getText());
//			Select Logout1 = new Select(Logout);    //DropDown
//			Logout1.selectByVisibleText("Logout");	
//			
						report.endTest(test);

		}
		@Test
		@Parameters({"Param1","Param2"})
		public void ParameterizedTest(String UserNameVal, String PasswordVal) {
//			test = report.startTest("ParameterizedTest");
			LoginPage login = new LoginPage();
			login.LoginFunction(UserNameVal,PasswordVal);		
//			report.endTest(test);
		
		}
//		@Test
//	public void ExternalDataTest() {
//////			test = report.startTest("ExternalDataTest");
//				String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
//				String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
//		
//				LoginPage login = new LoginPage();
//				login.LoginFunction(UserNameVal,PasswordVal);	
////				report.endTest(test);
//	}

		
	}





package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {

WebDriver driver=BaseClass.driver;
	
	ExtentTest test = BaseClass.test;
	
	//=============WebElement=============Page Factory====
	@FindBy(id="login")
	WebElement LoginLink;
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[3]/div/input[2]")
	WebElement LoginBtn;
	
//	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/img")
//	WebElement Paracetamol;
	
	
	
	
//	@FindBy(xpath="//*[contains(@class, 'col-md-9')]/div[3]/div/div/div/a")
//	WebElement View;

	
	//constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
public void LoginFunction(String UserNameval, String Passwordval) {
		
		//============function===========
	/*WebElement LoginLink = driver.findElement(By.id("login"));
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.id("username"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginBtn = driver.findElement(By.className("btn btn-primary"));
		
	 */
		
	LoginLink.click();
	test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	UserName.sendKeys(UserNameval);
	test.log(LogStatus.PASS, "Enter UserName", "Name Entered successfully");
	Password.sendKeys(Passwordval);
	test.log(LogStatus.PASS, "Enter Password", "Password Entered successfully");
	LoginBtn.click();
	test.log(LogStatus.PASS, "Click on Loginbtn", "Loginbtn clicked successfully");
	


//	test.log(LogStatus.PASS, "Click on Paracetamol", "Paracetamol selected successfully");
//	Paracetamol.click();
	
	
//	test.log(LogStatus.PASS, "Click on Paracetamol", "Paracetamol clicked successfully");
//	View.click();

}

//public void UICheck() {
//	WebElement UserName = driver.findElement(By.name("user_login"));
//	
//}

}



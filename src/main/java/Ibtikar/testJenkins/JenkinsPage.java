package Ibtikar.testJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JenkinsPage extends PageBase
{
	public JenkinsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "ctl00_CPHContainer_txtUserLogin")
	WebElement emailTxtField;
	
	@FindBy(id = "ctl00_CPHContainer_txtPassword")
	WebElement passwordTxtField;
	
	@FindBy(id = "ctl00_CPHContainer_btnLoginn")
	WebElement loginBtn;
	
	@FindBy(id = "ctl00_CPHContainer_lblOutput")
	WebElement errorTxtView;
	
	public void loginMethod(String email, String password) {
		emailTxtField.sendKeys(email);
		passwordTxtField.sendKeys(password);
		loginBtn.click();
	}
	
	public String getErrorMsg() {
		return errorTxtView.getText();
	}
}

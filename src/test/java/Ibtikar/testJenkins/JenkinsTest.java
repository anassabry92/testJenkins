package Ibtikar.testJenkins;

import static org.junit.Assert.assertEquals;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JenkinsTest extends TestBase{
	
	private String url		= "http://www.testyou.in/Login.aspx";
	private String email	= "test@test.com";
	private String password = "123456789";
	private String resMsg 	= "You have not activate your account. Please first active your account from verification link. A verification link has been sent to your email,\n"
			+ "if you haven't got it yet then either check your spam or click here to resend it!!!";
	
	@BeforeTest
	public void openBrowser() {
		openMyBrowser(url);
	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testLoginMethod(){
		JenkinsPage jp = new JenkinsPage(driver);
		jp.loginMethod(email, password);
		assertEquals(jp.getErrorMsg(), resMsg);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
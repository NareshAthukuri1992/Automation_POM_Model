import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	public void testLogin() {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin");
		lp.clickLogin();
		
	}
	@AfterClass
	 public void tearDown() {
		driver.quit();
		
	}

}

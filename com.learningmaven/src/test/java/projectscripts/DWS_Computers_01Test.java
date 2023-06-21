package projectscripts;

import org.testng.annotations.Test;

import com.genericlibrary.Base_Test;
import com.pomrepository.ComputersPage;
import com.pomrepository.DesktopPage;
import com.pomrepository.LoginPage;
import com.pomrepository.WelcomePage;

public class DWS_Computers_01Test extends Base_Test {
	@Test
	public void addComputerToCartTest()
	{
	WelcomePage wc=new WelcomePage(driver);
	wc.clickLogin();
    
    LoginPage lp=new LoginPage(driver);
    lp.enterEmail("praveen222nayak@gmail.com");
    lp.enterPassword("abcd@123");
    lp.clickLoginButton();
    
    wc.clickComputers();
    
    ComputersPage cp=new ComputersPage(driver);
    cp.clickDesktopsLink();
    
    DesktopPage dp=new DesktopPage(driver);
    dp.clickAddToCartCheapComputer();
    
	}
}

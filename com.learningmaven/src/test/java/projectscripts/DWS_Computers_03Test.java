package projectscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.genericlibrary.Base_Test;
import com.pomrepository.BuildYourOwnComputerPage;
import com.pomrepository.ComputersPage;
import com.pomrepository.DesktopPage;
import com.pomrepository.LoginPage;
import com.pomrepository.WelcomePage;

public class DWS_Computers_03Test extends Base_Test{
	@Test
	public void verifyError()
	{
	   WelcomePage wc=new WelcomePage(driver);
	   wc.clickLogin();
	   
	   LoginPage lp=new LoginPage(driver);
	   lp.enterEmail("rakesh411@gmail.com");
	   lp.enterPassword("Rakesh@123");
	   lp.clickLoginButton();
	   
	   wc.clickComputers();
	   
	   ComputersPage cp=new ComputersPage(driver);
	   cp.clickDesktopsLink();
	   
	   DesktopPage dp=new DesktopPage(driver);
	   dp.clickBuildYourOwnComputerLink();
	   
	   BuildYourOwnComputerPage Byocp=new BuildYourOwnComputerPage(driver);
	   Byocp.clickAddToCartButton();
	   
	   SoftAssert sc=new SoftAssert();
	   sc.assertEquals(Byocp.getTitle(),"Build your own computer");
	   sc.assertAll();
	}
}

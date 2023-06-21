package projectscripts;

import org.testng.annotations.Test;

import com.genericlibrary.Base_Test;
import com.pomrepository.ComputersPage;
import com.pomrepository.DesktopPage;
import com.pomrepository.LoginPage;
import com.pomrepository.WelcomePage;

public class DWS_Computers_06Test extends Base_Test{
	
	@Test
	public void listViewOfComputers()
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
		 dp.viewAs("List");		
	}

}

package projectscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.genericlibrary.Base_Test;
import com.pomrepository.ComputersPage;
import com.pomrepository.DesktopPage;
import com.pomrepository.EliteDesktopPCPage;
import com.pomrepository.LoginPage;
import com.pomrepository.WelcomePage;

public class DWS_Computers_09Test extends Base_Test {
	@Test
	public void emailAFriend()
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
		 dp.clickEliteDesktopPCLink();
		 
		 EliteDesktopPCPage Edp=new EliteDesktopPCPage(driver);
		 Edp.clickEmailAFriendButton();
		 
		 SoftAssert sa=new SoftAssert();
		 sa.assertEquals(Edp.getTitle(), "Demo Web Shop. Email A Friend. Elite Desktop PC");
		 sa.assertAll();
	}

}

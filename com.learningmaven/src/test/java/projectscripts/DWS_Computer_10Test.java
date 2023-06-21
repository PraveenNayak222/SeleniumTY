package projectscripts;

import org.testng.annotations.Test;

import com.genericlibrary.Base_Test;
import com.pomrepository.ComputersPage;
import com.pomrepository.DesktopPage;
import com.pomrepository.EliteDesktopPCPage;
import com.pomrepository.EmailAFriendPage;
import com.pomrepository.LoginPage;
import com.pomrepository.WelcomePage;

public class DWS_Computer_10Test extends Base_Test{
	
	@Test
	public void verifyEmailSent()
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
		 
		 EmailAFriendPage Eaf=new EmailAFriendPage(driver);
		 Eaf.EnterFriendmail("praveen222nayak@gmail.com");
		 Eaf.EnterYourmail("rakesh411@gmail.com");
		 Eaf.clickSendEmailButton();
		 
	}
	

}

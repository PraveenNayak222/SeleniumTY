package projectscripts;

import org.testng.annotations.Test;

import com.genericlibrary.Base_Test;
import com.pomrepository.BuildYourOwnComputerPage;
import com.pomrepository.ComputersPage;
import com.pomrepository.DesktopPage;
import com.pomrepository.LoginPage;
import com.pomrepository.ShoppingCartPage;
import com.pomrepository.WelcomePage;

public class DWS_Computer_02Test extends Base_Test {
	
	@Test
	public void verifyCheckOutPageTest() throws InterruptedException
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
		
		Thread.sleep(2000);
		DesktopPage dp=new DesktopPage(driver);
		dp.clickBuildYourOwnComputerLink();
		
		BuildYourOwnComputerPage Byocp=new BuildYourOwnComputerPage(driver);
		Byocp.selectHdd();
		
		Byocp.clickAddToCartButton();
		Byocp.clickShoppingCartLink();
		
		ShoppingCartPage Scp=new ShoppingCartPage(driver);
		Scp.clickCheckBox();
		Scp.selectCountry("India");
		Scp.AcceptTermsOfService();
		Scp.ClickCheckOutButton();
	}
}

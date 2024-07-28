package MainProjectTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import MainProjectPages.Addcart;
import MainProjectPages.Comparison;
import MainProjectPages.EditParameters;
import MainProjectPages.GearFunctionality;
import MainProjectPages.LoginPage;
import MainProjectPages.Order;
import MainProjectPages.SearchFunctionality;
import MainProjectPages.UpdateCart;

public class DemoLogin {
	 
		WebDriver driver;
		@BeforeSuite
		public void launchBrowser()
		{
			System.out.println("Brwoser launched");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@AfterSuite
		public void closebrowser()
		{
			System.out.println("Browser closed");
			driver.close();
		}

	    @Test(priority=1)
	    public void login() 
	    {	   
		LoginPage lp=new LoginPage(driver);
		lp.openApplication();		
	    }
	    @Test(priority=2)
	    public void Addcartt()
	    {	    	
		Addcart ad=new Addcart(driver);
		ad.carts();
	    }
	    @Test
	    public void ordered()
	    {	    	
		Order a=new Order(driver);
		a.ordeItem();
	    }
	    @Test
	    public void upcart() throws InterruptedException
	    {
		UpdateCart aa=new UpdateCart(driver);
		aa.deletes();
	    }
	    @Test
	    public void Edit() throws InterruptedException
	    {	    	
		EditParameters ed=new EditParameters(driver);
		ed.updates();
	    }
	    @Test
	    public void search() throws InterruptedException
	    {
		SearchFunctionality sf=new SearchFunctionality(driver);
		sf.search();
	    }
	    @Test
	    public void Gear() throws InterruptedException
	    {	    	
		GearFunctionality g=new GearFunctionality(driver);
		 g.bag();
	    }
	    @Test
	    public void comp() throws InterruptedException
	    {	    	
        Comparison c=new Comparison(driver);
        c.comparisons();
	    }

	
}


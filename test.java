package basic01;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.Loginvtigerpage;

public class test {
	
	@Test
	
	public void vtiger() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\practice.properties");
		Properties p = new Properties();
		p.load(fis);
	    String BROWSER = p.getProperty("url");
	    
	    if(BROWSER.equals("CHROME")) {
	    	driver = new ChromeDriver();
	    }else if(BROWSER.equals("Firefox")) {
	    	driver = new FirefoxDriver();
	    }else {
	    	driver = new EdgeDriver();
	    }
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String URL = p.getProperty("url");
		String NAME = p.getProperty("campnameName");
		String SPONSOR = p.getProperty("Sponsor");
		String TARGET = p.getProperty("targetaudience");
		String TARGETSIZE = p.getProperty("targetsize");
		String DATE = p.getProperty("date");
		String NUMSENTS = p.getProperty("numsent");
		String ESC = p.getProperty("expectedsalescount");
		String SRC = p.getProperty("expectedresponsecount");
		String ASC = p.getProperty("actualsalescount");
		String ARC = p.getProperty("actualresponsecount");
		String DESCRIPTION = p.getProperty("description");
		String BUGETCOST = p.getProperty("budgetcost");
		String EROI = p.getProperty("expectedroi");
		String AROI = p.getProperty("actualroi");
		String ACTUALCOST = p.getProperty("actualcost");
		String REVENUES = p.getProperty("expectedrevenue");
		String ADMINISTRATORDEMO = p.getProperty("assignedto");
		
		driver.get(URL);
		
		Loginvtigerpage lvp = new Loginvtigerpage();
		PageFactory.initElements(driver, lvp);
		lvp.getSigninbtn().click();
		lvp.getThreeline().click();
		Thread.sleep(2000);
		Actions  a = new Actions(driver);
		a.moveToElement(lvp.getMarketing()).perform();
		lvp.getCompaigns().click();
		lvp.getAddcampaigns().click();
		lvp.getCampaingsname().sendKeys(NAME);
		lvp.getTarget().sendKeys(TARGET);
		lvp.getSponsor().sendKeys(SPONSOR);
		lvp.getTargetsize().sendKeys(TARGETSIZE);
		lvp.getDate().sendKeys(DATE);
		lvp.getDate().sendKeys(Keys.ENTER);
		lvp.getNumsents().sendKeys(NUMSENTS);
		lvp.getExpectedsalescount().sendKeys(ESC);
		lvp.getExpectedresponsecount().sendKeys(SRC);
		lvp.getActualsalescount().sendKeys(ASC);
		lvp.getActualresponsecount().sendKeys(ARC);
		lvp.getDescription().sendKeys(DESCRIPTION);
		lvp.getBudgetcosts().sendKeys(BUGETCOST);
		lvp.getExpectedroi().sendKeys(EROI);
		lvp.getActualrois().sendKeys(AROI);
		lvp.getActualcosts().sendKeys(ACTUALCOST);
		lvp.getExpectedrevenues().sendKeys(REVENUES);
		lvp.getSavebt().click();
			    }
}


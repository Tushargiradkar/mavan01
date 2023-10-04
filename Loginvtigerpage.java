package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginvtigerpage {
	
	@FindBy
	(xpath="//button[text()='Sign in']")
	private WebElement signinbtn;
	
	@FindBy
	(xpath="(//span[@class='app-icon fa fa-bars'])[1]")
	private WebElement threeline;
	
	@FindBy
	(xpath="//span[text()=' MARKETING']")
	private WebElement marketing;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	public WebElement getThreeline() {
		return threeline;
	}

	public WebElement getMarketing() {
		return marketing;
	}
	@FindBy
	(xpath="//span[text()=' Campaigns']")
	private WebElement compaigns;

	public WebElement getCompaigns() {
		return compaigns;
	}
	
	@FindBy
	(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addcampaigns;

	public WebElement getAddcampaigns() {
		return addcampaigns;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_campaignname")
	private WebElement campaingsname;

	public WebElement getCampaingsname() {
		return campaingsname;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_sponsor")
	private WebElement sponsor;

	public WebElement getSponsor() {
		return sponsor;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_targetaudience")
	private WebElement targetaudiences;

	public WebElement getTarget() {
		return targetaudiences;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_targetsize")
	private WebElement targetsize;

	public WebElement getTargetaudiences() {
		return targetaudiences;
	}

	public WebElement getTargetsize() {
		return targetsize;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_closingdate")
	private WebElement date;

	public WebElement getDate() {
		return date;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_numsent")
	private WebElement numsents;

	public WebElement getNumsents() {
		return numsents;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement expectedsalescount;

	public WebElement getExpectedsalescount() {
		return expectedsalescount;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_expectedresponsecount")
	private WebElement expectedresponsecount;

	public WebElement getExpectedresponsecount() {
		return expectedresponsecount;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_actualsalescount")
	private WebElement actualsalescount;

	public WebElement getActualsalescount() {
		return actualsalescount;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_actualresponsecount")
	private WebElement actualresponsecount;

	public WebElement getActualresponsecount() {
		return actualresponsecount;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_description")
	private WebElement description;

	public WebElement getDescription() {
		return description;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_budgetcost")
	private WebElement budgetcosts;

	public WebElement getBudgetcosts() {
		return budgetcosts;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_expectedroi")
	private WebElement expectedroi;

	public WebElement getExpectedroi() {
		return expectedroi;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_actualroi")
	private WebElement actualrois;

	public WebElement getActualrois() {
		return actualrois;
	}
	
	@FindBy
	(id="Campaigns_editView_fieldName_actualcost")
	private WebElement actualcosts;

	public WebElement getActualcosts() {
		return actualcosts;
	}
	@FindBy
	(id="Campaigns_editView_fieldName_expectedrevenue")
	private WebElement expectedrevenues;

	public WebElement getExpectedrevenues() {
		return expectedrevenues;
	}
	
	@FindBy
	(id="(//span[text()='Vtiger Demo Administrator'])[2]")
	private WebElement Administrators;

	public WebElement getAdministrators() {
		return Administrators;
	}
	
	@FindBy
	(id="s2id_autogen1")
	private WebElement autogens;

	public WebElement getAutogens() {
		return autogens;
	} 
	
	@FindBy
	(id="Vtiger Demo Administrator")
	private WebElement Administratordemo;

	public WebElement getAdministratordemo() {
		return Administratordemo;
	}
	
	@FindBy
	(id="(//div[@class='select2-container inputElement select2'])[1]")
	private WebElement inputelements;

	public WebElement getInputelements() {
		return inputelements;
	}

		
	@FindBy
	(xpath="//button[text()='Save']")
	private WebElement Savebt;

	public WebElement getSavebt() {
		return Savebt;
	}
	

}

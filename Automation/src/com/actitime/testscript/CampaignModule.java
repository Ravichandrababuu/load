package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CampaignModule extends BaseClass{
    @Test(priority = 1,enabled = true,groups = {"smokeTesting","regressionTesting"})
	public void createCampaign() {
	 Reporter.log("CreateCampaign",true);
	}
    @Test(invocationCount = 2,groups = "regressionTesting")
    public void editCampaign() {
    	Reporter.log("editCampaign",true);
    }
    @Test(priority = 1,groups = "regressionTesting")
    public void deleteCampaign() {
    	Reporter.log("deleteCampaign",true);
    }
}

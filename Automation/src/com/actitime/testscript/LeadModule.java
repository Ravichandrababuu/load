package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class LeadModule extends BaseClass {

	@Test(priority = 1,groups = {"regressionTesting","smokeTesting"})
	public void createLead() {
		Reporter.log("createLead",true);
	}
	@Test(dependsOnMethods = "createLead",groups = "regressionTesting")
	public void editLead() {
		Reporter.log("editLead",true);
	}
	@Test(dependsOnMethods = {"createLead","editLead"},enabled = false,groups = "regressionTesting")
	public void deleteLead() {
		Reporter.log("deleteLead",true);
	}
	
}

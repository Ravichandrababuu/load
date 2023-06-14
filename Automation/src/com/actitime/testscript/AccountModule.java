package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class AccountModule extends BaseClass{

    @Test(priority = 1,groups = {"smokeTesting","regressionTesting"})
	public void createAccount() {
	 Reporter.log("createAccount",true);
    }
    @Test(dependsOnMethods = "createAccount",groups = "regressionTesting")
    public void editAccount() {
    	Reporter.log("editAccount",true);
    }
    @Test(priority = 1,dependsOnMethods = {"createAccount","editAccount"},groups = "regressionTesting")
    public void deleteAccount() {
    	Reporter.log("deleteDelete",true);
    }
}

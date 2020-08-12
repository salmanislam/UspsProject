package bdd.usps.utilities;

import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public void afterAction(){
		//SetupDrivers.tearDownDriver();
		System.out.println("----------");
	}

}
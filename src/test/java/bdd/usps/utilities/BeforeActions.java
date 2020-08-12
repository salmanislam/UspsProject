package bdd.usps.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before
	public void beforeActions(Scenario scen) {
		System.out.println(">> Initializing Chrome Driver");
		SetupDrivers.setupDriver();
		System.out.println(scen.getName());
//		Logger log = LogManager.getLogger(BeforeActions.class);
//		log.info("This is info");
//		log.error("This is error");
//		log.warn("This is warn");
//		log.fatal("This is fatal");
	}

}
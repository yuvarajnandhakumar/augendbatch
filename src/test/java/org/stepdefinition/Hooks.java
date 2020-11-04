package org.stepdefinition;

import org.commonaction.Commonaction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonaction{

	
	@Before  //feature- pre condition
	public void beforefeature()
	{
		launch();
	}
	
	@After
	public void afterfeature()
	{
		driver.quit();
	}
}

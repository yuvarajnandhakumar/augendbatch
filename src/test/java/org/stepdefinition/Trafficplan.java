package org.stepdefinition;

import org.commonaction.Commonaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Trafficplan extends Commonaction{

	
	@When("user click on traffic plan")
	public void user_click_on_traffic_plan() {
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

}

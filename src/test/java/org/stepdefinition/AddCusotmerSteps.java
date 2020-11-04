package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.commonaction.Commonaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.TelecomPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCusotmerSteps extends Commonaction{

	TelecomPage tp = new TelecomPage();


	@Given("user enters url")
	public void user_enters_url() throws InterruptedException {
		url("http://www.demo.guru99.com/telecom/");
	}

	@When("user click on Telecom add customer")
	public void user_click_on_Telecom_add_customer() throws InterruptedException {

		clk(tp.getAddcustomer());
		waittime();  waittime();
		System.out.println("add customer is clicked");	
		waittime();
		waittime();
		frameindex(0); 
		clk(tp.getCloseBtn());
		waittime();
		defcon(); 
		waittime();
	}

	@Then("user fills the value")
	public void user_fills_the_value() throws InterruptedException {

		insert(tp.getFirstname(), "yuvaraj");
		waittime();
		mouseover(tp.getSubmit());
		clk(tp.getSubmit());


	}




	@Then("user fills the value using onedimlist")
	public void user_fills_the_value_using_onedimlist(DataTable onelist) throws InterruptedException {
		
		//insert(tp.getFirstname(), "yuvaraj");
		List<String> oneD = onelist.asList();
		insert(tp.getFirstname(), oneD.get(0));
		waittime();
	}

	@Then("user fills the value using onedimmap")
	public void user_fills_the_value_using_onedimmap(DataTable onemap) throws InterruptedException {
		//insert(tp.getFirstname(), "yuvaraj");
		
		Map<String, String> oneDMap = onemap.asMap(String.class, String.class);
		insert(tp.getFirstname(), oneDMap.get("fname"));

		waittime();
	}

	@Then("user fills the value using twodimlist")
	public void user_fills_the_value_using_twodimlist(DataTable twolist) throws InterruptedException {
		
		//insert(tp.getFirstname(), "yuvaraj");
		List<List<String>> twodlist = twolist.asLists();
		insert(tp.getFirstname(), twodlist.get(1).get(2));

		waittime();
	}

	@Then("user fills the value using twodimmap")
	public void user_fills_the_value_using_twodimmap(DataTable twodimmap) throws InterruptedException {
		
		//insert(tp.getFirstname(), "yuvaraj");
		List<Map<String, String>> twodmap = twodimmap.asMaps(String.class, String.class);
		insert(tp.getFirstname(), twodmap.get(2).get("lname"));

		waittime();
	}
	
	
	@Then("user fills the value {string},{string},{string}")
	public void user_fills_the_value(String firstn, String lastn, String emailadd) throws InterruptedException {
		insert(tp.getFirstname(), firstn);
		waittime();

	}


}

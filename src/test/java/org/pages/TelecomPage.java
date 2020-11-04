package org.pages;


import java.util.List;

import org.commonaction.Commonaction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class TelecomPage extends Commonaction{
	
	public TelecomPage() 
	{	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="fname") 	
	private WebElement firstname;
	
	@FindBy(name="submit") 	
	private WebElement submit;
	
	@FindBy(xpath="//h3/a[text()='Add Customer']") 
	private WebElement addcustomer;
	
	@FindBy(id="closeBtn") 
	private WebElement closeBtn;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getAddcustomer() {
		return addcustomer;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

}

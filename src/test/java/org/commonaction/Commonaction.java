package org.commonaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonaction {
	
	
	
	public static WebDriver driver;

	public void launch()  {

		WebDriverManager.chromedriver().setup();  //recent
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome launced by webdriver manager");

	}
	
	public void frameindex(int n) throws InterruptedException
	{
		driver.switchTo().frame(n);
		Thread.sleep(2000);
	}
	
	public void frameid(String id) throws InterruptedException
	{
		driver.switchTo().frame(id);
		Thread.sleep(2000);
	}
	
	public void frameid(WebElement ele) throws InterruptedException
	{
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
	}
	
	public void defcon()
	{
		driver.switchTo().defaultContent();
	}
	
	public void waittime() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	public void url(String url) throws InterruptedException
	{
		driver.get(url);
		String text= driver.getCurrentUrl();
		System.out.println(text);
		Thread.sleep(4000);
		System.out.println("url launched");
	}
	
	
	public void mouseover(WebElement ele) throws InterruptedException
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
		Thread.sleep(1000);
	}
	
	public void insert(WebElement ele,String value)
	{
		ele.sendKeys(value);	
	}
	
	
	public void clk(WebElement ele)
	{
		ele.click();
	}
	

}

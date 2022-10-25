package com.osa.steps;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.delete.browser.Browser;
import com.delete.browser.WebElementLocator;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Common_Steps {
public WebDriver dr;
@Given("^I am on osa homepage$")
public void i_am_on_osa_homepage(DataTable table) throws Throwable {
	List <List <String>> data=table.raw();
	 dr= Browser.openBrowser(data.get(0).get(1));
	 dr.get(data.get(1).get(1));
}

@And("^I click on \"([^\"]*)\"$")
public void i_click_on(String arg1, DataTable table) throws Throwable {
	List <List <String>> data=table.raw(); 
	WebElementLocator.myClick(dr, data.get(0).get(0), data.get(0).get(1));
}
@And("^I enter \"([^\"]*)\"$")
public void i_enter(String arg1, DataTable table) throws Throwable {
	List <List <String>> data=table.raw(); 
	WebElementLocator.typeValue(dr, data.get(0).get(0), data.get(0).get(1),data.get(0).get(2)); 
}


}

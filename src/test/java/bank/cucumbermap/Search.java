package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search 
{
	
	@When("^user click on Branches Button webpage navigate on Branches dropdown menu$")
	public void user_click_on_Branches_Button_webpage_navigate_on_Branches_dropdown_menu() throws Throwable 
	{
		Object [] input5=new Object[1];
		input5[0]="//*[@src='images/Branches_but.jpg']";
		Hashtable <String,Object> input5op=SeleniumOperations.Click(input5);
		HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"^user click on Branches Button webpage navigate on Branches dropdown menu$",input5op.get("MESSAGE").toString() );
	}

	@When("^user select \"([^\"]*)\" as country$")
	public void user_select_as_country(String name) throws Throwable 
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@name='lst_countryS']";
		input7[1]=name;
		
		Hashtable <String,Object> input7op=SeleniumOperations.Dropdown(input7);
		HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(),"^user select \"([^\"]*)\" as country$",input7op.get("MESSAGE").toString() );
	}
	

	@When("^user select \"([^\"]*)\" as state$")
	public void user_select_as_state(String name) throws Throwable
	{
		Object[] input8=new Object[2];
		input8[0]="//*[@name='lst_stateS']";
		input8[1]=name;
		
		Hashtable <String,Object> input8op=SeleniumOperations.Dropdown(input8);
		HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(),"^user select \"([^\"]*)\" as state$",input8op.get("MESSAGE").toString() );
	}

	@When("^user select \"([^\"]*)\" as city$")
	public void user_select_as_city(String name) throws Throwable 
	
	{
		Object[] input9=new Object[2];
		input9[0]=" //*[@name='lst_cityS']";
		input9[1]=name;
		
		Hashtable <String,Object> input9op=SeleniumOperations.Dropdown(input9);
		HTMLReportGenerator.StepDetails(input9op.get("STATUS").toString(),"^user select \"([^\"]*)\" as city$",input9op.get("MESSAGE").toString() );
	}

	@When ("^user click on Search Button to find out Branches$")
	public void user_click_on_Search_Button_to_find_out_Branches() throws Throwable
	{
		Object[] input10=new Object[1];
		input10[0]=" //*[@name='btn_search']";
		
		Hashtable <String,Object> input10op=SeleniumOperations.Click(input10);
		HTMLReportGenerator.StepDetails(input10op.get("STATUS").toString(),"^user click on Search Button to find out Branches$",input10op.get("MESSAGE").toString() );
	}


}

package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login
{
	@When("^user Opens \"([^\"]*)\" browser using exe file \"([^\"]*)\"$")
	public void user_Opens_browser_using_exe_file(String brwsername, String exefile) throws Throwable 
	{
		Object[] inputparameters=new Object[2];
		inputparameters[0]=brwsername;
		inputparameters[1]=exefile;
		SeleniumOperations.Browser_Launch(inputparameters);

	}

	@When("^user open url \"([^\"]*)\"$")
	public void user_open_url(String surl) throws Throwable 
	{
		Object[] input=new Object[1];
		input[0]=surl;
		SeleniumOperations.Open_Application(input);

	}

	@When("^user Enters \"([^\"]*)\" as Username$")
	public void user_Enters_as_Username(String usname) throws Throwable 
	{
		Object[] input1=new Object[2];
		input1[0]="//*[@id='txtuId']";
		input1[1]=usname;
		Hashtable <String,Object> input1op=SeleniumOperations.SendKey(input1);
		HTMLReportGenerator.StepDetails(input1op.get("STATUS").toString(), "^user Enters \"([^\"]*)\" as Username$", input1op.get("MESSAGE").toString());

	}

	@When("^user Enters \"([^\"]*)\" as Password$")
	public void user_Enters_as_Password(String pswd) throws Throwable 
	{
		Object[] input2=new Object[2];
		input2[0]=" //*[@id='txtPword']";
		input2[1]=pswd;
		Hashtable <String,Object> input2op=SeleniumOperations.SendKey(input2);
		HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(), "^user Enters \"([^\"]*)\" as Password$",input2op.get("MESSAGE").toString() );

	}

	@When("^User Clicks on Login Button$")
	public void user_Clicks_on_Login_Button() throws Throwable 
	{
		Object[] input3=new Object[1];
		input3[0]=" //*[@id='login']";
		Hashtable <String,Object> input3op=SeleniumOperations.Click(input3);
		HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(), "^User Clicks on Login Button$",input3op.get("MESSAGE").toString() );


	}

	/*@Then("^user is on main page showig Welcome message$")
	public void user_is_on_main_page_showig_Welcome_message() throws Throwable 
	{
		Object[] input4=new Object[1];
		Hashtable <String,Object> input4op=	SeleniumOperations.Validation(input4);
		HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(), "^User Clicks on Login Button$",input4op.get("MESSAGE").toString() );

	}*/

}

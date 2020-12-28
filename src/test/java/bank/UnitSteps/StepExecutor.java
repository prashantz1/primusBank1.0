package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor 
{
	
	public static void main(String[] args) 
	{
		//Browser Launch
		Object[] inputparameters=new Object[2];
		inputparameters[0]="Chrome";
		inputparameters[1]="D:\\Prashant\\Automation support\\chromedriver.exe";
		SeleniumOperations.Browser_Launch(inputparameters);
		
		//Open Application
		Object[] input=new Object[1];
		input[0]="http://primusbank.qedgetech.com/";
		SeleniumOperations.Open_Application(input);
		
		//Enter Username
		Object[] input1=new Object[2];
		input1[0]="//*[@id='txtuId']";
		input1[1]="Admin";
		SeleniumOperations.SendKey(input1);
		
		//Enter Password
		Object[] input2=new Object[2];
		input2[0]=" //*[@id='txtPword']";
		input2[1]="Admin";
		SeleniumOperations.SendKey(input2);
		
		//Click on Login
		Object[] input3=new Object[1];
		input3[0]=" //*[@id='login']";
		SeleniumOperations.Click(input3);
		
		//Validation-New WebPage Open--->Main Page
		Object[] input4=new Object[1];
		SeleniumOperations.Validation(input4);
		
		//Click on Branches
		Object [] input5=new Object[1];
		input5[0]="//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.Click(input5);
		
		//Validation-New WebPage Open--->Dropdown Menu
		Object [] input6=new Object[1];
		SeleniumOperations.Validation(input6);
		
		//Select Country 
		Object[] input7=new Object[2];
		input7[0]="//*[@name='lst_countryS']";
		input7[1]="UK";
		SeleniumOperations.Dropdown(input7);
		
		//Select State
		Object[] input8=new Object[2];
		input8[0]="//*[@name='lst_stateS']";
		input8[1]="England";
		SeleniumOperations.Dropdown(input8);
		
		//Select City
		Object[] input9=new Object[2];
		input9[0]=" //*[@name='lst_cityS']";
		input9[1]="Ely";
		SeleniumOperations.Dropdown(input9);
		
		//Click on Search
		Object[] input10=new Object[1];
		input10[0]=" //*[@name='btn_search']";
		SeleniumOperations.Click(input10);
		
		
	}
	

}

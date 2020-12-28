package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{

public static WebDriver driver=null;
public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();

	//Browser Launch
public static  Hashtable<String,Object> Browser_Launch(Object[]inputparameters)
	{ 
	try
	{
	
		String strbrwsr=(String) inputparameters[0];
		String strexe=(String) inputparameters[1];
		
		if(strbrwsr.equalsIgnoreCase("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver", strexe);
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		
		else if(strbrwsr.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", strexe);
			
			driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+inputparameters[0].toString());
	} 
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+inputparameters[0].toString());
	}
	
	return outputParameters;
		
	}
	
	
	
	//Open Application
	
	public static Hashtable<String,Object> Open_Application(Object[]input)
	{
		try
		{
		String strurl=(String) input[0];
		
		driver.get(strurl);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		
		outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+input[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			
			outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+input[0].toString());
		}
		return outputParameters;
	}
	
	
	
    //Click Method
	public static Hashtable<String,Object>  Click(Object[] input1)
	{
		String xpath1=(String) input1[0];
		
		WebElement abc= driver.findElement(By.xpath(xpath1));
		
		abc.click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
        outputParameters.put("STATUS", "PASS");
		
		outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+input1[0].toString());
		
		return outputParameters;
	}
	
	
	// Dropdown Method
	public static Hashtable<String,Object> Dropdown(Object[] input2)
	{
		try 
		{
		String xpath2=(String) input2[0];
		
		String name= (String) input2[1];
		
		Select dd=new Select(driver.findElement(By.xpath(xpath2)));
		
		dd.selectByVisibleText(name);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        outputParameters.put("STATUS", "PASS");
		
		outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+input2[0].toString());
		
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			
			outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+input2[0].toString());
		}
		
		return outputParameters;
	}
	
	
	//SendKey Method
	public static Hashtable<String,Object> SendKey(Object[]input3)
	{
		try
		{
		String xpath3=(String) input3[0];
		
		String send= (String) input3[1];
		
		WebElement abc=driver.findElement(By.xpath(xpath3));
		
		abc.clear();
		
		abc.sendKeys(send);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
        outputParameters.put("STATUS", "PASS");
		
		outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+input3[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			
			outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+input3[0].toString());
		}
		
		return outputParameters;
		
	}
	
	
	//Validation Method
	public static Hashtable<String,Object> Validation(Object[]input4)
	{
		try
		{
		String ab =driver.getTitle();
		String abc=driver.getCurrentUrl();
		
		System.out.println(ab);
		System.out.println(abc);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		 outputParameters.put("STATUS", "PASS");
			
		 outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+input4[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "PASS");
			
			outputParameters.put("MESSAGE", "Action:Browser Launch ,Input Given:"+input4[0].toString());
		}
		return outputParameters;
	}
}

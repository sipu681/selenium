package com.hrms.framework;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
public class TC002_Add_Emp {

	//public static void main(String[] args) 
	@Test
	public void tc002()
	{
		DOMConfigurator.configure("log4j.xml"); 
	  General obj = new General();
	  obj.openApplication();
	  obj.login();
	  obj.enterFrame();
	  obj.addEmp("sipu","nayak");
	  obj.existFrame();
	  obj.logout();
	  obj.closeApplication();
	  
	}

}

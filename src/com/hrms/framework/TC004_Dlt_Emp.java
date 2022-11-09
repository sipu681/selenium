package com.hrms.framework;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004_Dlt_Emp 
{
	//public static void main(String[] args) throws Exception 
	@Test
	public void tc004() throws Exception
	{
		DOMConfigurator.configure("log4j.xml"); 
       General obj = new General();
         obj.openApplication();
         obj.login();
         obj.enterFrame();
         obj.Dlt_Emp("0064");
         obj.existFrame();
         obj.logout();
         obj.closeApplication();
   
   }
}
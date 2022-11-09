package com.hrms.framework;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
public class TC001_login_logout {

//	public static void main(String[] args) 
	
		@Test
		public void tc101(){ 
		DOMConfigurator.configure("log4j.xml"); 
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
		
	}

}

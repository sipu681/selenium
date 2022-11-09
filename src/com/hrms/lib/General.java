package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.hrms.utility.*;
public class General extends Global
{
 // stdrule: to provide all re-usable fun:/methods of whole application
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.Exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("opened Application");
		Log.info("opened Application");
	}
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(login_btn)).click();
		System.out.println("login Completed");
		Log.info("login completed");
	}
	public void enterFrame()
	{
		driver.switchTo().frame(0);
	}
	public void addEmp(String firstname , String lastname)
	{
		driver.findElement(By.xpath(add_btn)).click();
		driver.findElement(By.name(emp_firstname)).sendKeys(firstname);
		driver.findElement(By.name(emp_lastname)).sendKeys(lastname);
		driver.findElement(By.id(save_btn)).click();
		System.out.println("add Employee completed");
		Log.info("add Employee Completed");
	}
	public void existFrame()
	{
		driver.switchTo().defaultContent();
	}
	public void logout()
	{
		driver.findElement(By.linkText(logout_btn)).click();
		System.out.println("logout Completed");
		Log.info("logout Completed");
	}
	
		public void closeApplication() {
			driver.quit();
			System.out.println("close application");
			Log.info("close application");
	}
		
	  public void Edit()throws Exception
	  {
		  driver.findElement(By.xpath(Emp_select)).click();
		  driver.findElement(By.id(btn_Edit)).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name(Fn)).clear();
		  Thread.sleep(2000);
		  driver.findElement(By.name(Fn)).sendKeys("Sipu");
		  Thread.sleep(2000);
		  driver.findElement(By.name(Ln)).clear();
		  Thread.sleep(2000);
		  driver.findElement(By.name(Ln)).sendKeys("nayak");
		  Thread.sleep(2000);
		  driver.findElement(By.id(save)).click();
		  Thread.sleep(2000);
		  System.out.println("Employee Edited Successfull");
	}
	  public void Dlt_Emp(String id ) throws Exception
	  {
			Select st = new Select(driver.findElement(By.name("loc_code")));
			//st.selectByVisibleText("Emp.ID");
			st.selectByIndex(1);
			Thread.sleep(3000);
			driver.findElement(By.name("loc_name")).sendKeys(id);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("chkLocID[]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='Delete']")).click();
			System.out.println("Employee deleted completed");
	  }

}














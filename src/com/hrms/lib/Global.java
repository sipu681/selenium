package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global 
{
	// StdRule: To provide testdata & objects for whole application
  public WebDriver driver;
  public String url = "http://183.82.103.245/nareshit/login.php";
  public String username = "nareshit";
  public String password = "nareshit";
  
  // login elements 
  public String txt_loginname= "txtUserName";
  public String txt_password = "txtPassword";
  public String login_btn = "Submit";
  //  add Employee elements
  public String add_btn = "//input[@value='Add']";
  public String emp_firstname = "txtEmpFirstName";
  public String emp_lastname = "txtEmpLastName";
  public String save_btn ="btnEdit";
  public String logout_btn = "Logout";
  //Edit Elements
  public String Emp_select = "//*[@id=\"standardView\"]/table/tbody/tr[11]/td[3]/a";
  public String btn_Edit = "btnEditPers";
  public String Fn = "txtEmpFirstName";
  public String Ln = "txtEmpLastName";
  public String save = "btnEditPers";
  //dlt Emp Elements
  
}

package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Example2 
{
  @BeforeClass
  public void login()
  {
	  System.out.println("Login completed");
  }
  @AfterClass
  public void logout()
  {
	  System.out.println("Logout completed ");
	  
  }
  @Test (priority=2)
  public void addEmp()
  {
	  System.out.println("Employee added");
	  
  }
  @Test(priority=1)
  public void dltEmp()
  {
	  System.out.println("Employee deleted");
  }
}

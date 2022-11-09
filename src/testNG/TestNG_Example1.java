package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Example1 
{
@BeforeClass
public void login()
{
	System.out.println("Login Completed");
}
    @AfterClass
	public void logout()
	{
		System.out.println("Logout completed");
	}
    @Test
	public void addEmp()
	{
		System.out.println("Employee Added");
	}
	@Test
	public void dltEmp()
	{
		System.out.println("Delete Employee");
	}
}

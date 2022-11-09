package WebDriver_TestNG_Excel;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
public class Excel_Webdriver_TestNG {
    WebDriver driver;
@BeforeClass
public void startUp() {
System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
 driver = new ChromeDriver();
}
@AfterClass
public void tearDown() {
driver.quit();
}
@Test
public void TC001() throws Exception{
    //Excel
FileInputStream file = new FileInputStream("E:\\Excel\\Book1.xls");
Workbook  wb = Workbook.getWorkbook(file);
Sheet    st = wb.getSheet(0);
                     // (column,row)
String username = st.getCell(0,1).getContents();
String password = st.getCell(1,1).getContents();
Reporter.log(username);
Reporter.log(password);
driver.get("http://183.82.103.245/nareshit/login.php");
Reporter.log("Application opened");
driver.findElement(By.name("txtUserName")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Reporter.log("Login completed");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
Reporter.log("Logout completed");
}
}
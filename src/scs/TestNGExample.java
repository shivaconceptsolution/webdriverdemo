package scs;

import org.openqa.selenium.WebDriver;

public class TestNGExample {
	WebDriver driver;


	  @Test(priority=1)
	 
	  public void f1() {
	 
	 driver.get("https://eroomrent.in/index.php");
	 
	Select search=new Select(driver.findElement(By.name("ddlcat")));
	search.selectByIndex(2);
	  }
	 
	 @Test(priority=2)
	 
	  public void f2() throws Exception {



	Select subcat=new Select(driver.findElement(By.id("subcat")));
	subcat.selectByIndex(1);


	 }
	 
	 @Test(priority=3)
	 
	 public void f3() {
	 
	Select search=new Select(driver.findElement(By.name("ddllocation")));
	search.selectByIndex(1);
	 }
	 
	 @Test(priority=4)
	 
	 public void f4() {

	driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div/form/div[2]/div[3]/input")).click();
	 }
	 
	 @Test(priority=5)
	 
	 public void f5() {

	driver.findElement(By.linkText("Click To Booking")).click();





	 }
	 

	@Test(priority=6)
	 
	 public void f6() {

	driver.findElement(By.name("txtEmail")).sendKeys("agrawal@gmail.com");

	driver.findElement(By.name("txtPassword")).sendKeys("1234567");


	}
	 



	 
	 
	  @BeforeMethod
	  public void beforeMethod() {
	 
	 //driver.get("https://eroomrent.in/index.php");
	  }

	  @AfterMethod
	  public void afterMethod() throws Exception {
	 
	 Thread.sleep(5000);
	  }

	  @BeforeTest
	  public void beforeTest() {
	 
	 System.setProperty("webdriver.chrome.driver" , "c://chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	  }

	  @AfterTest
	  public void afterTest() {
	  }
}

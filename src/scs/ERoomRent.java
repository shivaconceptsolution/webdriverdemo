package scs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ERoomRent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://eroomrent.in/ownerlogin.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtEmail")).sendKeys("agrawalswati@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("1234567");
		driver.findElement(By.name("btnsubmit")).click();

		WebElement e1=driver.findElement(By.linkText("View Room"));


		Actions ac=new Actions(driver);
		ac.moveToElement(e1).click().build().perform();
		List<WebElement> rows=driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/center/table/tbody/tr/td[1]"));
		System.out.println("number of rows =" +rows.size());

		List <WebElement> col= driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/center/table/tbody/tr/th"));
		System.out.println("number of columns =" +col.size());

		WebElement e2=driver.findElement(By.linkText("Add Room"));
	
        e2.click();
		
        Select ddllocation = new Select(driver.findElement(By.id("ddllocation")));
        ddllocation.selectByIndex(2);
        Select ddlcat = new Select(driver.findElement(By.id("ddlcat")));
        ddlcat.selectByIndex(2);
        Thread.sleep(2000);
        Select ddlscat = new Select(driver.findElement(By.id("subcat")));
        ddlscat.selectByIndex(2);
		
		driver.findElement(By.name("txtdesc")).sendKeys("garden facing,airy flat");
		driver.findElement(By.name("file")).sendKeys("d://room.jpg");
		driver.findElement(By.name("txtamount")).sendKeys("4000");
		driver.findElement(By.name("txtfacility")).sendKeys("24hr water,electricity");
	    driver.findElement(By.name("btnsubmit")).click();
        driver.findElement(By.linkText("Logout")).click();
		

		driver.get("https://eroomrent.in/ownerlogin.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtEmail")).sendKeys("agrawalswati@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("1234567");
		driver.findElement(By.name("btnsubmit")).click();

		WebElement e4=driver.findElement(By.linkText("View Room"));
		e4.click();

		List<WebElement> row1=driver.findElements(By.xpath("//html/body/div[2]/div/div[2]/center/table/tbody/tr/td[1]"));
		System.out.println("number of rows =" +row1.size());

		List <WebElement> col1= driver.findElements(By.xpath("//html/body/div[2]/div/div[2]/center/table/tbody/tr/th"));
		System.out.println("number of columns =" +col1.size());


	}

}

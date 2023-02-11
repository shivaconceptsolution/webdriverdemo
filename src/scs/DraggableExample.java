package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	    WebElement From=driver.findElement(By.xpath("//*[@id=\"credit4\"]/a"));
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.dragAndDropBy(From,160, 50).build().perform();
      

	}

}

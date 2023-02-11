package scs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		   
		   String URL = "https://demoqa.com/droppable/";
		   
		   driver.get(URL);
		   driver.manage().window().maximize();
		//   driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		   WebElement from = driver.findElement(By.id("draggable"));
		   
		   WebElement to = driver.findElement(By.id("droppable")); 
		   Actions builder = new Actions(driver);
		   builder.dragAndDrop(from, to).perform();
		   String textTo = to.getText();
		   if(textTo.equals("Dropped!")) {
			    System.out.println("PASS: Source is dropped to target as expected");
			   }else {
			    System.out.println("FAIL: Source couldn't be dropped to target as expected");
			   }

	}

}

package scs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictwaitExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();  
	    
	     driver.get("https://google.com/ncr");
	     driver.findElement(By.name("q")).sendKeys("java" + Keys.ENTER);
	     WebElement firstResult = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
	     
	     System.out.println(firstResult.getText());


	    // System.out.println(firstResult.getText());

	}

}

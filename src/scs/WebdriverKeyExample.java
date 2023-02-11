package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebdriverKeyExample {

	public static void main(String[] args) {
		//System.setProperty("WebDriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shivaconceptsolution.com/test.html");
		WebElement source  =     driver.findElement(By.tagName("body"));
		//source.sendKeys("Rakesh");
		Actions obj = new Actions(driver);
		obj.keyDown(source, Keys.CONTROL).sendKeys("p").build().perform();
		

	}

}

package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionExample3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shivaconceptsolution.com/test.html");
		WebElement ele = driver.findElement(By.id("txt1"));
		Actions obj = new Actions(driver);
		Action ac = obj.moveToElement(ele).click().keyDown(ele,Keys.SHIFT).sendKeys("shiva concept solution").doubleClick().contextClick().build();
		ac.perform();
		

	}

}

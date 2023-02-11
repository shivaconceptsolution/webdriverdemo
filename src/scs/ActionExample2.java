package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/newtours/");
		  WebElement ele = driver.findElement(By.linkText("Home"));
		  WebElement tr = driver.findElement(By.xpath("//html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
		  String beforecolor = tr.getCssValue("background-color");
		  System.out.println("Before Mouseover color is "+beforecolor);
		  Actions obj = new Actions(driver);
		  Action ac = obj.moveToElement(tr).build();
		  ac.perform();
		  String aftercolor = tr.getCssValue("background-color");
		  System.out.println("Before Mouseover color is "+aftercolor);
		  

	}

}

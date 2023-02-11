package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in/");
		WebElement ele = driver.findElement(By.linkText("Owner-G"));
		Actions ack= new Actions(driver);
		Action event = ack.moveToElement(ele).click().build();
		event.perform();
		WebElement ele1 = driver.findElement(By.partialLinkText("Login"));
		ele1.click();

	}

}

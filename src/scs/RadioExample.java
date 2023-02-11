package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/radioexample.html");
		driver.manage().window().maximize();
		//driver.findElement(By.className("abc")).click();
		driver.findElement(By.cssSelector("input[value=PHP]")).click();
		

	}

}

package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shivaconceptsolution.com/test.html");
		String s = driver.findElement(By.tagName("h1")).getText();
		System.out.println(s);
		driver.findElement(By.id("txt1")).sendKeys("Locate by Id");
		driver.findElement(By.name("txt2")).sendKeys("Locate by name");
		driver.findElement(By.cssSelector("input[type=date]")).sendKeys("12-12-2022");
		driver.findElement(By.cssSelector("input[value=FeMale]")).click();
		Select drp = new Select(driver.findElement(By.name("c")));
		drp.selectByIndex(2);
		Select drp1 = new Select(driver.findElement(By.name("c[]")));
		drp1.selectByIndex(1);
		drp1.selectByIndex(2);
		driver.findElement(By.cssSelector("input[width='100']")).sendKeys("Locator Test");
		driver.findElement(By.xpath("//html/body/input[18]")).sendKeys("Locate by XPATH");
		

	}

}

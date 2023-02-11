package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExampleNew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shivaconceptsolution.com/test2.html");
		WebElement ele = driver.findElement(By.xpath("//html/body/input[1]"));
		ele.sendKeys("Locate by XPATH");
		WebElement ele1 = driver.findElement(By.xpath("//html/body/input[2]"));
		ele1.sendKeys("Locate by XPATH 2");
	//	WebElement ele2 = driver.findElement(By.xpath("//html/body/div/div/div/input[1]"));
		//ele2.sendKeys("Locate by XPATH 3");
		WebElement ele2 = driver.findElement(By.xpath("//div[@im='c']/input[1]"));
		ele2.sendKeys("Locate by XPATH 3");

	}

}

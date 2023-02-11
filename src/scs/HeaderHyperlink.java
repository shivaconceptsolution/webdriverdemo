package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderHyperlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in/");
		WebElement header = driver.findElement(By.tagName("nav"));
		int c = header.findElements(By.tagName("a")).size();
		System.out.println(c);
		WebElement f = driver.findElement(By.tagName("footer"));
		int c1 = f.findElements(By.tagName("a")).size();
		System.out.println(c1);

	}

}

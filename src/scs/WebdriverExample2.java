package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shivaconceptdigital.com/");
		driver.findElement(By.linkText("COURSES")).click();
		String courseurl = driver.getCurrentUrl();
		driver.findElement(By.linkText("FAQ")).click();
		String faqurl = driver.getCurrentUrl();
		System.out.println("Course url is "+courseurl);
		System.out.println("FAQ url is "+faqurl);

	}

}

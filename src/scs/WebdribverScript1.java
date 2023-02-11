package scs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdribverScript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shivaconceptsolution.com");
		String s = driver.getTitle();
		System.out.println(s);
		if(s!="")
		{
			System.out.println("Title is set");
		}
		else
		{
			System.out.println("Title is not set");
		}
		driver.close();

	}

}

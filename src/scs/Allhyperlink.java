package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Allhyperlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int a=0,b=0;
		driver.get("https://www.eroomrent.in");
		List<WebElement> s = driver.findElements(By.tagName("a"));
		//Iterator it = s.iterator();
		ArrayList arrlist = new ArrayList();
		/*for(int i=0;i<s.size();i++)
		{
			WebElement e =(WebElement)s.get(i);
			String u =e.getAttribute("href");
			if(u.equals("") || u.equals("#"))
			{
				a++;
			}
			else
			{
				b++;
			}
			arrlist.add(u);
			System.out.println(u);
			
		}*/
		
		for(WebElement o:s)
		{
			WebElement e =(WebElement)o;
			String u =e.getAttribute("href");
			if(u.equals("") || u.equals("#"))
			{
				a++;
			}
			else
			{
				b++;
			}
			arrlist.add(u);
			System.out.println(u);
			
		}
	/*	for(Object o: arrlist)
		{
			driver.navigate().to(o.toString());
			driver.navigate().back();
			driver.navigate().refresh();
			
		}*/
		System.out.println("Total Hyperlinks are "+s.size());
		System.out.println("Total non Working Hyperlinks are "+a);
		System.out.println("Total working Hyperlinks are "+b);
		driver.quit();

	}

}

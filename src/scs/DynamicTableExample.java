package scs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/web-table-element.php");
        List<WebElement> lst = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
        System.out.println("row size is "+lst.size());
	}

}

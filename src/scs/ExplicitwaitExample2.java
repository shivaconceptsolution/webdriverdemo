package scs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitExample2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();  
		driver.get("https://eroomrent.in/");
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleIs("EROOMRENT :- Flats, House, Rooms for rent at PG Prices without broker | Furnished/Unfurnished Apartments for rent | EroomRent"));
		
		
	   

	}

}

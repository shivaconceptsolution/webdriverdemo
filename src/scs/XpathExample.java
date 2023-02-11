package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shivaconceptsolution.com/test.html");
		driver.manage().window().maximize();

		//name xpath rel and abs
		//driver.findElement(By.xpath("//input[@id='txt1']")).sendKeys("swati");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("swati");

		//email xpath rel and abs:
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("agrawal@gmail");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("agrawal@gmail");

		//date xpath rel and abs:
		//driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12/15/2022");
		driver.findElement(By.xpath("/html/body/input[4]")).sendKeys("12/15/2022");

		//click xpath rel and abs:
		//driver.findElement(By.xpath("//a[@href='http://shivaconceptsolution.com']")).click();
		//driver.findElement(By.xpath("/html/body/a")).click();

		//click to scs xpath rel and abs:
		//driver.findElement(By.xpath("//a[@href='http://shivaconceptsolution.com\']")).click();
		//driver.findElement(By.xpath("/html/body/h3/a")).click();

		//empty box xpath rel and abs:
		//driver.findElement(By.xpath("//input[@class='abc']")).sendKeys("fish");
		driver.findElement(By.xpath("/html/body/input[6]")).sendKeys("fish");

		//description box xpath rel and abs:
		//driver.findElement(By.xpath("//input[@value='click']")).sendKeys("describe");
		driver.findElement(By.xpath("/html/body/input[8]")).sendKeys("describe");

		//radiobutton xpath rel and abs:
		//driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("/html/body/input[13]")).click();

		//cpp xpath rel and abs:
		//driver.findElement(By.xpath("//input[@name='chk2']")).click();
		driver.findElement(By.xpath("/html/body/input[15]")).click();


		//selectbox xpath rel and abs:
		driver.findElement(By.xpath("//option[@value='Web Driver']")).click();
		//driver.findElement(By.xpath("//select[@id='c']")).click();
		//driver.findElement(By.xpath("/html/body/select[1]/option[2]")).click();

		// box xpath rel and abs:
		//driver.findElement(By.xpath("//input[@width='100']")).sendKeys("shiva");
		//driver.findElement(By.xpath("/html/body/input[16]")).sendKeys("shiva");

		//listbox xpath rel and abs:
		//driver.findElement(By.xpath("//option[@value='TestNG']")).click();
		driver.findElement(By.xpath("/html/body/select[2]/option[3]")).click();

		//img xpath
		String a=driver.findElement(By.xpath("//img[@alt='g-6']")).getAttribute("src");

		System.out.println("path of image is "+a);

	}

}

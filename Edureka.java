package Automation;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Edureka {
	@Test	
	public static void edurekaTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("(//span[text()='Log In'])[1]")).click();
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		driver.switchTo().activeElement().sendKeys("biswajitsahoo184@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("Bisu@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		driver.findElement(By.xpath("//span[@class='user_image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='giTrackElementHeader'])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Career Services']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//i[@class='icon-pr-edit'])[3]")).click();
	driver.findElement(By.xpath("(//i[@class='icon-Arrow-Left'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='user_image']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	driver.close();
}
}

package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sivapriya\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get("https://www.facebook.com");
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("sivapriya3793@gmail.com");
		WebElement textpass = driver.findElement(By.name("pass"));
		textpass.sendKeys("SpB@3793");
		WebElement btnlogin=driver.findElement(By.xpath("//input[@Value='Log In']"));
		btnlogin.click();
		
		
		
		
	}

}

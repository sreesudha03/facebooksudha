package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//input[@name=	'email']")).sendKeys("abaaaa");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abaaaa");
	    Thread.sleep(2000);
	    WebElement enter = driver.findElement(By.xpath("//button[@id='u_0_h']")) ;
		enter.click();
	    //driver.findElement(By.linkText("Forgotten password?")).click();
	    Thread.sleep(2000);
	}

}

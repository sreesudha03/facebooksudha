package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanladder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div/a[contains(.,'Close')]")).click();
		//driver.findElement(By.xpath("//a[contains(.,'close')]")).click();
		//driver.findElement(By.xpath("//div[@id='authentication_popup']")).click();
		//driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("sofa",Keys.ENTER);
		WebElement sale = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		Actions a= new Actions(driver);
		a.moveToElement(sale).build().perform();

	}
	
}

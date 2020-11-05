package automation1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestonenov4assign {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bluestone.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement jewellry = driver.findElement(By.xpath("//a[@title='Jewellery']"));
	Actions a = new Actions(driver);
	a.moveToElement(jewellry).build().perform();
	 WebElement kada= driver.findElement(By.xpath("//span[@data-p='mens-jewellery-kadas,m' and text()='Kadas']"));
	kada.click();
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='hc img-responsive center-block' and @alt= 'The Udith Kada For Him']")).click();
	Set<String> an = driver.getWindowHandles();
	 for(String s : an) {
		 driver.switchTo().window(s);
	 }
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='buy-now']")).click();
	 System.out.println(driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText());
	 Thread.sleep(2000);
	 driver.quit();
	
}
}
package automation1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.bluestone.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement ring= driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
ring.sendKeys("gold rings",Keys.ENTER);
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@id='pid_26039'and @class='link-overlay']")).click();
Set<String> parent = driver.getWindowHandles();
for(String child : parent) {
		 driver.switchTo().window(child);
		}
Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='size' and text()='12']")).click();
		 driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		 
		 //System.out.println(driver.findElement(By.xpath("//div[text()='* This field is required']")).getText());
		 Set<String> an = driver.getWindowHandles();
		 for(String s : an) {
			 driver.switchTo().window(s);
		 }
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//div/a[@class='btn btn-block btn-new bs-place-order']")).click();
		Set<String> add = driver.getWindowHandles();
		for(String t : add) {
			driver.switchTo().window(t);
		}
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		 driver.close();
driver.quit();
}

}

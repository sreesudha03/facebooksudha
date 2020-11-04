package automation1;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pepperfry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.pepperfry.com/");
Thread.sleep(2000);
String title = driver.getTitle();
System.out.println(title);
Thread.sleep(10000);
//driver.findElement(By.xpath("//div[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='regPopUp']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Chairs",Keys.ENTER);
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(.,'MultiColour ')]")).click();
System.out.println(driver.getWindowHandle()+"   ---handletest");
Set<String> parent = driver.getWindowHandles();
for(String child : parent) {
		 driver.switchTo().window(child);
}
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
	System.out.println(driver.findElement(By.xpath("//h1[contains(.,'MultiColour ')]")).getText());

}
	

//driver.switchTo().window(arg0)

//driver.quit();

	}



package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@name='username']"));
		search.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		WebElement login = driver.findElement(By.id("loginButton"));
	    login.click();
	   // System.out.println(driver.findElement(By.xpath("//b[contains(.,'admin')]")).getText());
	    System.out.println(driver.findElement(By.xpath("//b[text()='admin']")).getText());
	//	WebElement link = driver.findElement(By.partialLinkText("acti"));
		//link.click();
	}

}

package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//driver.get("https://www.google.com/");
	/*driver.get("https://www.FACEBOOK.com/");
	//driver.close();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.quit();*/
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	WebElement search = driver.findElement(By.name("username"));
	search.sendKeys("admin");
	WebElement password = driver.findElement(By.name("pwd"));
	password.sendKeys("manager");
	WebElement login = driver.findElement(By.id("loginButton"));
    login.click();
	WebElement link = driver.findElement(By.partialLinkText("acti"));
	link.click();
	}

}

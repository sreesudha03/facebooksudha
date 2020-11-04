package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.pepperfry.com/");
Thread.sleep(2000);
String title = driver.getTitle();
System.out.println(title);
Thread.sleep(2000);
driver.navigate().to("https://www.lufthansa.com/");
Thread.sleep(2000);
driver.navigate().to("https://www.airasia.com/flights/india");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.quit();

	}


}

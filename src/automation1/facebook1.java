package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement create = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		create.click();
		//driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		WebElement fristname = driver.findElement(By.xpath("//input[@id='u_1_b']"));
		fristname.sendKeys("Mrudhula");
		Thread.sleep(2000);
		//driver.findElement(By.id("u_1_b")).sendKeys("autom");
		WebElement surname = driver.findElement(By.xpath("//input[@id='u_1_d']"));
		surname.sendKeys("Joshi");
		Thread.sleep(2000);
		//driver.findElement(By.name("lastname")).sendKeys("frst");
		WebElement mobile = driver.findElement(By.xpath("//input[@id='u_1_g']"));
		mobile.sendKeys("6325489621");
		Thread.sleep(2000);
		//driver.findElement(By.id("u_1_g")).sendKeys("1234571111");
		WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("automation");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Mar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='1994']")).click();
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//input[@id='u_1_2']"));
		gender.click();
		Thread.sleep(2000);
		//driver.findElement(By.id("password_step_input")).sendKeys("autom");
		//WebElement signup =driver.findElement(By.name("websubmit"));
		WebElement signup =driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup.click();
		Thread.sleep(5000);
		//driver.close();
	}
}

package automation1;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nukari {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/");
Thread.sleep(2000);
 String parent = driver.getWindowHandle();
 System.out.println(parent+ "     p");
 Set<String> wins = driver.getWindowHandles();
 /*wins.remove(parent); // or wins.remove(driver.getWindowHandle());
 for(String win : wins) {
	 System.out.println(win);
	 driver.switchTo().window(win);
	 System.out.println(driver.getTitle());
	 driver.close();*/
 List <String> li = new LinkedList<String>(wins);
 /*for(int i=li.size()-1;i>=0;i--) {
	 String winhandle = li.get(i);
	 driver.switchTo().window(winhandle);
	 driver.close();
	 Thread.sleep(1000);
 }*/
 driver.switchTo().window(li.get(2));   //any particular window u want to close
System.out.println(driver.getCurrentUrl());
driver.close();
 Thread.sleep(2000);
 driver.quit();
	}

}

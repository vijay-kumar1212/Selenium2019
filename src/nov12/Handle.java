package nov12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/");
	driver.manage().window().maximize();
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	driver.findElement(By.partialLinkText("Priva")).click();
	driver.findElement(By.partialLinkText("Terms")).click();
	//driver.findElement(By.partialLinkText("Account settin")).click();
	Set<String> allwindows=driver.getWindowHandles();
	System.out.println(allwindows);
	for (String each : allwindows) {
		 if (!parent.equals(each)) {
			String pagetitle=driver.switchTo().window(each).getTitle();
			System.out.println(pagetitle);
			driver.close();
		}
	}
	driver.switchTo().window(parent);
	driver.findElement(By.name("identifier")).sendKeys("vijayharsha1212");
	driver.close();
}
}

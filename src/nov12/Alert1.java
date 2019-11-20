package nov12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).click();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

}

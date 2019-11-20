package nov6;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getlocation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement pict=driver.findElement(By.name("websubmit"));
		Point locate1=pict.getLocation();
		System.out.println(locate1);
		WebElement pict1=driver.findElement(By.name("reg_passwd__"));
		Point locate2=pict1.getLocation();
		System.out.println(locate2);
		driver.close();

	}

}

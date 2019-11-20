package nov8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/hp/Downloads/checkbox_1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("option-2")).click();
		Thread.sleep(3000);
		String name=driver.findElement(By.name("option-2")).getAttribute("value");
		Thread.sleep(3000);
		System.out.println(name);
		Thread.sleep(3000);
        driver.quit();
	}

}

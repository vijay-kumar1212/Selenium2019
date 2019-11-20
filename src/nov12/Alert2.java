package nov12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/hp/Downloads/promp.html");
		driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		Alert alrt=driver.switchTo().alert();
		String alertmessage=alrt.getText();
		System.out.println(alertmessage);
		alrt.sendKeys("vijay");
        alrt.accept();
        String message=driver.findElement(By.id("promptdemo")).getText();
        System.out.println(message);
        driver.close();
	}

}

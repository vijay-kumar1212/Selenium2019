package nov14;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paldm {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		String str=driver.getCurrentUrl();
		System.out.println(str);
		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div[4]/div")).click();
		List<WebElement>oframes=driver.findElements(By.tagName("iframe"));
		System.out.println("no of iframes are::"+oframes.size());
		WebDriver frome=driver.switchTo().frame(0);
		Thread.sleep(3000);
		System.out.println(frome.getTitle());
		driver.findElement(By.className("qrcode-footer-text")).click();
		Thread.sleep(3000);
		//driver.findElement(By.name("username")).sendKeys("vijayharsha1212@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("sddgjhgfg@123");
		//driver.findElement(By.xpath("//*[@id='loginForm']/div/md-content/button/span")).click();
		//WebElement errormessage=driver.findElement(By.xpath("//*[@id='loginForm']/div/md-content/md-input-container[1]/div/span[3]"));
		//System.out.println(errormessage);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[@class='_3i6R']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}

package nov7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args)throws Throwable {
	WebDriver orng=new ChromeDriver();
	orng.navigate().to("http://opensource-demo.orangehrmlive.com");
	Thread.sleep(3000);
    orng.manage().window().maximize();
    WebElement usrname=orng.findElement(By.xpath("//input[@id='txtUsername']"));
    Thread.sleep(3000);
    usrname.clear();
    Thread.sleep(3000);
    usrname.sendKeys("Admin");
    Thread.sleep(3000);
    WebElement psw=orng.findElement(By.xpath("//input[@id='txtPassword']"));
    Thread.sleep(3000);
    psw.clear();
    Thread.sleep(3000);
    psw.sendKeys("admin123");
    Thread.sleep(3000);
    orng.findElement(By.xpath("//input[@id='btnLogin']")).click();
    if (orng.getCurrentUrl().contains("dash")) {
		System.out.println("log in success");
	} else {
	String message=orng.findElement(By.xpath("//span[@id='spanMessage']")).getText();
    System.out.println("login fail"+ message);
	}
    Thread.sleep(3000);
    orng.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    Thread.sleep(3000);
    orng.quit();
	}

}

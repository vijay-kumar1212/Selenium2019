package nov19;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_demo {

	public static void main(String[] args) throws AWTException, Throwable {
		WebDriver google=new ChromeDriver();
		google.get("https://www.google.com/");
		google.manage().window().maximize();
		String parent=google.getWindowHandle();
		Actions act=new Actions(google);
		act.moveToElement(google.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(5000);
		Robot rbt= new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		ArrayList<String> allwins=new ArrayList<String>(google.getWindowHandles());
		System.out.println(google.getTitle());
		System.out.println(allwins.size());
		google.switchTo().window(allwins.get(1));
		google.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(5000);
		ArrayList<String>allwin1=new ArrayList<String>(google.getWindowHandles());
		google.switchTo().window(allwin1.get(2));
		google.findElement(By.name("identifier")).sendKeys("vijayharsha1212@gmail.com");
		act.moveToElement(google.findElement(By.xpath("//*[@class='ZFr60d CeoRYc']"))).click().perform();
		Thread.sleep(6000);
		google.quit();
		
		

	}

}

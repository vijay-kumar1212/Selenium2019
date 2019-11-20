package nov6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_commands {

	public static void main(String[] args)throws Throwable{
		WebDriver drv=new ChromeDriver();
		drv.manage().window().maximize();
		Thread.sleep(3000);
		drv.navigate().to("https://google.com");
		Thread.sleep(3000);
		System.out.println("pagetitle is" + drv.getTitle());
		Thread.sleep(3000);
		drv.findElement(By.partialLinkText("Gmai")).click();
		Thread.sleep(3000);
		System.out.println("page title"+ drv.getTitle());
		Thread.sleep(3000);
		drv.navigate().back();
		Thread.sleep(3000);
        System.out.println("pagetitle1" + drv.getTitle());
        Thread.sleep(3000);
        drv.navigate().forward();
        Thread.sleep(3000);
        System.out.println("page title1" + drv.getTitle());
        Thread.sleep(3000);
        drv.navigate().refresh();
        Thread.sleep(3000);
        drv.close();
	}

}

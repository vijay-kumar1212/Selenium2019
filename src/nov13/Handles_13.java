package nov13;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles_13 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'allcircle circlefour')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='allcircle circlefive']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='allcircle circlesix']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='allcircle circleseven']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='allcircle circleight']")).click();
		ArrayList<String> brw=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		String title1=driver.switchTo().window(brw.get(1)).getTitle();
		System.out.println(title1);
		driver.close();
		String title2=driver.switchTo().window(brw.get(2)).getTitle();
		System.out.println(title2);
		driver.close();
		String title3=driver.switchTo().window(brw.get(3)).getTitle();
		System.out.println(title3);
		driver.close();
		String title4=driver.switchTo().window(brw.get(4)).getTitle();
		System.out.println(title4);
		driver.close();
		String title5=driver.switchTo().window(brw.get(5)).getTitle();
		System.out.println(title5);
		driver.close();
		String title6=driver.switchTo().window(brw.get(6)).getTitle();
		System.out.println(title6);
		driver.close();
		String title7=driver.switchTo().window(brw.get(7)).getTitle();
		System.out.println(title7);
		driver.close();
		String title8=driver.switchTo().window(brw.get(8)).getTitle();
		System.out.println(title8);
		driver.close();
		driver.switchTo().window(parent);
		driver.close();

	}

}

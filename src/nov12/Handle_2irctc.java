package nov12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_2irctc {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String parent=driver.getWindowHandle();
		Thread.sleep(3000);
		System.out.println(parent);
		Thread.sleep(3000);
		
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
		Set<String>allwindos=driver.getWindowHandles();
		System.out.println(allwindos);
		for (String each : allwindos) {
			if (!parent.equals(each)) {
				String pagetitle=driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("SECUNDERABAD JN - SC");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("SRIKAKULAM ROAD - CHE");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Find trains')]")).click();
        Thread.sleep(3000);
        driver.close();
	}

}

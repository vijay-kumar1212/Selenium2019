package nov13;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles3 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>child=driver.getWindowHandles();
		System.out.println(child.size());
		System.out.println(child);
		Iterator<String>itr=child.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			if(!parent.equals(str)){
			String pagetitle=driver.switchTo().window(str).getTitle();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			System.out.println(pagetitle);
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(2000);
			
	}
	}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.id("fname")).sendKeys("vijaykumar");
		driver.findElement(By.id("email")).sendKeys("vijaykumar1212@gmail.com");
		driver.findElement(By.name("password")).sendKeys("VIJay@3564dare");
		driver.findElement(By.name("number")).sendKeys("810665739");
		driver.findElement(By.name("city")).sendKeys("Ahmedabad");
		WebElement  chck=driver.findElement(By.className("customChkBoxLbl chkboxLbl"));
		if(chck.isSelected())
			driver.findElement(By.name("basicDetailSubmit")).click();
		Thread.sleep(3000);
		driver.close();
	}
}

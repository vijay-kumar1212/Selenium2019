package nov7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_method {

	public static void main(String[] args)throws Throwable {
		ChromeDriver driv=new ChromeDriver();
		driv.manage().window().maximize();
		driv.navigate().to("https://www.facebook.com");
	    Thread.sleep(3000);
		Select month=new Select(driv.findElement(By.id("month")));
		Thread.sleep(3000);
		month.selectByVisibleText("Aug");
		Thread.sleep(3000);
		Select year=new Select(driv.findElement(By.id("year")));
		Thread.sleep(3000);
		year.selectByVisibleText("1994");
		Thread.sleep(3000);
		year.selectByValue("2013");
		Thread.sleep(3000);
		month.selectByIndex(5);
		Thread.sleep(3000);
		year.selectByIndex(45);
		Thread.sleep(3000);
		System.out.println(month.getFirstSelectedOption().getText());
		System.out.println(year.getFirstSelectedOption().getText());
		driv.close();
	}

}

package nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_01 {

	public static void main(String[] args)throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select year=new Select(driver.findElement(By.name("birthday_year")));
		boolean value=year.isMultiple();
		System.out.println(value);
		List<WebElement> olList=year.getOptions();
		System.out.println("no. of items in year::"+ olList.size());
		for (int i = 1; i < olList.size(); i++) {
			String name=olList.get(i).getText();
			System.out.println(name);
		}
		driver.close();

	}

}

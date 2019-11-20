package nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/Multi.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select listbox=new Select(driver.findElement(By.name("multiSelection")));
		Thread.sleep(3000);
		boolean value=listbox.isMultiple();
		Thread.sleep(3000);
		System.out.println(value);
		Thread.sleep(3000);
		listbox.selectByIndex(0);
		Thread.sleep(3000);
		listbox.selectByIndex(1);
		Thread.sleep(3000);
		listbox.selectByIndex(6);
		Thread.sleep(3000);
		listbox.selectByIndex(3);
		Thread.sleep(3000);
		listbox.selectByIndex(4);
		Thread.sleep(3000);
		listbox.selectByIndex(5);
		Thread.sleep(3000);
		// count no. of items selected
		List<WebElement> olist=listbox.getAllSelectedOptions();
		System.out.println("no of items selected::"+ olist.size());
		for (int i = 0; i < olist.size(); i++) {
			String itemname=olist.get(i).getText(); 
		System.out.println(itemname);	
		}
		listbox.deselectByIndex(2);
		Thread.sleep(3000);
		listbox.deselectByIndex(3);
		Thread.sleep(3000);
		listbox.deselectByIndex(4);
		Thread.sleep(3000);
		listbox.deselectAll();
		driver.close();
	}
}

package nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_002 {

	public static void main(String[] args) {
		String expitem="3000";
		boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Select year=new Select(driver.findElement(By.id("year")));
		List<WebElement> olist=year.getOptions();
		System.out.println("no of items are::"+ olist.size());
		for (int i = 1; i < olist.size(); i++) {
		String actitem=olist.get(i).getText();
		System.out.println(actitem);
		if(expitem.equalsIgnoreCase(actitem)){
			itemexist=true;
			break;
		}
		}
		if (itemexist) {
		System.out.println("item found in listbox::"+ expitem);	
		} else {
         System.out.println("item not found in listbox::"+ expitem);
		}
		driver.close();
	}

}

package nov11;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox1_2 {

	public static void main(String[] args)throws Throwable {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/hp/Downloads/checkbox_1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> chcklist=driver.findElementsByTagName("input");
		System.out.println("no of checklists are::"+chcklist.size());
		for (int i = 0; i <chcklist.size() ; i++) {
			boolean value=chcklist.get(i).isSelected();
			System.out.println(value);
			String chckboxname=chcklist.get(i).getAttribute("value");
			System.out.println(chckboxname);
			System.out.println(chcklist.get(i).getAttribute("checked"));
			if (chcklist.get(i).isSelected()) {
				chcklist.get(i).click();
			} else {
              chcklist.get(i).click();
			}
		}
		Thread.sleep(3000);
        driver.quit();
	}

}

package nov6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countinglinks_foreach {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://news.coral.co.uk/");
		driver.manage().window().maximize();
		List<WebElement> links1=driver.findElements(By.tagName("a"));
		System.out.println("no. of links are::"+ links1.size());
		for (WebElement each : links1) {
			String linkname=each.getText();
			String linkurl=each.getAttribute("href");
			System.out.println(linkname+"\n"+ linkurl);
		}
		driver.close();

	}

}

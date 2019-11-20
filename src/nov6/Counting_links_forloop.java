package nov6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_links_forloop {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com");
	driver.manage().window().maximize();
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("no. of links are::"+ links.size());
	for (int i = 0; i <links.size(); i++) {
		String linkurl=links.get(i).getAttribute("href");
	String linkname=links.get(i).getText();
	System.out.println(linkname+"\n"+linkurl);
	}
	driver.close();

	}

}

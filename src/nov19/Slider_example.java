package nov19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_example {

	public static void main(String[] args) throws Throwable{
		WebDriver query=new ChromeDriver();
		query.navigate().to("https://jqueryui.com/slider/");
		query.manage().window().maximize();
		
		Actions actn=new Actions(query);
		List<WebElement>oframe=query.findElements(By.tagName("iframe"));
		System.out.println(oframe.size());
		query.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement slide=query.findElement(By.xpath("/html[1]/body[1]/div[1]/span[1]"));
		Thread.sleep(5000);
		actn.dragAndDropBy(slide, 350, 0).perform();
		Thread.sleep(5000);
		actn.dragAndDropBy(slide, -150, 0).perform();
		Thread.sleep(5000);
	    query.close();
		
	}

}

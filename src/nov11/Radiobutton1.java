package nov11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton1 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.echoecho.com/htmlforms10.htm");
    driver.manage().window().maximize();
    List<WebElement>olist=driver.findElements(By.name("group1"));
    System.out.println("no of radiobuttons are::"+ olist.size());
    for (int i = 0; i <olist.size() ; i++) {
	String radioname=olist.get(i).getAttribute("value");
	System.out.println(radioname);
	olist.get(i).click();
	}
    driver.quit();
	}

	
}

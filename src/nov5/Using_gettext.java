package nov5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_gettext {

	public static void main(String[] args) {
    WebDriver text=new ChromeDriver();
    text.manage().window().maximize();
    text.navigate().to("http://newtours.demoaut.com/");
    String acttext=text.findElement(By.partialLinkText("REG")).getText();
    String exptext=text.findElement(By.partialLinkText("REG")).getAttribute("href");
    System.out.println(exptext);
    System.out.println(acttext);
    if (acttext.equalsIgnoreCase(exptext)) {
		System.out.println("text matching");
	} else {
		System.out.println("text not matching");
	}
    text.close();
	}

}

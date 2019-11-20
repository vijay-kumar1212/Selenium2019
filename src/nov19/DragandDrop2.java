package nov19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) {
		WebDriver drop=new ChromeDriver();
		drop.get("https://jqueryui.com/droppable/");
		drop.manage().window().maximize();
		Actions actn=new Actions(drop);
		drop.switchTo().frame(0);
		WebElement surce=drop.findElement(By.id("draggable"));
		WebElement dst=drop.findElement(By.id("droppable"));
		actn.dragAndDrop(surce, dst).perform();
		if(dst.getText().contains("Dropped!")){
			 System.out.println("drag and drop is success");
		 }else
		 {
			 System.out.println("drag and drop is unsuccess"); 
		 }
		
	     drop.close();

	}

}

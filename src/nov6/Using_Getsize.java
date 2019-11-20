package nov6;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Getsize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement mobiletxtbox=driver.findElement(By.name("reg_email__"));
		Dimension dim=mobiletxtbox.getSize();
		System.out.println("height::"+ dim.getHeight()+"/n"+ "widthh::"+ dim.getWidth());
		WebElement day=driver.findElement(By.id("day"));
        Dimension dim1=day.getSize();
        System.out.println("height::"+ dim1.getHeight()+"/n"+ "widthh::"+ dim1.getWidth());
        driver.close();
	}

}

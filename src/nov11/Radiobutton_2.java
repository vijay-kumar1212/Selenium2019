package nov11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
        driver.manage().window().maximize();
        WebElement table=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[9]/tbody[1]/tr[1]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]/form[1]/table[3]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]"));
        List<WebElement>olist=table.findElements(By.tagName("input"));
        System.out.println(olist.size());
      
        for (int i = 0; i <olist.size() ; i++) {
			olist.get(i).click();
			System.out.println(olist.get(i).isSelected());
			
			for(int j=0;j<olist.size();j++)
			{
			System.out.println("checked"+"---"+olist.get(j).getAttribute("checked")+olist.get(j).getAttribute("value"));		
			}
		}
        driver.quit();
	}

}

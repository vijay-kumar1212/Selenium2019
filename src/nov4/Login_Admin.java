package nov4;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
public class Login_Admin {
public static void main(String[] args)throws Throwable {
	WebDriver vjy=new ChromeDriver();
	vjy.get("http://primusbank.qedgetech.com");
	vjy.manage().window().maximize();
	Thread.sleep(3000);
	vjy.findElement(ById.id("txtuId")).sendKeys("Admin");
	Thread.sleep(3000);
	vjy.findElement(ById.id("txtPword")).sendKeys("Admin");
	//vjy.findElement(ById.id("txtPword")).click();
	vjy.findElement(ById.id("login")).sendKeys(Keys.ENTER);
	vjy.findElement(By.xpath("//td[3]//a[1]//img[1]")).click();
	Thread.sleep(3000);
	vjy.close();
	//vjy.quit();


}
}

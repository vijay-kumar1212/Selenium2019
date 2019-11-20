package nov4;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login_geckoDriver {
	public static void main(String[] args)throws Throwable{
		WebDriver resi=new FirefoxDriver();
		resi.manage().window().maximize();
		Thread.sleep(2000);
		resi.get("http://primusbank.qedgetech.com");
		Thread.sleep(2000);
		resi.findElement(ById.id("txtuId")).sendKeys("Admin");
		Thread.sleep(2000);
		resi.findElement(ById.id("txtPword")).sendKeys("Admin");
		Thread.sleep(2000);
		resi.findElement(ById.id("login")).click();
		Thread.sleep(8000);
		resi.quit();
}
}

package nov4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Register_tour {
	public static void main(String[] args)throws Throwable {
		ChromeDriver vis=new ChromeDriver();
		vis.get("http://newtours.demoaut.com/");
		vis.manage().window().maximize();
		Thread.sleep(3000);
		vis.findElement(By.partialLinkText("REG")).click();;
		Thread.sleep(3000);
		vis.findElementByName("firstName").sendKeys("madhav");;
		Thread.sleep(3000);
		vis.findElementByName("lastName").sendKeys("kadiyala");
		Thread.sleep(3000);
		vis.findElementByName("phone").sendKeys("789652345");
		Thread.sleep(3000);
		vis.findElementByName("userName").sendKeys("madhav2144@gmail.com");
		Thread.sleep(3000);
		vis.findElementByName("address1").sendKeys("koyambattur");
		Thread.sleep(3000);
		vis.findElementByName("address2").sendKeys("hakimpet");
		Thread.sleep(3000);
		vis.findElementByName("city").sendKeys("madras");
		Thread.sleep(3000);
		vis.findElementByName("state").sendKeys("Tamilnadu");
		Thread.sleep(3000);
		vis.findElementByName("postalCode").sendKeys("456987");
		Thread.sleep(3000);
		vis.findElementByName("country").sendKeys("INDIA");
		Thread.sleep(3000);
		vis.findElementByName("email").sendKeys("madav4422");
		Thread.sleep(3000);
		vis.findElementByName("password").sendKeys("sadghj@456");
		Thread.sleep(3000);
		vis.findElementByName("confirmPassword").sendKeys("sadghj@456");
		Thread.sleep(3000);
		vis.findElementByName("register").sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		vis.quit();
	}
}

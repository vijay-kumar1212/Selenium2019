package nov5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Get_Methods {
	public static void main(String[] args) throws Throwable{
	ChromeDriver sat=new ChromeDriver();
	sat.navigate().to("https://www.google.com/");
	sat.manage().window().maximize();
	Thread.sleep(2000);
	String strtitle=sat.getTitle();
	String strurlc=sat.getCurrentUrl();
	String strsource=sat.getPageSource();
	//System.out.println("page title::"+strtitle);
	//System.out.println("pagecurrenturl::"+strurlc+"\n"+ strurlc.length());
    System.out.println("source code::"+strsource);
	sat.close();
	}

}

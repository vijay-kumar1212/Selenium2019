package nov5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_getTitle {
	public static void main(String[] args)throws Throwable {
	WebDriver raj=new FirefoxDriver();
	Thread.sleep(3000);
    raj.get("https://gmail.com");
    raj.manage().window().maximize();
    Thread.sleep(3000);
    String expcttitle="gmail";
    String acttitle=raj.getTitle();
    if (expcttitle.equalsIgnoreCase(acttitle)) {
		System.out.println("title is matching::"+expcttitle+" "+acttitle);
	} else {
System.out.println("title is matching::"+expcttitle+" "+acttitle);
	}
	raj.close();
	

	}

}

package nov5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Starts_protocal {
	public static void main(String[] args) {
	InternetExplorerDriver rebel=new InternetExplorerDriver();
		rebel.get("http://google.com");
		String strurl="https://";
		String acturl=rebel.getCurrentUrl();
		if (acturl.startsWith(strurl)) {
			System.out.println("url is secured::"+ strurl+ " " + acturl);
		} else {
			System.out.println("url is notsecured::"+ strurl+ " " + acturl);
		}
rebel.quit();
	}

}

package launchGeekoDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGeeko {

	public static void main(String[] args) 
	{
       System.setProperty("webdriver.gecko.driver","C:\\Users\\yugandhar.palyam\\Downloads\\IEDriverServer_Win32_4.0.0\\geckodriver.exe");
       WebDriver driver= new FirefoxDriver();
	}

}

package chromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchApplication {

	// Main method (Driver function)
	public static void main(String[] args) {
		// Sets driver/ tells what driver needs to be loaded 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\steven.williams.jr\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\steven.williams.jr\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver.driver = new FirefoxDriver();
		
		// Managing the window size
		driver.manage().window().maximize(); 
		// loads URL specified by driver
		driver.get("http://www.brylt.com");
	}
}

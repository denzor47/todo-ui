import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LaunchBrowser {

	@Test
	public void getConection(){
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("test-type");
//		capabilities.setCapability("chrome.binary", "<Path to binary>");
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromium-browser");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-setuid-sandbox");
        chromeOptions.addArguments("--no-sandbox");
		driver = new ChromeDriver(chromeOptions);
        System.out.println("Step 1");
	    System.out.println("Step 2");
		driver.get("https://www.indeed.com/");
		System.out.println("Step 3");
	}
	@AfterMethod
//	public void closeConnection(){
//		driver.close();
//	}
	public static void main(String[] args){
		LaunchBrowser lb = new LaunchBrowser();
		lb.getConection();
	}
}

package ups.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

	public static WebDriver chromeDriver = null;

	public static void setupChromeDriver() {
		WebDriverManager.chromedriver().setup();
		chromeDriver = new ChromeDriver();
	}

	public static void quitChromeDriver() {
		chromeDriver.quit();
	}

}

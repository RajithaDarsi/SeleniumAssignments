/**
 * 
 */
package seleniumAssignments;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserBeforesuite {

	/**
	 * @param Launch
	 *            Browser using Before Suite Annotation
	 */

	@Test
	public void beforeSuiteTesting() {
		System.out.println("before Suite execution");
	}

	@Before
	public void before_suite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
					"C:/Users/darsir/eclipse-workspace/Selenium_Assignments_Batch1/softwares/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.close();
	}

}

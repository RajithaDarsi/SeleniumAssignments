package seleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTitle {

	/**
	 * @print title os Application
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
					"C:/Users/darsir/eclipse-workspace/Selenium_Assignments_Batch1/softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		/*System.setProperty("webdriver.chrome.driver",
					"C:/Users/darsir/eclipse-workspace/Selenium_Assignments_Batch1/softwares/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();*/

		driver.get("https://opensource-demo.orangehrmlive.com/");

		String title = driver.getTitle();

		System.out.println("Title of Application is:"+title);
		
		String URL= driver.getCurrentUrl();
		
		System.out.println("URL of Application is:"+URL);
		
		driver.close();
		//driver.quit();

	}

}

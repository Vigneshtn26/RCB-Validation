package org.testvagrant.genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUtility{
	WebDriver driver;
	//Actions act;
	WebDriverWait wait;
	
	/**
	 * This method is used to choose browser
	 * @param browser
	 * @return
	 */
	public WebDriver setupDriver(String browser)
	{

		switch(browser) {
		case"edge":WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
		break;
		case"chrome":
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		break;
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		default		: 
		System.out.println("You have entered wrong Browser in property file");
		break;
		}
		return driver;
	}

	/**
	 * This method is used to maximize browser
	 */
	public void maximizebrowser() {
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to use implicit wait
	 * @param longTimeout
	 */
	public void implicitwait(long longTimeout)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeout));
	}
	/**
	 * This method is used to select Url
	 * @param url
	 */
	public void openApplication(String url)
	{
		driver.get(url);
	}
	/**
	 * This method is used to switch frame using Index
	 * @param index
	 */
	public void switchFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch frame using nameOrId
	 * @param nameOrId
	 */
	public void switchFrame(String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	/**
	 * This method is used to switch frame using WebElement
	 * @param element
	 */
	public void switchFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}	
	public void closeBrowser()
	{
		driver.quit();
	}
	/**
	 * This method is used to close current browser
	 */
	public void closeTab()
	{
		driver.close();
	}

}

package org.testvagrant.genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass extends InstanceClass {
	
	@BeforeClass(alwaysRun = true)
	public void classSetup() {
		// Create object for Generic utility
		javaUtility = new JavaUtility();
		fileUtility = new FileUtility();
		webdriverUtility = new WebdriverUtility();
		
		// initialize the data from property file
		fileUtility.initializePropertyFile(IpathConstatns.PROPERTYFILEPATH);
		
		/**
		 * This method used to open browser and Url
		 */
		// Fetch data from Property file
		browser = fileUtility.getDataFromPropertyFile("browser");
		url = fileUtility.getDataFromPropertyFile("urlwiki");
		url1= fileUtility.getDataFromPropertyFile("urlimdb");

		String timeouts= fileUtility.getDataFromPropertyFile("timeout");
		longTimeout = javaUtility.convertStringToLong(timeouts);

		// Launching the browser in run time based on browser key
		driver = webdriverUtility.setupDriver(browser);

		// pre-setting for the Browser
		webdriverUtility.maximizebrowser();
		webdriverUtility.implicitwait(longTimeout);
	}
	@AfterClass(alwaysRun=true)
	/**
	 * This class is used to close the browser
	 */
	public void classTearDown() 
	{
		webdriverUtility.closeBrowser();
	}

}

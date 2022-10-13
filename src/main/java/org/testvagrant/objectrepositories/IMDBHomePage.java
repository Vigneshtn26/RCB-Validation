package org.testvagrant.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBHomePage{
	WebDriver driver;
	/**
	 * This method is used to search the element in the search box
	 * @param driver
	 */
		public IMDBHomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//input[@type='text']")
		private WebElement searchBar;
		@FindBy(xpath = "//div[text()='Pushpa: The Rise - Part 1']")
		private WebElement movieName;
		@FindBy(xpath = "//a[text()='December 17, 2021 (United States)']")
		private WebElement releaseDate;
		@FindBy(xpath = "//a[text()='India']")
		private WebElement origin;
		
		public void idmpMovieSearch() {
			//driver.get("https://www.imdb.com/");
			searchBar.sendKeys("Pushpa: The Rise - Part 1");
			movieName.click();
			
		}
		public String movieReleaseDate()
		{
			String rdate = releaseDate.getText();
			System.out.println(rdate);
			return rdate;
		}
		public String movieOrgin()
		{
			String org = origin.getText();
			return org;
		}
}

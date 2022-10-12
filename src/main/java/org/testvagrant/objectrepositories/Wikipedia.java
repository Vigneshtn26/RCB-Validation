package org.testvagrant.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia {
	WebDriver driver;
	/**
	 * This method is used to search the element in the search box
	 * @param driver
	 */
	public Wikipedia(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//input[@class='vector-search-box-input']")
	private WebElement wikiSearchBar;
	@FindBy(xpath = "//a[@title='Pushpa: The Rise']")
	private WebElement wikiMovieName;
	@FindBy(xpath = "//li[text()='17 December 2021']")
	private WebElement wikiReleaseDate;
	@FindBy(xpath = "//td[text()='India']")
	private WebElement wikiOrigin;
	
	public void wikiMovieSearch()
	{
		wikiSearchBar.sendKeys("Pushpa: The Rise");
		wikiMovieName.click();
	}
	public String wikiMovieReleaseDate()
	{
		String rdate = wikiReleaseDate.getText();
		System.out.println(rdate);
		return rdate;
	}
	public String wikiMovieOrgin()
	{
		String org = wikiOrigin.getText();
		System.out.println(org);
		return org;
	}
}

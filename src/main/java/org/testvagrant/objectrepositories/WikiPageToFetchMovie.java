package org.testvagrant.objectrepositories;

import org.testng.annotations.Test;
import org.testvagrant.genericUtility.BaseClass;

public class WikiPageToFetchMovie extends BaseClass
{
	@Test
	public void wikiHomePage()
	{
		 Wikipedia wik=new Wikipedia(driver);
		 driver.get("https://en.wikipedia.org/wiki/Wikipedia");
		 wik.wikiMovieSearch();
		 wik.wikiMovieReleaseDate();
		 wik.wikiMovieOrgin();
	}

}

package org.testvagrant;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testvagrant.genericUtility.BaseClass;
import org.testvagrant.objectrepositories.IMDBHomePage;
import org.testvagrant.objectrepositories.Wikipedia;

public class ImdbHomePageToFetchMovie extends BaseClass
{
	    @Test
		public void imdbPushpaMovie()
		{
			IMDBHomePage id = new IMDBHomePage(driver);
			driver.get("https://www.imdb.com/");
			id.idmpMovieSearch();
			String movieDate = id.movieReleaseDate();
			String movieCountry = id.movieOrgin();
			
			Wikipedia wik=new Wikipedia(driver);
			driver.get("https://en.wikipedia.org/wiki/Wikipedia");
			wik.wikiMovieSearch();
			String movieDate2 = wik.wikiMovieReleaseDate();
			
			String movieCountry2 = wik.wikiMovieOrgin();
           //Validation
			if(movieDate.contains(movieDate2))
			{
				System.out.println("Release Date Match");
			}
			else
			{
				System.out.println("Not matched");
			}
			Assert.assertEquals(movieCountry, movieCountry2);
		}
}


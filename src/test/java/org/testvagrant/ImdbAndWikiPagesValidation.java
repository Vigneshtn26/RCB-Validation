package org.testvagrant;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testvagrant.genericUtility.BaseClass;
import org.testvagrant.objectrepositories.IMDBHomePage;
import org.testvagrant.objectrepositories.Wikipedia;

public class ImdbAndWikiPagesValidation extends BaseClass
{
	    @Test
		public void ValidationOfImdbAndWikiPage()
		{
			IMDBHomePage id = new IMDBHomePage(driver);
			driver.get("https://www.imdb.com/");
			id.idmpMovieSearch();
			String movieDate = id.movieReleaseDate();
			String movieCountry = id.movieOrgin();
			movieDate=movieDate.substring(0,18);
			movieDate=movieDate.replaceAll(",", "");
			movieDate=movieDate.replaceAll(" ", "");
			
			Wikipedia wik=new Wikipedia(driver);
			driver.get("https://en.wikipedia.org/wiki/Wikipedia");
			wik.wikiMovieSearch();
			String movieDate2 = wik.wikiMovieReleaseDate();
			movieDate2=movieDate2.replaceAll(" ", "");
			String movieCountry2 = wik.wikiMovieOrgin();
//            System.out.println(movieDate2);
			
//			//Validation
			char[] ch1=movieDate.toCharArray();
			char[] ch2=movieDate2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
			System.out.println("Release Date is matching");
			}
			Assert.assertEquals(movieCountry, movieCountry2);
		}
}


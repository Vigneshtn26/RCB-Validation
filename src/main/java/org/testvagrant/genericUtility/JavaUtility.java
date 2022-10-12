package org.testvagrant.genericUtility;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class JavaUtility {
	WebDriver driver;
	public int getRandomNumber()
	{
		return new Random().nextInt(1000);
	}
	/**
	 * This method is used to convert the String to Long data type
	 * @param stringData
	 * @return
	 */
	public long convertStringToLong(String stringData)
	{
		return Long.parseLong(stringData);
	}
	/**
	 * This method is used to print the value in Console 
	 * @param statement
	 */
	public void printStatement(String statement)
	{
		System.out.println(statement);

	}

}

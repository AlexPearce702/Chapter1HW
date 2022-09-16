/**Class: Bike.java
* @author Alex Pearce
* @version 1.0
* Course : ITEC 2150-09 Fall 2022
* Written: Sep 15, 2022
*
*
* This class – Stores information for different bikes including number of wheels, manufacturer, and years, and also includes getters and setters to set up the objects created.
*/


public class Bike
{
	//These are the original instance variables
	private int numberOfWheels;
	private String manufacturer;
	private int year;
	
	//this is the first constructor with no parameters that also initializes the variables
	public Bike()
	{
		numberOfWheels = 2;
		manufacturer = "Schwinn";
		year = 2014;
	}

	/**
	 * this getter returns the number of wheels 
	 */
	public int getNumberOfWheels()
	{
		return numberOfWheels;
	}

	/**
	 * this setter changes the number of wheels variable
	 */
	public void setNumberOfWheels(int newNumberOfWheels)
	{
		this.numberOfWheels = newNumberOfWheels;
	}

	/**
	 * this getter returns the manufacturer
	 */
	public String getManufacturer()
	{
		return manufacturer;
	}

	/**
	 * this setter changes the manufacturer
	 */
	public void setManufacturer(String newManufacturer)
	{
		this.manufacturer = newManufacturer;
	}

	/**
	 * this getter returns the year
	 */
	public int getYear()
	{
		return year;
	}

	/**
	 * the setter changes the year of the bike
	 */
	public void setYear(int newYear)
	{
		this.year = newYear;
	}
	//this toString() method neatly displays the information of the bike objects
	@Override
	public String toString()
	{
		return "The Bike's number of wheels is: " + numberOfWheels + "," + " The manufacturer is: " + manufacturer + "," + " the year is: " + year; 
	}
	
	
}

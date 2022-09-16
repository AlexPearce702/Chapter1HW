/**Class: Person.java
* @author Alex Pearce
* @version 1.0
* Course : ITEC 2150-09 Fall 2022
* Written: Sep 15, 2022
*
*
* This class – Stores information including name, eye color, and age for different people, and contains methods to say different phrases
*/


public class Person
{
	/**
	 * These are the initial instance variables
	 */
	private String name;
	private int age;
	private String eyeColor;
	
	// This first constructor has no arguments and initializes the variables
	public Person()
	{
		name = "";
		age = 0;
		eyeColor = "";
	}
	
	/**
	 * This constructor has a three parameter constructor and sets the values to the entered parameters.
	 */
	public Person(String name, int age, String eyeColor)
	{
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
	}

	//this getter returns the name of the person
	public String getName()
	{
		return name;
	}
	//this setter changes the name of the person
	public void setName(String newName)
	{
		this.name = newName;
	}
	//this getter returns the age of the person
	public int getAge()
	{
		return age;
	}
	//this setter changes the age of the person
	public void setAge(int newAge)
	{
		this.age = newAge;
	}
	//this getter returns the eye color of the person
	public String getEyeColor()
	{
		return eyeColor;
	}

	//this setter sets the eye color of the person object
	public void setEyeColor(String newEyeColor)
	{
		this.eyeColor = newEyeColor;
	}
	//this method states the name of the person if called
	public void talk()
	{
		System.out.print("Welcome, coders! I am " + name);
	}
	//the toString() method neatly organizes the information and allows it to be printed out.
	@Override
	public String toString()
	{
		return "Name is: " + name + "," + " age is: " + age + "," +  " eye color is: " + eyeColor;
	}
	
}

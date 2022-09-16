import java.util.ArrayList;

/**Class: BikeTester.java
* @author Alex Pearce
* @version 1.0
* Course : ITEC 2150-09 Fall 2022
* Written: Sep 15, 2022
*
*
* This class – This class creates different bike and calls different methods to test the Bike class. It also creates and array list to add the bikes to.
*/


public class BikeTester
{

	public static void main(String[] args)
	{
		Bike bike1 = new Bike();
		System.out.println(bike1);
		Bike bike2 = new Bike();
		bike2.setNumberOfWheels(3);
		bike2.setManufacturer("The Blue Zoomer");
		bike2.setYear(1997);
		System.out.println(bike2);
		
		
		ArrayList <Bike> bikeList = new ArrayList<>();
		bikeList.add(bike1);
		bikeList.add(bike2);
		System.out.println(bikeList);
	}

}

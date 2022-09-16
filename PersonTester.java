/**Class: PersonTester.java
* @author Alex Pearce
* @version 1.0
* Course : ITEC 2150-09 Fall 2022
* Written: Sep 15, 2022
*
*
* This class – Creates objects for the person class, and tests the class code works properly
*/

public class PersonTester
{
	public static void main (String[] args)
	{
		Person person1 = new Person();
		System.out.println(person1);
		person1.setName("Howard Roark");
		System.out.println(person1);
		person1.talk();
		
	}
}

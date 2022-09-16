/**Class: TextBookTester.java
* @author Alex Pearce
* @version 1.0
* Course : ITEC 2150-09 Fall 2022
* Written: Sep 15, 2022
*
*
* This class – Creates objects and invokes different methods to test the TextBook class.
*/


public class TextBookTester
{	
	public static void main (String[] args)
	{
		TextBook t1 = new TextBook();
		t1.setAuthor("Johnson");
		t1.setCover("Hard");
		t1.setNumberOfPages(641);
		System.out.println(t1);
		t1.longBook();
		System.out.println(t1.getAuthor());
		
		TextBook t2 = new TextBook(200, "Randolf", "Soft");
		System.out.println(t2);
				
	}

}

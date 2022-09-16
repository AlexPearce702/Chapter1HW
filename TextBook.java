/**Class: textBook.java
* @author Alex Pearce
* @version 1.0
* Course : ITEC 2150-01 Spring 2022
* Written: Sep 15, 2022
*
*
* This class – Stores information like number of pages, author, and type of cover for different textbooks and also can determine if the book is over 500 pages.
*/


public class TextBook
{
	
	/**
	 * These instance variables store different information about the textbooks.
	 */
	private int numberOfPages;
	private String author;
	private String cover;
	
	
	/**
	 * This constructor has no arguments and initializes the instance variables.
	 */
	public TextBook()
	{
		numberOfPages = 0;
		author = "";
		cover = "";
	}
	/**
	 * This constructor has a three parameter constructor and sets the values to the entered parameters.
	 */
	
	public TextBook(int numberOfPages, String author, String cover)
	{
		this.numberOfPages = numberOfPages;
		this.author = author;
		this.cover = cover;
	}

	/**
	 * This getter returns the number of pages.
	 */
	public int getNumberOfPages()
	{
		return numberOfPages;
	}

	/**
	 * This setter sets the number of pages
	 */
	public void setNumberOfPages(int newNumberOfPages)
	{
		this.numberOfPages = newNumberOfPages;
	}

	/**
	 * this getter returns the author
	 */
	public String getAuthor()
	{
		return author;
	}

	/**
	 * this setter sets the entered author
	 */
	public void setAuthor(String newAuthor)
	{
		this.author = newAuthor;
	}

	/**
	 * this getter retrieves the cover
	 */
	public String getCover()
	{
		return cover;
	}

	/**
	 * this setter sets the type of cover
	 */
	public void setCover(String newCover)
	{
		this.cover = newCover;
	}
	
	/**
	 * this method determines if the textbook is long if it is equal too, or over 500 pages.
	 */
	public void longBook()
	{
		if(numberOfPages >= 500)
		{
			System.out.println("This is a long book!");
		}
		else 
		{
			System.out.println("This book is a decent length!");
		}
	}
	/**
	 * This toString() method neatly displays all the information on the textbook
	 */
	@Override
	public String toString()
	{
		return "This book has " + numberOfPages + " pages, " + "the author is: " + author + "," + " and this book has a " + cover + "cover.";
	}
	
	
}

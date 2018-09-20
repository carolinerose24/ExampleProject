package model;

public class LiterallyAnything
{
//----------------------Data Members---------------------------------
	private String Title;
	private int Number1;
	private double Number2;
	
	public LiterallyAnything()
	{
		Title = "First Title";
		Number1 = 8;
		Number2 = 8;
	}
	
	public LiterallyAnything (String Title, int Number1, double Number2)
	{
		this.Title = Title;
		this.Number1 = Number1;
		this.Number2 = Number2;
	}
	
	
//----------------------Getters---------------------------------
	
	public String getTitle()
	{
		return Title;
	}
	
	public int getNumber1()
	{
		return Number1;
	}
	
	public double getNumber2()
	{
		return Number2;
	}
	
//-----------------------Setters---------------------------------
	
	public void setTitle(String Title)
	{
		this.Title = Title; 
	}
	
	public void setNumber1 (int Number1)
	{
		this.Number1 = Number1;
	}
	
	public void setNumber2 (double Number2)
	{
		this.Number2 = Number2;
	}
	
	//----------------------------this is sent to the controller---------------------
	public String toString()
	{
		String description = "The title is " + Title + ". The first number is " + Number1 + ". The second number is " + Number2 + ".";
		return description;
	}
	
}

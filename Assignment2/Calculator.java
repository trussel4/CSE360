/*
Name: Travis Russell
Cse360 Assignment 2
ID: 1210982198

The following is problem 1 from the assignment with the comments
added and no code changes made.
*/
public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	//returns the total value in the calculator thus far
	public int getTotal () {
		return total;
	}
	
	//will add values given an int (value)
	public void add (int value) {
		total = total + value;
	}
	
	//will subtract values given an int (value)
	public void subtract (int value) {
		total = total - value;
	}
	
	//will multiply values given an int (value)
	public void multiply (int value) {
		total = total * value;
	}
	
	//will divide values given an int (value)
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		else
			total = total / value;
		}
	}
	
	//will return the history of the calculator
	public String getHistory () {
		return "";
	}

}
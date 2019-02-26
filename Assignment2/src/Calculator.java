/*
Name: Travis Russell
Cse360 Assignment 2
ID: 1210982198
The following is problem 3 from the assignment with all past functions
and the get-history function also added
*/

public class Calculator {

	private int total;
	StringBuffer past;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		past = new StringBuffer("0"); //to keep track of past calculations
	}
	
	//returns the total value in the calculator thus far
	public int getTotal () {
		return total;
	}
	
	//will add values given an int (value)
	public void add (int value) {
		total = total + value;
		past.append("+" + value);
	}
	
	//will subtract values given an int (value)
	public void subtract (int value) {
		total = total - value;
		past.append("-" + value);
	}
	
	//will multiply values given an int (value)
	public void multiply (int value) {
		total = total * value;
		past.append("*" + value);
	}
	
	//will divide values given an int (value)
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
		}
		else total = total / value;
		past.append("/" + value);
	}
	
	//will return the history of the calculator
	public String getHistory () {
		return past.toString();
	}

}
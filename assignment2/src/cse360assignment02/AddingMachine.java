package cse360assignment02;

public class AddingMachine {
  private int total;
  private String memory;
  
  //Link to github repo
  //https://github.com/bgregor4/CSE360Assignment2
  //username: bgregor4
  //email: bgregor4@asu.edu
  //Bryson Gregory
  //total keeps track of the transaction  amount
  //memory keeps track of the history of the transactions
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    memory = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  memory = memory + " + " + value;
	  
  }

  public void subtract (int value) {
	  total = total - value;
	  memory = memory + " - " + value;
	  
  }

  public String toString () {
    return memory;
  }

  public void clear() {
	  memory = "";
  }
}
/**
 * 
 */
package src;

/**
 * @author clark27b
 *
 */
public class Inventory {
	private int partsSugar;
	private int partsMilk;
	private int partsBeans;
	
	public Inventory(int fullVal) {
		partsSugar = fullVal;
		partsMilk = fullVal;
		partsBeans = fullVal;
	}
	
	public int getCoffee() {
		return partsBeans;
	}
	public int getMilk() {
		return partsMilk;
	}	
	public int getSugar() {
		return partsSugar;
	}
	
	public void setCoffee(int coffee) {
		partsBeans = coffee;
	}
	public void setMilk(int milk) {
		partsMilk = milk;
	}	
	public void setSugar(int sugar) {
		partsSugar = sugar;
	}
}

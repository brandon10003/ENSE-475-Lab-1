/**
 * 
 */
package src;

/**
 * @author clark27b
 *
 */
public class Recipe {
	private String recipeName;
    private int milkLevel;
    private int sugarLevel;
    private int coffeeLevel;
	
    public Recipe(java.lang.String recipeName,
            int milkLevel,
            int sugarLevel,
            int coffeeLevel) {
    	
	}
    
    public int getCoffeeLevel() {
    	return coffeeLevel;
    }

    public int getMilkLevel() {
    	return milkLevel;
    }
    
    public String getRecipeName() {
    	return recipeName;
    }
    
    public int getSugarLevel() {
    	return sugarLevel;
    }
    
}

/**
 * 
 */
package src;

/**
 * @author clark27b
 *
 */
public class CoffeeMaker {
	public static final int MAX_INVENTORY = 20;
	public static final int MAX_NUM_RECIPES = 4;
	src.Inventory makerInventory;
	src.Recipe[] recipeArray;
	
	public CoffeeMaker() {
		src.Inventory makerInventory = new src.Inventory(MAX_INVENTORY);
		src.Recipe[] recipeArray = new src.Recipe[MAX_NUM_RECIPES];
	}
	
	public boolean addRecipe(src.Recipe rAdd) {
		int control = 0;
		while (recipeArray[control] != null && control < MAX_NUM_RECIPES) {
			control++;
		}
		if(control == MAX_NUM_RECIPES) {
			return false;
		}
		recipeArray[control] = rAdd;
		return true;
	}
	
	public boolean deleteRecipe(String recipeName) {
		for (int i=0; i<recipeArray.length;i++) {
			if(recipeArray[i].getRecipeName() == recipeName) {
				recipeArray[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public src.Inventory getInventory() {
		return makerInventory;
	}
	
	public src.Recipe getRecipe(String recipeName) {
		for (int i=0; i<recipeArray.length;i++) {
			if(recipeArray[i].getRecipeName() == recipeName) {
				return recipeArray[i];
			}
		}
		return null;
	}
	
	public boolean makeCoffee(String recipeName) {
		src.Recipe recipe = getRecipe(recipeName);
		
		if (makerInventory.getCoffee() >= recipe.getCoffeeLevel()) {
		makerInventory.setCoffee(makerInventory.getCoffee() - recipe.getCoffeeLevel());
		}
		else {
			return false;
		}
		
		if (makerInventory.getSugar() >= recipe.getSugarLevel()) {
		makerInventory.setSugar(makerInventory.getSugar() - recipe.getSugarLevel());
		}
		else {
			return false;
		}
		
		if (makerInventory.getMilk() >= recipe.getMilkLevel()) {
		makerInventory.setMilk(makerInventory.getMilk() - recipe.getMilkLevel());
		}
		else {
			return false;
		}
		return true;
	}
}


package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private List<Ingredient> ingredients;
	
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) {
		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}
		
		if(searched!=null) {
			searched.addWeight(w);
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
	
	public int findIngredient(String n) {
		int flag = -1;
		for(int i = 0; i< ingredients.size()&& flag == -1;i++) {
			Ingredient ingre = ingredients.get(i);
			if(ingre.getName().equals(n)) {
				flag = i;
			}
		}
		
		return flag;
	} 
	
	
	
}

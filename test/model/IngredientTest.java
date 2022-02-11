package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exception.NegativeNumberException;

class IngredientTest {
	
	//estado 
	
	private double addW;  
	private double removeW;
	
	private Ingredient ingredient;
	//escenario 
	
	public void setupStage1() {
		
		ingredient = new Ingredient("tomate", 245.0);
				
	}
	
	@Test
	void test1() {
		addW = 54;
		setupStage1();
		ingredient.addWeight(addW);
		
		assertEquals(299,ingredient.getWeight());
		
	}
	
	@Test
	void test2() throws NegativeNumberException{
		
		setupStage1();
		
		addW = -100;
		try {
			if (addW < 0) {
				throw new NegativeNumberException();
			}
		}catch(NegativeNumberException ex) {
			ex.printStackTrace();
		}
		assertEquals(245, ingredient.getWeight());
	}
	
	@Test
	void test3() {
		removeW = 45;
		setupStage1();
		ingredient.removeWeight(removeW);
		
		assertEquals(200,ingredient.getWeight());
	}
	
	
	@Test
	void test4() throws NegativeNumberException{
		
		setupStage1();
		
		removeW = -100;
		try {
			if (removeW< 0) {
				throw new NegativeNumberException();
			}
		}catch(NegativeNumberException ex) {
			ex.printStackTrace();
		}
		assertEquals(245, ingredient.getWeight());
	}
	
	

}

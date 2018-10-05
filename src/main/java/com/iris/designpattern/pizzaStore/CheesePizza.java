/**
 * 
 */
package com.iris.designpattern.pizzaStore;

import com.iris.designpattern.pizzaStore.ingredientFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
		PizzaIngredientFactory ingredientFactory;
		
		public CheesePizza(String name, PizzaIngredientFactory ingredientFactory) {
			this.name = name;
			this.ingredientFactory = ingredientFactory;
		}

		@Override
		public void prepare() {
			System.out.println("Preparing "+name);
			dough = ingredientFactory.createDough();
			sauce = ingredientFactory.createSauce();
			System.out.println("\t- Vegies:");
			veggies = ingredientFactory.createVeggies();
		}
		

}

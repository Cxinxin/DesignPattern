package com.iris.designpattern.pizzaStore;

import com.iris.designpattern.pizzaStore.ingredientFactory.NYPizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {


	@Override
	public Pizza createPizza(String item) {
		Pizza pizza;

		NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (item.equals("Cheese"))
			pizza = new CheesePizza("NY Style Cheese Pizza",ingredientFactory);
		else if (item.equals("Pepperoni"))
			pizza = new PepperoniPizza("NY Style Pepperoni Pizza",ingredientFactory);
		else
			pizza = null;

		return pizza;
	}

}

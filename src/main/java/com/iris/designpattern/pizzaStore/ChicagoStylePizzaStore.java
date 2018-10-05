/**
 * 
 */
package com.iris.designpattern.pizzaStore;

import com.iris.designpattern.pizzaStore.ingredientFactory.ChicagoPizzaIngredientFactory;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		Pizza pizza;
		if (item.equals("Cheese"))
			pizza = new CheesePizza("Chicago Style Cheese Pizza", new ChicagoPizzaIngredientFactory());
		else if (item.equals("Pepperoni"))
			pizza = new PepperoniPizza("Chicago Style Pepperoni Pizza",new ChicagoPizzaIngredientFactory());
		else
			pizza = null;

		return pizza;
	}

}

/**
 * 
 */
package com.iris.designpattern.pizzaStore.ingredientFactory;

import com.iris.designpattern.pizzaStore.ingredients.*;
import com.iris.designpattern.pizzaStore.veggies.Veggies;

/**
 * @author Alex
 *
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createChesse();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}

/**
 * 
 */
package com.iris.designpattern.pizzaStore;


import com.iris.designpattern.pizzaStore.ingredients.Clams;
import com.iris.designpattern.pizzaStore.ingredients.Dough;
import com.iris.designpattern.pizzaStore.ingredients.Pepperoni;
import com.iris.designpattern.pizzaStore.ingredients.Sauce;
import com.iris.designpattern.pizzaStore.veggies.Veggies;

/**
 * @author Alex
 *
 */
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Pepperoni pepperoni;
	Clams clams;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 mins at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place the pizza in official PizzaStrore box");
	}

	public String getName() {
		return name;
	}
}

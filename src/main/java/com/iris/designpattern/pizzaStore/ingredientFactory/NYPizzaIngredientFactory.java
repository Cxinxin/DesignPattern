package com.iris.designpattern.pizzaStore.ingredientFactory;

import com.iris.designpattern.pizzaStore.ingredients.*;
import com.iris.designpattern.pizzaStore.veggies.Garlic;
import com.iris.designpattern.pizzaStore.veggies.Onion;
import com.iris.designpattern.pizzaStore.veggies.RedPepper;
import com.iris.designpattern.pizzaStore.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createChesse() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SpicyPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClam();
	}

}

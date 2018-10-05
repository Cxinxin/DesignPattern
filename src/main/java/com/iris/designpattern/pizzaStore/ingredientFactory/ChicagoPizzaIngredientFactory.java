package com.iris.designpattern.pizzaStore.ingredientFactory;

import com.iris.designpattern.pizzaStore.ingredients.*;
import com.iris.designpattern.pizzaStore.veggies.Garlic;
import com.iris.designpattern.pizzaStore.veggies.Onion;
import com.iris.designpattern.pizzaStore.veggies.RedPepper;
import com.iris.designpattern.pizzaStore.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

	@Override
	public Cheese createChesse() {
		return new ReggianoCheese();
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
		return new FrozenClam();
	}

}

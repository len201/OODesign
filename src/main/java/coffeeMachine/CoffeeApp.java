package coffeeMachine;

import java.util.HashMap;
import java.util.Map;

public class CoffeeApp {
	public static void main(String[] args) {
		// create a Map of available coffee beans
		Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
		beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean(
				"My favorite espresso bean", 1000));
		beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean(
				"My favorite filter coffee bean", 1000));

		// get a new CoffeeMachine object
		BasicCoffeeMachine machine = new BasicCoffeeMachine(beans);

		// brew a fresh coffee
		try {
			Coffee espresso = machine.brewCoffee(CoffeeSelection.ESPRESSO);
			System.out.println("Coffee is ready!");
		} catch (CoffeeException e) {
			e.printStackTrace();
		}
	} // end main
} // end CoffeeApp
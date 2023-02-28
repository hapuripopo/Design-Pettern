package factory;

import coffes.Coffee;
import coffes.Latte;

public class LatteMaker extends CoffeeMaker{

    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}

package factory;

import coffes.Americano;
import coffes.Coffee;

public class AmericanoMaker extends CoffeeMaker{

    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}

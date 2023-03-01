package coffes;

import strategies.PayStrategy;

public class Latte implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("Making Coffee . . . Latte");
    }
}

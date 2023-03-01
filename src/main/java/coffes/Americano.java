package coffes;

import strategies.PayStrategy;

public class Americano implements Coffee{
    @Override
    public void makeCoffee() {
        System.out.println("Making Coffee . . . Americano");
    }
}

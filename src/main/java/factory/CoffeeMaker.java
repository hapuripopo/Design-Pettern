package factory;

import coffes.Coffee;

public abstract class CoffeeMaker {
    public void making() {
        //여기에서 구상 제품과 생성 클래스 사이 의존성 주입?
        Coffee coffee = createCoffee();
        coffee.makeCoffee();
    }
    public abstract Coffee createCoffee();
}

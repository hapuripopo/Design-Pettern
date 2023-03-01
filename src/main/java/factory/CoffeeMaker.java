package factory;

import coffes.Coffee;

public abstract class CoffeeMaker {
    public void making() {
        //여기에서 구상 제품과 생성 클래스 사이 의존성 주입
        Coffee coffee = createCoffee();
        coffee.makeCoffee();
    }

    /**
     * Factory Method - Creator
     * 클라이언트 코드에서 결정한 Coffee 객체를 반환합니다.
     * @return Coffee : Americano, Latte 객체를 반환할 수 있습니다.
     */
    public abstract Coffee createCoffee();
}

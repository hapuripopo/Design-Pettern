package coffes;

import strategies.PayStrategy;

public interface Coffee {
    // 메뉴판 ... 적절한 방법은 아니지만,
    // 디자인 패턴을 차례로 적용하기 위한 방법입니다.
    static final int Americano = 3000;
    static final int Latte = 4000;

    void makeCoffee();
}

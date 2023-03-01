import coffes.Americano;
import coffes.Coffee;
import factory.AmericanoMaker;
import factory.CoffeeMaker;
import factory.LatteMaker;
import strategies.KAKAOCardStrategy;
import strategies.LUNACardStrategy;
import strategies.PayStrategy;

public class Demo {
    private static CoffeeMaker coffeeMaker;
    private static PayStrategy payStrategy;
    private static int payAmount;
    public static void main(String []args){
        // 메뉴와 결재수단을 선택 해 주세요.
        String payment = "LUNA";
        String menu = "Latte";

        menuConfig(menu);           // 메뉴를 고르고
        paymentConfig(payment);     // 결재 수단을 선택하여
        payStrategy.pay(payAmount); // 결재합니다.
        coffeeMaker.making();       // 적절한 음료를 만듭니다 !
    }

    /**
     * 어떤 커피를 먹을지 선택하여 커피를 만듭니다.
     * @param menu
     */
    static void menuConfig(String menu){
        if (menu.equals("Latte")){
            coffeeMaker = new LatteMaker();
            payAmount = Coffee.Latte;
        } else {
            coffeeMaker = new AmericanoMaker();
            payAmount = Coffee.Americano;
        }
    }

    /**
     * 결재 수단을 선택하여 결재합니다.
     * @param payment 결재 할 금액을 입력 받습니다.
     */
    static void paymentConfig(String payment){
        if(payment.equals("KAKAO")){
            payStrategy = new KAKAOCardStrategy();
        } else {
            payStrategy = new LUNACardStrategy();
        }
    }
}

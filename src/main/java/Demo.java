import factory.AmericanoMaker;
import factory.CoffeeMaker;
import factory.LatteMaker;

public class Demo {
    public static CoffeeMaker coffeeMaker;
    public static void main(String []args){
        //입력을 받는다고 가정합니다.
        String input = "Latte";
        Configure(input);       //입력에 맞추어 config 합니다.
        coffeeMaker.making();   //적절한 음료를 만듭니다 !
    }

    static void Configure(String input){
        if (input.equals("Latte")){
            coffeeMaker = new LatteMaker();
        } else {
            coffeeMaker = new AmericanoMaker();
        }
    }
}

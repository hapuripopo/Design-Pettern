package strategies;

public class LUNACardStrategy implements PayStrategy{
    private String email;
    private String passwd;

    @Override
    public boolean pay(int paymentAmount) {
        if(paymentAmount > 0){
            System.out.println(paymentAmount + " paid using LUNACard.");
            return true;
        } else {
            return false;
        }
    }
}

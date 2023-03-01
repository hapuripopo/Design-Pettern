package strategies;

public class KAKAOCardStrategy implements PayStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    @Override
    public boolean pay(int paymentAmount) {
        if(paymentAmount > 0){
            System.out.println(paymentAmount + " paid using KAKAOCard.");
            return true;
        } else {
            return false;
        }
    }
}

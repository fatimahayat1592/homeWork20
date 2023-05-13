package homeWork20;

public class CreditCard {
   /* Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
            Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/
   protected double balance;
    protected double interest;
     CreditCard(double balance,double interest){
       this.balance=balance;
       this.interest=interest;
    }
    public void calculateInterest(){

        System.out.println("Interest is "+(balance*interest));
    }
}
class Visa extends CreditCard{
    Visa(double balance,double interest){
        super(balance,interest);
    }
}
class AX extends CreditCard {
    AX(double balance, double interest) {
        super(balance, interest);
    }
   public void calculateInterest(){
       System.out.println("Interest is "+(balance*(interest+0.01)));
    }

}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard cc=new CreditCard(5000,0.1);
        Visa visa=new Visa(7000,0.3);
        AX ax=new AX(9000,0.1);
        cc.calculateInterest();
        visa.calculateInterest();
        ax.calculateInterest();

    }
}
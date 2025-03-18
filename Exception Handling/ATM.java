import java.util.Scanner;
 class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String Message){
        super(Message);
    }

}
public class ATM {
private double balance;
public ATM(double initialBalance){
    this.balance=initialBalance;
}
public void withdraw(double amount) throws InsufficientBalanceException{
    if(amount>balance){
        throw new InsufficientBalanceException("Insufficient Balance! Your Current Balance is:"+balance);
    }
    else{
        balance-=amount;
        System.out.println("Withdrawn Successfully ! Remaning Balance:" +balance);
    }

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATM myatm=new ATM(5000);

        try{
            System.out.println("Enter withdrawn amount:");
            double amount=sc.nextDouble();
            if(amount<=0){
                throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
            }
            myatm.withdraw(amount);
        }catch (InsufficientBalanceException e){
            System.out.println("Exception:" +e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Invalid input:"+e.getMessage());
        }catch(Exception e){
            System.out.println("An unexpected error occures:"+e.getMessage());
        }finally{
            System.out.println("Transaction ended. Thank you for using our ATM");
        }
        }
    }

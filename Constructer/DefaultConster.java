class Bank{
    int account;
    int balance;
    Bank(){
        account=345678;
        balance=999900;
    }
    public void Show(){
        System.out.println("Account Number:" +account);
        System.out.println("Balance in account:" +balance);
    }
}
class DefaultConster{
    public static void main(String[] args){
        Bank b=new Bank();
        b.Show();
    }
}
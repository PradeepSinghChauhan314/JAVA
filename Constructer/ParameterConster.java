class Bank{
    int acc;
    int bal;
    Bank(int a,int b){
        acc=a;
        bal=b;
        System.out.println("Account Number:" +acc);
        System.out.println("Balance:" +bal);
    }
}

public class ParameterConster {
    public static void main(String[] args) {
        Bank b=new Bank(400000, 500000);
    }
}


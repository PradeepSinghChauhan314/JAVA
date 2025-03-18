package StringandMathFunction;

public class EulersNumber {
    public static long factorial(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;

    }
    public static double calculateE(int terms){
        double e=1.0;
        for(int i=1;i<terms;i++){
            e+=1.0/factorial(i);
        }
        return e;
}
public static void main(String[] args) {
    int terms=20;
    double e=calculateE(terms);
    System.out.println("Calculated value of e"+e);
}
}
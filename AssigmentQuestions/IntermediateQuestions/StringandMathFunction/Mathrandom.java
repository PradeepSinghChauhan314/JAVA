package StringandMathFunction;

public class Mathrandom {
    public static void main(String[] args) {
        double random=Math.random();
        int randomnum=(int)(random*100)+1;
        System.out.println("Random number between  1 and 100: "+randomnum);
    }
    
}

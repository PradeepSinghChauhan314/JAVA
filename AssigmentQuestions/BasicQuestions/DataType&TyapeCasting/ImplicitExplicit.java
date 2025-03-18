public class ImplicitExplicit {
    public static void main(String[] args) {
        int num1=10;
        double num2=num1;//implicit is low datataype to high datatype(int to double)
        System.out.println("Implicit type casting (int to double):"+num2);

        double num3=246.254;
        int num4=(int)num3;//Explicit is high datataype to low datatype(double to int)
        System.out.println("Explicit type casting (double to int):"+num4);
    }
}

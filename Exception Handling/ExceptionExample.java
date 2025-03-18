public class ExceptionExample {

    public static void main(String[] args) {
     try {
        int num =10/0;
     } catch (ArithmeticException e) {
        // TODO: handle exception
     
         System.out.println("cannot divide by zero:" +e.getMessage());   // TODO: handle exception
        }
        finally{
            System.out.println("This bolck shows error");
        }
    }
}
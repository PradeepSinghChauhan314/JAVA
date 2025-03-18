//Throws keyword is used in method to declare exception that a method might occur

import java.io.IOException;

public class Example4 {
    public static void readfile() throws IOException {
        throw new IOException("File not found");
    }
    public static void main(String[] args) {
        try {
            readfile();
        } catch (IOException e) {
         System.out.println("Error caught:" +e.getMessage());   // TODO: handle exception
        }
    }
}

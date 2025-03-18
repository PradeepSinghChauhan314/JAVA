package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int i=1;
        System.out.println("Multipication Table of " +num +" is :");
        while (i<=10) {
            System.out.println(num+"x"+i+"="+(num*i));
            i++;
            
        }
        sc.close();
    }
}

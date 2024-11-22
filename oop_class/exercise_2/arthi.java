/*
Write a program that accepts two integer numbers from the keyboard
and display the sum, difference, product, quotient, and the remainder
of the two numbers.

*/
package oop_class.exercise_2;
import java.util.Scanner;
public class arthi {
    public static void main(String args[]){
        System.out.println("please input the two numbers:");
        Scanner one=new Scanner(System.in);
        System.out.print("the first number:");
        int d=one.nextInt();
        System.out.println("the second number:");
        int t=one.nextInt();
        int Sum,Dif,Pro,Quo,Rem;
        Sum=d+t;
        Dif=d-t;
        Pro=d*t;
        Quo=d/t;
        Rem=d%t;
        System.out.println("the sum of the two numbers is:"+Sum);
        System.out.println("the difference of two numbers is:"+Dif);
        System.out.println("the product of two numbers is:"+Pro);
        System.out.println("the quotient of two numbers is:"+Quo);
        System.out.println("the remainder of two numbers is:"+Rem);

    }
}

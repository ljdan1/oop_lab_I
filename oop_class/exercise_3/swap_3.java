/*
Write a program that reads two integer values from the keyboard and
displays the values before and after swapping them using the third
variable.

*/
package oop_class.exercise_3;
import java.util.Scanner;
public class swap_3 {
    public static void main(String args[]){
        System.out.println("input the two numbers:");
        Scanner n=new Scanner(System.in);
        int r=n.nextInt();
        int t=n.nextInt();
        System.out.println("the first value before swap:"+r);

        System.out.println("the second value before swap:"+t);
        int temp=r;
        r=t;
        t=temp;

        System.out.println("the first value after swap:"+r);

        System.out.println("the second value after swap:"+t);

    }
}

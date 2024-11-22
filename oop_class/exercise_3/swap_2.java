/*
Write a program that reads two integer values from the keyboard and
displays the values before and after swapping without using a third
variable */

package oop_class.exercise_3;
import java.util.Scanner;
public class swap_2 {
    public static void main(String args[]){
        System.out.println("input the two numbers:");
        Scanner g=new Scanner(System.in);
        int r=g.nextInt();
        int y=g.nextInt();
        System.out.println("the first value before swapping:"+r);
        System.out.println("the second value before swapping:"+y);
        y=y+r;
        r=y-r;
        y=y-r;
        System.out.println("the first value after swapping:"+r);
        System.out.println("the second value after swapping:"+y);
    }
}

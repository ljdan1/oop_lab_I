/*
Write a program that will accept a floating number from the keyboard
and display the integer part and fraction part of the number

*/
package oop_class.exercise_2;
import java.util.Scanner;
public class cast {
    public static void main(String args[]){
        Scanner two=new Scanner(System.in);
        System.out.print("please input floating number:");
        float g=two.nextFloat();
        int t=(int)g;
        float d=g-t;
        System.out.print("the integer part is:"+t+" the fraction part is:"+d);

    }
}

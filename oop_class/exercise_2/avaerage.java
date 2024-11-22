/*
Write a program that accepts the score of three students mark from
the keyboard and display the average mark.
*/
package oop_class.exercise_2;
import java.util.Scanner;
public class avaerage {
    public static void main(String args[]){
        System.out.println("please input the score:");
        Scanner a=new Scanner(System.in);
        int s=a.nextInt();
        int t=a.nextInt();
        int u=a.nextInt();
        int ave=(s+t+u)/3;
        System.out.println("the average mark of the three students:"+ave);

    }
}

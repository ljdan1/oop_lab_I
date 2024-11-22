/* Write a program that tells whether a number entered from the
keyboard is a positive number or a negative number or zero.
*/
package oop_class.exercise_4;
import java.util.Scanner;
public class pos_nev {
    public static void main(String args[]){
        System.out.println("please input the number:");
        Scanner g=new Scanner(System.in);
        int j=g.nextInt();
        if(j<0){
            System.out.println(j+" is an negative number.");

        }
        else if(j>0){
            System.out.println(j+" is positive number.");
        }
        else{
            System.out.println(j+" is zero");
        }
    }
}

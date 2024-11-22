/* Write a program that tells whether a number entered from the
keyboard is an even or an odd number.
*/
package oop_class.exercise_4;
import java.util.Scanner;
public class number {
    public static void main(String args[]){
        System.out.println("please input the number:");
        Scanner g=new Scanner(System.in);
        int j=g.nextInt();
        if(j%2==0){
            System.out.println(j+" is an even number.");

        }
        else{
            System.out.println(j+" is odd number.");
        }
    }
}

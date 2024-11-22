/* Write a program that tells whether a character entered from the
keyboard is in upper case or in lower case or neither
*/
package oop_class.exercise_4;
import java.util.Scanner;
public class up_low {
    public static void main(String args[]) {
        System.out.println("please input the character:");
        Scanner g = new Scanner(System.in);
        char j = g.next().charAt(0);
        if(Character.isUpperCase(j)){
            System.out.println(j+" is upper case");

        }
        else if(Character.isLowerCase(j)){
            System.out.println(j+" is lower case");
        }
        else{
            System.out.println(j+" is neither.");
        }
    }
}

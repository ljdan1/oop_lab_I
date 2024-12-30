/*

Write a Java program to create a class called Account with instance
variables accountNumber and balance. Implement a parameterized
constructor that initializes these variables with validation:
 accountNumber should be non-null and non-empty.
 balance should be non-negative
 Print an error message if the validation fails

 */

package oop_class.exercise_5;
import java.util.Scanner;
public class Accountant {
    String accountNumber;
    double balance;
    public Accountant(String ano,double b){
        if(ano == null || ano.isEmpty()) {
            System.err.println("account number must be non-null and non-empty");
        }
        if(b<0){
            System.err.println("balance must be positive number");

    }
            this.accountNumber=ano;
            this.balance=b;
    }
    void display(){
        if(accountNumber!=null && balance>=0){
        System.out.println("accountant number:"+accountNumber);
        System.out.println("accountant balance:"+balance);
    }}

        public static void main(String[] args){
            System.out.print("please input the account number of accountant:");
            Scanner k=new Scanner(System.in);
            String ano=k.nextLine();
            System.out.print("please input the balance of the accountant  that he has in his packet:");
            Scanner l=new Scanner(System.in);
            double b=l.nextDouble();
            Accountant p=new Accountant(ano,b);
            p.display();
        }
}




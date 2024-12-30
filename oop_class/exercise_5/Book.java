/*
Write a Java program to create a class called "Book" with instance
variables title, author, and price. Implement two parameterized
constructors
 One constructor takes title and author as parameters.
 The other constructor takes title, author, and price as parameters.
 Print the values of the variables for each constructor
 */

package oop_class.exercise_5;
import java.util.Scanner;
public class Book {
    String title;
    String author;
    double price;
    Book(String t,String a){
        title=t;
        author=a;
        System.out.println("the title of the book:"+title);
        System.out.println("the author of the book:"+author);

    }
    Book(String t,String a,double p){
        title=t;
        author=a;
        price=p;

        System.out.println("the title of the book:"+title);
        System.out.println("the author of the book:"+author);
        System.out.println("the price of the book:"+price);

    }
    public static void main(String[] args){
        System.out.print("please input the title:");
        Scanner y=new Scanner(System.in);
        String t=y.nextLine();
        System.out.print("please input the author:");
        Scanner k=new Scanner(System.in);
        String a=k.nextLine();
        System.out.print("please input the price:");
        Scanner j=new Scanner(System.in);
        double p=j.nextDouble();
        Book two=new Book(t,a);
        Book all=new Book(t,a,p);
    }
}

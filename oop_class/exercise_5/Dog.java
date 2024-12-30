/*
Write a Java program to create a class called Dog with instance
variables name and color. Implement a parameterized constructor that
takes name and color as parameters and initializes the instance
variables. Print the values of the variables
 */

package oop_class.exercise_5;
import java.util.Scanner;
public class Dog {
    String name;
    String color;
    Dog(String n,String c){
        name=n;
        color=c;
    }
    void display(){
        System.out.println("your name:"+name);
        System.out.println("your favourite color:"+color);
    }
    public static void main(String[] args){
        System.out.println("please input your name:");
        Scanner t=new Scanner(System.in);
        String n=t.nextLine();
        System.out.println("please input favorite color:");
        Scanner f=new Scanner(System.in);
        String c=f.nextLine();
        Dog h= new Dog(n,c);
        h.display();
    }
}


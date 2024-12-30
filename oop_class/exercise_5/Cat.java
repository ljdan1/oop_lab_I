/*
Write a Java program to create a class called “Cat” with instance
variables name and age. Implement no argument constructor that
initializes the name to "Unknown" and the age to 5. Print the values
of the variables.
*/

package oop_class.exercise_5;

public class Cat {
    int age;
    String name;
    Cat() {
        age=5;
        name="Unknown";
    }
    void display(){
        System.out.println("Cat's name:"+name);
        System.out.println("Cat's age:"+age);

    }
    public static void main(String[] args){
        Cat n=new Cat();
        n.display();
    }
}

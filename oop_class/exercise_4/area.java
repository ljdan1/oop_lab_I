/* Write the program to calculate the area of
I Rectangle
I Circle
I Triangle
 */

package oop_class.exercise_4;
import java.util.Scanner;
class area {
    public static void main(String args[]){
        final float pi=3.14f;
        System.out.println("please input the length and width or radius");
        Scanner rd=new Scanner(System.in);
        double rad=rd.nextDouble();
        double len=rd.nextDouble();
        double wid=rd.nextDouble();
        double hie=rd.nextDouble();
        double rect=len*wid;
        double cir=pi*rad*rad;
        double tri=1/2*(hie*wid);
        System.out.println("the area of rectangle is:"+rect);
        System.out.println("the area of circle is:"+cir);System.out.println("the arr");
        System.out.println("the area of triangle is:"+tri);
    }
}

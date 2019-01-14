package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
  public static void main(String[] args) {
  Input input = new Input();
    Scanner scan = new Scanner(System.in);

//  Circle circle1 = new Circle(13);
//    System.out.println(circle1.getArea());
//    System.out.println(circle1.getCircumference());

    int radius = input.getInt("Enter a number for a new circle: ");
    //creates a Second Circle Object that gives the radius from the user input
    Circle circle2= new Circle(radius);
    System.out.printf("The area of your new circle is: %f. %n", circle2.getArea());
    System.out.printf("The circumference of your new circle is: %f. %n", circle2.getCircumference());



  } //end of MAIN
} //end of

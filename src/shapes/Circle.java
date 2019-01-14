package shapes;

public class Circle {

  //this can not be changed
  private double radius;

  //this is a Constructor with a radius that cannot be changed
  public Circle(double radius) {
    this.radius = radius;
  }

  // using "CMD + N" gives you a shortcut to create a Constructor, Getter && Setter after creating a Class
  //GETTER
  public double getRadius() {
    return radius;
  }

  //SETTER
  public void setRadius(double radius) {
    this.radius = radius;
  }

  //BONUS- THIS GETS THE NUMBER OF CIRCLES
//  public Circle(double radius){
//    this.radius = radius;
//    numberOfCircles++; <--- ADD THIS TO YOUR CONSTRUCTOR TO INCREASE NUMBER OF OBJECTS
//  }
//
// public static int getNumberOfCircles() {
//  return numberOfCircles;
//}

  // this gets the area of a circle object
  public double getArea(){
    double area = Math.PI * (Math.pow(radius, 2));
//    System.out.printf("The area of the circle is: %.3f %n", area);
    return area;
  }
// this gets the circumference of a circle object
  public double getCircumference(){
    double circumference = 2 * Math.PI * radius;
//    System.out.printf("The circumference of the circle is: %.3f %n", circumference);
    return circumference;
  }


}

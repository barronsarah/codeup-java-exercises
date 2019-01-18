package shapes;

public class ShapesTest {
  public static void main(String[] args) {
//    Rectangle box1 = new Rectangle(5, 4);
//    System.out.println(box1.getPerimeter());
//    System.out.println(box1.getArea());
//    Rectangle box2 = new Square(5);
//    System.out.println(box2.getPerimeter());
//    System.out.println(box2.getArea());

    Measurable myShape;
    Measurable myShape2;

    myShape = new Square(5);
    System.out.println(myShape.getArea());
    System.out.println(myShape.getPerimeter());

    myShape2 = new Rectangle(6,4);
    System.out.println(((Rectangle) myShape2).getLength());
    System.out.println(((Rectangle) myShape2).getWidth());
    




  } //end of MAIN
} // end of CLASS

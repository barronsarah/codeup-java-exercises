package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

  //----- EXERCISE INHERITANCE AND POLYMORPHISM------------------

  protected int length;
  protected int width;
//
//  public Rectangle(int length, int width) {
//    this.length = length;
//    this.width = width;
//  }
//
//  public void setWidth(int width) {
//    this.width = width;
//  }
//
//  public void setLength(int length) {
//    this.length = length;
//  }
//
//  public int getArea (){
//    int area = length * width;
//    return area;
//  }
//
//  public int getPerimeter(){
//    int perimeter = 2 * length + 2 * width;
//    return perimeter;
//  }
  // ------------ END OF INHERITANCE AND POLYMORPHISM ----------
  //------- START OF ABSTRACT AND INTERFACE EXERCISE------------


  public Rectangle(int length, int width) {
    super(length, width);
    this.length = length;
    this.width = width;
  }

  @Override
  public void setLength() {
    this.length = length;
  }

  @Override
  public void setWidth() {
    this.length = length;
  }

  @Override
  public int getPerimeter() {
    return 2 * length + 2 * width;
  }

  @Override
  public int getArea() {
    return length * width;
  }
}// end of CLASS

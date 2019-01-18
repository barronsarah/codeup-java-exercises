package shapes;

public class Square extends Quadrilateral {

  int side;
  //EXERCISE INHERITANCE AND POLYMORPHISM
//
//  public Square(int side) {
//    super(side, side); //<-- the parent constructor still needs two arguments
//    //DON'T FORGET TO REASSIGN THE PARAMETER WHEN MAKING A NEW OBJECT
//    // TO ASSIGN IT TO WHAT IT IS BEING PASSED THROUGH (BELOW)
//    //vv
//    this.side = side;
//  }
//
//  @Override
//  public int getArea (){
//    int area = (int) Math.pow(side, 2);
//    return area;
//  }
//
//  @Override
//  public int getPerimeter(){
//    int perimeter = 4 * side ;
//    return perimeter;
//  }

  public Square (int side){
    super(side, side);
//    this.side = side;
  }

  @Override
  public void setWidth() {
    this.side = width;
  }

  @Override
  public void setLength() {
    this.side = length;
  }

  @Override
  public int getPerimeter() {
    int perimeter = 4 * side ;
    return perimeter;
  }

  @Override
  public int getArea() {
    return (int) Math.pow(side, 2);
  }
} // end of CLASS



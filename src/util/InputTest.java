package util;

public class InputTest {
  public static void main(String[] args) {
    // dataType variableName = new ClassName();
    Input input = new Input();

    System.out.println(input.getString("Enter something!"));
    System.out.println(input.yesNo("Do you like chocolate ice-cream?"));
    System.out.println(input.getInt("Enter a number between 3 and 40", 3, 40));
    System.out.println(input.getInt("Enter a number!: "));
    System.out.println(input.getDouble("Enter a decimal number between 12.34 and 43.21", 12.34, 43.21));
    System.out.println(input.getDouble("Enter a decimal number!"));

  //if you want to exit the application you can use System.exit(0)
    // to complete the application and exit! :)

//    // if(input.yesNo(Do you want to exit application?")) {
//    System.exit(0);
//    }

  }
}

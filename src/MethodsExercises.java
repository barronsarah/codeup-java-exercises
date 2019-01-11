import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;
public class MethodsExercises {

  public static int Addition(int num1, int num2) {
    return num1 + num2;
  }
  //METHOD OVERLOADING INCLUDES MULTIPLE METHODS THAT SPECIFY DIFFERENT DATA TYPES FOR NUMBERS:
//  EX:
//  public static double Addition(double num1, double num2){
//    return num1 + num2;
//  }
//  public static long Addition(long num1, long num2){
//    return num1 + num2;
//  }
//  -- end of method overload examples ----
//

  public static int Subtraction(int num1, int num2) {
    return num1 - num2;
  }

  public static int Multiplication(int num1, int num2) {
    return num1 * num2;
  }

  public static int Division(int num1, int num2) {
    return num1 / num2;
    //this is written due to it returning a return values
//    public static double Division(double num1, double num2){
//    return num1 / num2;
  }

//  BONUS FOR MULTIPLY: (MULTIPLY WITHOUT * OPERATOR)

  public static long Multiplication(long a, long b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    long product = 0;

    if (b > 1) {
      do {
        product += a;
        b--;
      } while (b >= 1);
    } else {
      do {
        product -= a;
        b++;
      } while (b <= -1);
    }
    return product;
  }

//    MULTIPLY WITHOUT * OPERATOR WITH RECURSION


  public static int Modulus(int num1, int num2) {
    return num1 % num2;
  }

  public static int getInteger(int min, int max) {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    System.out.printf("\nEnter a number between %d and %d: ", min, max);
    int userInt = scan.nextInt();
    if (userInt >= min && userInt <= max) {
      return userInt;
    } else {
      System.out.printf("That number was not between %d - %d", min, max);
      return getInteger(min, max);
    }
  }


  public static long getFactorial(int number) {
    if (number < 1) {
      return 1;
    }
    long factorial = number * getFactorial(number - 1);
    return factorial;
  }
  //WALKTHROUGH EXERCISE ----FACTORIAL ------
// public static int factorial(int number){
//    int result= 1;
//
//    do{
//      result *= number;
//      number--;
//    } while (number >= 1);
//      return result;
//  }


  //Dice roll
  public static void rollDice (int diceNumber) {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    System.out.print("Would you like to roll the dice? [y/n]");
    String userConfirm = scan.next();
    System.out.print("Enter the number of sides for a pair of dice.");
    int numberOfSides = scan.nextInt();
    do {

//      int Random = (int) (Math.random()*numberOfSides +1);
//      Random = new Random();
      double diceOneRoll = Math.random()*numberOfSides +1;
      double diceTwoRoll = Math.random()*numberOfSides +1;
      System.out.format("Your dice roll returned number %s and %s \n", diceOneRoll, diceTwoRoll);
      userConfirm = "n";
      System.out.println("Roll again? [y/n]");
      userConfirm = scan.next();

    }while (userConfirm.equalsIgnoreCase("y"));
  }

  public static void main(String[] args){
//Scanner scan = new Scanner(System.in).useDelimiter("\n");
//    System.out.println(Addition(2, 3));
//    System.out.println(Subtraction(5, 2));
//    System.out.println(Multiplication(5, 2));
//    System.out.println(Division(12, 6));
//    System.out.println(Modulus(5, 2));
//    System.out.println(getInteger(1, 20));
// Factorial print / function call using the getInteger function with a range from 1 to 10
    int userInput = getInteger(1,10);
    System.out.format("The factorial for %d is: %d\n", userInput, getFactorial(userInput));
      rollDice(6);


  }// main end
}// class end

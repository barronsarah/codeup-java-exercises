package util;

import java.util.Scanner;

public class Input {
  private Scanner scanner = new Scanner(System.in);

  public String getString(String prompt){
    System.out.println(prompt);
    return scanner.nextLine();
  }

  public boolean yesNo(String prompt) {
    System.out.println(prompt);
    String input = scanner.next();
    if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
      return true;
    }
    return false;
  }

  public int getInt(String prompt, int min, int max) {
    System.out.println(prompt);
    int input = scanner.nextInt();
    if (input >= min && input <= max) {
      System.out.println("You entered a valid number");
    } else {
      System.out.println("You did not enter a valid number");
      getInt(prompt, min, max);
    }
    return input;
  }

  public int getInt(String prompt){
    System.out.println(prompt);
    return scanner.nextInt();
  }

  public double getDouble(String prompt, double min, double max) {
    System.out.println(prompt);
    double input = scanner.nextDouble();
    if (input >= min && input <= max) {
      System.out.println("You entered a valid number");
    } else {
      System.out.println("You did not enter a valid number");
      getDouble(prompt, min, max);
    }
    return input;
  }

  public double getDouble(String prompt){
    System.out.println(prompt);
    return scanner.nextDouble();
  }

}

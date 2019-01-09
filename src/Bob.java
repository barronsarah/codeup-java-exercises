import java.util.Scanner;
public class Bob {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    System.out.println("Hi, I'm Bob. Let's chat.");
    String userResponse = scan.next();
    String userInput = scan.next();
    do {
      if (userInput.endsWith("?")) {
        System.out.println("Sure");
      }
      if (userInput.endsWith("!")) {
        System.out.println("Whoa, chill out!");
      }
      if (userInput.equals("")) {
        System.out.println("Fine. Be that way!");
      } else {
        System.out.println("Whatever");
      }
      System.out.println("Do you still want to talk to Bob?");
      String userResponse = scan.next();
      scan.next();
    } while(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y"));

  }
}

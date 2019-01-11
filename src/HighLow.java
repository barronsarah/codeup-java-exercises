import java.util.Scanner;
public class HighLow {

  public static int randomNumber(){
    return (int)(Math.random()* 100) +1;
  }

  public static int userNumber(){
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    return  scan.nextInt();
  }

  public static void HighLow(){
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    System.out.println("Hi User! We have a number between 1 and 100, try to guess what it is!");
    int number = randomNumber();
    int user = userNumber();
    do {
      if(user < number){
        System.out.println("Too Low.");
        userNumber();
      } else if(user > number){
        System.out.println("Too High.");
    }
      System.out.println("Guess again: ");
      userNumber();
    }while(user > number || user < number);
  }

public static void main (String[] args){
  Scanner scan = new Scanner(System.in).useDelimiter("\n");
//  int userNumber = scan.nextInt();
  HighLow();

  }
}

/// -----------High Low with user attempts ----------

//public class HighLow {
//  public static void main(String[] args) {
//    MethodsExercises userInput = new MethodsExercises();
//    int numberToGuess = randomNumber();
//    int userGuess, counter = 0, attemptsLeft = 10;
//    System.out.println("We're going to play a game of High-Low");
//
//    do {
//      userGuess = userInput.getInteger(1, 100);
//      System.out.print("Your guess was "+ userGuess);
//      compare(userGuess, numberToGuess);
//      counter++;
//      attemptsLeft--;
//      if (attemptsLeft <=3 ){
//        System.out.print("Attempts left: "+attemptsLeft +"\n");
//      }
//    }while(userGuess != numberToGuess && attemptsLeft != 0);
//    if (attemptsLeft ==0){
//      System.out.println("You ran out of attempts.\nThe number to guess was "+ numberToGuess);
//    }else {
//      System.out.println("It took " + counter + " tries to guess correctly.");
//    }
//  }// end main
//
//  static int randomNumber(){
//    return (int) (Math.random() * 100 )+1;
//  }// end randomNumber
//  static void compare(int a, int b){
//    Guess guess = new Guess();
//    if(a > b){
//      guess.lower();
//    } else if(a < b){
//      guess.higher();
//    } else {
//      guess.correct();
//    }
//  }// end compare
//}// end HighLow class
//class Guess{
//  void higher(){
//    System.out.println("\nTry a higher number.");
//  }
//  void lower(){
//    System.out.println("\nTry a lower number.");
//  }
//  void correct(){
//    System.out.println("\nYou guessed correctly!");
//  }
//}// end Guess class
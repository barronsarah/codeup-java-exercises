import java.util.Random;
import java.util.Scanner;

public class MethodsPractice {
  Scanner scan = new Scanner(System.in).useDelimiter("\n");

  public static void main(String[] args){
//    System.out.println(firstChar("Hello!"));
//    System.out.println(secondChar("Hello!"));
//    System.out.println(lastChar("Hello!"));
//    System.out.println(secondToLastChar("Hello!"));
//    System.out.println(userWantsToContinue("no"));
//    System.out.println(userWantsToContinue("YES"));
//    System.out.println(userWantsToContinue("hola"));
//    System.out.println(isEven(2));
//    System.out.println(isEven(3));
//    System.out.println(isOdd(4));
//    System.out.println(isOdd(7));
//    System.out.println(countOdds(2,7));
//    System.out.println(countEvens(2,7));
//    System.out.println(isVowel("e"));
//    System.out.println(isVowel("T"));
//    System.out.println(hasVowels("Thank you next!"));
//    System.out.println(countVowels("Thank you next!"));
//    System.out.println(fizzBuzzLoop(20));
//    System.out.println(fizzBuzzRecursion(20));
//    System.out.println(isPrime(4));
//    System.out.println(isPrime(3));
//    System.out.println(isPrime(1));
//    System.out.println(isPrime(33));
// ---prints 1st 20 prime numbers in void method call :
//    getTwentyPrimes(20);
//    System.out.println(coinFlip());
    String randomNumberString = randomWalk(13, "");
    System.out.println(randomNumberString);
    int numberOnes = countOnes(randomNumberString);
    System.out.println(numberOnes);
    System.out.println(countZeros(randomNumberString));


  }// end of main

// ----------------- METHODS BELOW ---------------
  //Method that returns 1st character in string
  public static char firstChar(String input){
    return input.charAt(0);
  }
  //Method that returns 2nd character in string
  public static char secondChar(String input){
    return input.charAt(1);
  }

  public static char lastChar(String input){
    return input.charAt(input.length()-1);
  }

  public static char secondToLastChar(String input){
    return input.charAt(input.length()-2);
  }

  public static boolean userWantsToContinue(String input){
    if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")){
      return true;
    }
    return false;
  }

  public static boolean isEven(int input){
    if(input % 2 ==0){
      return true;
    }
    return false;
  }

  public static boolean isOdd(int input){
    if(input % 2 == 1){
      return true;
    }
    return false;
  }

  public static int countOdds(int min, int max){
    int count = 0;
    for(int i = min; i <= max; i++){
      if( isOdd(i) ){
        count ++;
      }
    }
    return count;
  }

  public static int countEvens(int min, int max){
    int count = 0;
    for(int i = min; i <= max; i++){
      if( isEven(i)){
        count ++;
      }
    }
    return count;
  }

  public static boolean isVowel(String input){
    if(input.length() > 1){
      return false;
    } return input.equalsIgnoreCase("a")||
            input.equalsIgnoreCase("e")||
            input.equalsIgnoreCase("i")||
            input.equalsIgnoreCase("o")||
            input.equalsIgnoreCase("u");
  }

  public static boolean hasVowels(String input){
    for(int i =0; i <= input.length()-1; i ++){
      String letter = input.charAt(i) + "";
      if(isVowel(letter)){
        return true;
      }
    }
    return false;
  }

  public static int countVowels(String input){
    int count = 0;
    String letter;
    for(int i= 0; i<= input.length()-1; i++){
      letter = input.charAt(i) + "";
      if(isVowel(letter)){
        count ++;
      }
    }
    return count;
  }

//  public static String fizzBuzzLoop(int number){
//  String result = "";
//
//    for (int i = 1; i <= number; i++) {
//      if(i % 15 == 0){
//         result += "FizzBuzz\n";
//      } else if (i % 5 == 0){
//        result += "Buzz\n";
//      } else if(i % 3 ==0){
//        result += "Fizz\n";
//        }else {
//        result += (i + "\n");
//      }
//    }
//     return result;
//  }

  public static String fizzBuzzRecursion(int number){
    String finalString = "All done!";
  if(number > 0) {
      if (number % 15 == 0) {
        System.out.println("FizzBuzz");
      } else if (number % 5 == 0) {
        System.out.println("Buzz");
      } else if (number % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(number);
      }
      number -= 1;
    return fizzBuzzRecursion(number);
    }
      return finalString;
  }

//

  //    works for positive numbers, breaks for negative numbers:
  public static boolean isPrime(int number) {
    boolean prime = false;
    int divisibleCounter = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        divisibleCounter++;
      }
    }
    if (divisibleCounter <= 2) {
      prime = true;
      return prime;
    } else if (divisibleCounter>2){
      prime = false;
      return prime;
    }
    return prime;
  }

//  No tailing comma:
  public static void getTwentyPrimes(int input){
    int primeCounter = 0;
    int number = 1;
    while (primeCounter < input) {
      if (isPrime(number)) {
        if (primeCounter != input-1) {
          System.out.print(number + ", ");
          primeCounter++;
        } else if (primeCounter == input -1) {
          System.out.print(number);
          primeCounter++;
        }
      }
      number ++;
    }
  }

//  ------------- MORE METHOD PRACTICE / PART DUEX --------------
//Write a method called coinFlip that randomly returns a true or false value.
  public static boolean coinFlip(){
    Random rand = new Random();
    return rand.nextBoolean();
  }

  public static String randomWalk(int number, String result){

    if(number >0){
      Random rand = new Random();
      int print = rand.nextInt(2);
      result += print;
      number--;
      return randomWalk(number, result);
    }
    return result;
  }

//  Write a method named countOnes that takes in a string of ones and zeroes and returns a count of the ones. -- REMEMBER TO HAVE DEFINE NUMBER AS A STRING BECAUSE YOU CAN'T COMPARE A STRING TO AN INT
  public static int countOnes(String result){
    int count = 0;
    String number;
    for(int i= 0; i<= result.length()-1; i++){
      number = result.charAt(i) + "";
      if(number.equals("1")){
        count ++;
      }
    }
    return count;
  }

  public static int countZeros(String result){
    int counter= 0;
    for(int i =0; i <= result.length()-1; i++){
      String number = result.charAt(i) + "";
      if(number.equals("0")){
        counter ++;
      }
    } return counter;
  }

//  public static



}//end of class

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
    System.out.println(isPrime(33));
//    getTwentyPrimes();

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

  public static boolean isPrime(int number) {
    if (number > 0) {
      if (number % 2 == 0 && number !=2) {
        return false;
      } else if ((number % 1 == 0) || (number % number == 0)) {
        return true;
      }
      return false;
    }
    return false;
  }



}//end of class

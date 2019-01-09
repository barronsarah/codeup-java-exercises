import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String[] args){
     Scanner scan = new Scanner(System.in).useDelimiter("\n");

//Loop Basics:
//--------- While and Do While loops----------


//------------- FizzBuzz exercise --------------
        for(int i=1; i<=100; i++){
            if((i%3 == 0) && (i%5 == 0)){
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if(i%5 == 0){
                System.out.println("Buzz");
                continue;
            }
             else {
                System.out.println(i);
            }
        }

//      walkthrough with other fizzbuzz solutions

      //solution 1:
// state, condition, mutation
//      String fizzBuzz = "";
//
//      for(int j = 1; j <= 100; j++) {
//        if(j % 3 == 0) {
//          fizzBuzz += "Fizz";
//        }
//        if(j % 5 == 0) {
//          fizzBuzz += "Buzz";
//        }
//        if(j % 3 != 0 && j % 5 != 0) {
//          fizzBuzz += j;
//        }
//        System.out.println(fizzBuzz);
//        fizzBuzz = "";
//      }
      //alt solution 2:
//      for(int k = 1; k <= 100; k++) {
//        if(k % 3 == 0 && k % 5 == 0) {
//          System.out.println("FizzBuzz");
//        } else if(k % 5 == 0) {
//          System.out.println("Buzz");
//        } else if(k % 3 == 0) {
//          System.out.println("Fizz");
//        } else {
//          System.out.println(k);
//        }
//      }
// ----- End FizzBuzz solutions --------

// ----- Write a solution that prints out number, number-squared and cubed starting at number 1 to number user enters --------

        String userChoice;
        do {
          System.out.println("Enter a number to go up to provide the squares and cubes: ");
          int uNum = scan.nextInt();

          System.out.println("number | squared | cubed");
          System.out.println("------ | ------- | -----");

          for (int i = 1; i <= uNum; i++) {
            System.out.printf("%-8d", i);
            System.out.printf("%-10d", (i * i));
            System.out.println(i * i * i);

            //alt walkthrough version:
//            for(int i = 1; i <= userInt; i++) {
//              System.out.printf("%-6d | %-7d | %-5d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
          }
          System.out.println("Do you want to enter another number?: ");
          userChoice = scan.next();
        } while (userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("y"));

// ----- End number cubed squared solutions ------

// -----write a function that prints out what the grade range is ----
        System.out.println("Where going to let you know what range your grade is.");
        System.out.println("Would you like to continue?: ");
        String response = scan.next();

        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            System.out.println("Enter a grade between 0 and 100: ");
            int grade = scan.nextInt();
            String letterGrade;

            if(grade >= 88){
              letterGrade = "A";
            } else if (grade >= 80){
              letterGrade = "B";
            } else if (grade >= 67) {
              letterGrade = "C";
            } else if (grade >= 60){
              letterGrade = "D";
            } else {
              letterGrade = "F";
            }
            System.out.format("Grade is a %s.", letterGrade);

        } else{
            System.out.println("No problem, we won't ask anymore.");
        }
    }
}

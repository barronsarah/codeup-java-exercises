import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String[] args){
     Scanner scan = new Scanner(System.in).useDelimiter("\n");

//Loop Basics:
//  While and Do While loops


////        FizzBuzz exercise
//        for(int i=1; i<=100; i++){
//            if((i%3 == 0) && (i%5 == 0)){
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if(i%3 == 0){
//                System.out.println("Fizz");
//                continue;
//            }
//            if(i%5 == 0){
//                System.out.println("Buzz");
//                continue;
//            }
//             else {
//                System.out.println(i);
//            }
//        }

      //walkthrough with another fizzbuzz solution:



        System.out.println("Enter a number to go up to: ");
        int uNum = scan.nextInt();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for(int i =1; i <= uNum; i++){
            System.out.printf("%-8d", i);
            System.out.printf("%-10d", (i*i));
            System.out.println(i*i*i);
        }


        System.out.println("Where going to let you know what range your grade is.");
        System.out.println("Would you like to continue?: ");
        String response = scan.next();

        if (response.equalsIgnoreCase("yes || y")) {
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
        } else{
            System.out.println("No problem, we won't ask anymore.");
        }
    }
}

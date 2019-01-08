import java.util.Scanner;

public class ConsoleExercises {
    public static void  main (String[] args){
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int UserNumber;
        UserNumber = scan.nextInt();
        System.out.println("You entered " + UserNumber);

        System.out.println("Enter 3 words separated by a space ");
        String wordOne, wordTwo, wordThree;
        wordOne = scan.next();
        wordTwo = scan.next();
        wordThree = scan.next();
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        System.out.print("Enter a sentence: ");
        String userInput = scan.nextLine();
        System.out.format(userInput);

    }
}

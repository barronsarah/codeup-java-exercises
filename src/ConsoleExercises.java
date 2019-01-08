import java.util.Scanner;

public class ConsoleExercises {
    public static void  main (String[] args){
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

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

    //prompt the user for a sentence and use nextLine to display back to user
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();
        System.out.println(sentence);


        System.out.println("Enter the LENGTH of the codeup classroom (in feet): ");
        Double length = scan.nextDouble();
        System.out.println("Enter the WIDTH of the codeup classroom (in feet): ");
        Double width = scan.nextDouble();
        Double area = length * width;
        Double peremiter = (2*length)+(2*width);
        System.out.format("The area of the classroom is %f, and the peremiter of the class is %f.", area, peremiter);


    }
}

import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String[] args){

        int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j+=2;
        }while(j <= 100);
    }
}

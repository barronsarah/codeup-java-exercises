import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String[] args){

        int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }

//        int j = 100;
//        do {
//            System.out.println(j);
//            j-= 5;
//        }while(j >= -10);
    //same function rewritten as a for loop
        for(int j = 100; j >= -10; j-=5){
            System.out.println(j);
        }


//        long e = 2;
//        do{
//            System.out.println(e);
//            e *= e;
//        }while(e < 1000000);
        //same function rewritten as a for loop
        for(long e =2; e < 1000000; e*=){
            System.out.println(e);
        }
    }
}

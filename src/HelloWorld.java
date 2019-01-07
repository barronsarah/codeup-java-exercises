public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello,");
        System.out.println(" World!");

        int myFavoriteNumber = 22;
        System.out.println(myFavoriteNumber);

        String myString = "Clever Girl";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        byte ohYeah = 127;
        ohYeah++;
        System.out.println(ohYeah);
    }
}

import java.util.Random;

public class ServerNameGenerator {
  public static void main(String[] args) {

 String[] nouns = {"screen", "mouse", "bike", "otter", "shoe", "charger", "VHS", "mug", "chips", "wipe"};
 String[] adjectives = {"cheerful", "lazy", "overzealous", "green", "cold", "tired", "soft", "tasty", "rough", "fuzzy"};

    System.out.println(elementInArray(adjectives) + "-" + elementInArray(nouns));


  } // end of MAIN

  public static String elementInArray(String[] array){
    Random rand = new Random();
    int n = (int) (Math.random() * array.length);
    return array[n];
  }

} // end of CLASS

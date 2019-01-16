package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
  public static void main(String[] args) {


    Input input = new Input();

    int userResponse = input.getInt("What would you like to do?\n" +
            "\n" +
            "0 - exit\n" +
            "1 - view all movies\n" +
            "2 - view movies in the animated category\n" +
            "3 - view movies in the drama category\n" +
            "4 - view movies in the horror category\n" +
            "5 - view movies in the scifi category\n" +
            "\n" +
            "Enter your choice: ");

    //refactored to assign function call a variable
//    int userResponse = input.getInt();

    if(userResponse == 1){
      System.out.println(Arrays.toString(MoviesArray.findAll()));
    } else if(userResponse ==2){
      getCategory("animated");
    } else if(userResponse ==3){
      getCategory("drama");
    } else if(userResponse ==4){
      getCategory("horror");
    } else if(userResponse ==5){
      getCategory("scifi");
    } else {
      System.exit(0);
    }

    boolean userContinue = input.yesNo("Do you want to view another category? Yes/No");



  }// end of MAIN


  public static void getCategory(String category){
    for(Movie movie: MoviesArray.findAll()){
      if(movie.getCategory().equals(category)){
        System.out.println(movie.getName());
      }
    }
  }

} // end of CLASS

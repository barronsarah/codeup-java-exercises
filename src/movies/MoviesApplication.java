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
            "6 - view movies in the musicals category\n" +
            "9 - enter a new movie\n"+
            "\n" +
            "Enter your choice: ");

    getMovie(userResponse);

  }// end of MAIN


  public static void getMovie(int userResponse) {
    Input input = new Input();

    if (userResponse == 1) {
      System.out.println("Here are all the movies:");
      getAllMovies(1);
    } else if (userResponse == 2) {
      System.out.println("Here are all the Animated movies:");
      getCategory("animated");
    } else if (userResponse == 3) {
      System.out.println("Here are all the movies under Drama:");
      getCategory("drama");
    } else if (userResponse == 4) {
      System.out.println("Here are all the movies under Horror: ");
      getCategory("horror");
    } else if (userResponse == 5) {
      System.out.println("Here are all the movies under Sci-Fi:");
      getCategory("scifi");
    } else if(userResponse == 6) {
      System.out.println("Here are all the movies under Musicals:");
      getCategory("musical");
    } else if (userResponse ==9) {
    String movieName =input.getString("Enter the name of the movie");
    String movieCategory = input.getString("Enter the category of the movie");

    Movie userMovie = new Movie(movieName, movieCategory);
      addMovie(MoviesArray.findAll(), userMovie);


    }
    else {
      System.exit(0);
    }
    getMovie(input.getInt("What would you like to do?\n" +
            "\n" +
            "0 - exit\n" +
            "1 - view all movies\n" +
            "2 - view movies in the animated category\n" +
            "3 - view movies in the drama category\n" +
            "4 - view movies in the horror category\n" +
            "5 - view movies in the scifi category\n" +
            "6 - view movies in the musicals category\n" +
            "9 - enter a new movie\n"+
            "\n" +
            "Enter your choice: "));
  }


  public static void getCategory(String category) {
    for (Movie movie : MoviesArray.findAll()) {
      if (movie.getCategory().equals(category)) {
        System.out.println(movie.getName());
      }
    }
  }

  public static void getAllMovies(int userResponse) {
    if (userResponse == 1) {
      for (Movie movie : MoviesArray.findAll()) {
        System.out.printf("%s - %s %n", movie.getName(), movie.getCategory());
      }
    }
  }

  public static Movie[] addMovie(Movie[] MoviesArray, Movie userMovie){
    int numberOfMovies= MoviesArray.length +1;
    Movie[] newListMovies = Arrays.copyOf(MoviesArray, numberOfMovies);
    newListMovies[newListMovies.length -1] = userMovie;

    for(Movie ind: newListMovies){
      System.out.println(ind.getName());
    }
    return newListMovies;
  }





} // end of CLASS

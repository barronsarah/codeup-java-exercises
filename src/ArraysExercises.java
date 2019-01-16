
import java.util.Arrays;

public class ArraysExercises {

  public static Person[] addPerson(Person[] people, Person person){
    int numberOfPeople= people.length +1;
    Person[] allPeople = Arrays.copyOf(people, numberOfPeople);
    allPeople[allPeople.length -1] = person;

    for(Person ind: allPeople){
      System.out.println(ind.getName());
    }
    return allPeople;
  }

// ---------------START OF MAIN-------------
  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(numbers));

    Person[] people = new Person[3];
    people[0] = new Person("Sarah");
    people[1] = new Person("Lori");
    people[2] = new Person("Nicole");

//    for(Person person: people){
//      System.out.println(person.getName());
//    }

    Person anotherPerson = new Person("Gustavo");
    addPerson(people, anotherPerson);


  } // end of MAIN
} // end of CLASS

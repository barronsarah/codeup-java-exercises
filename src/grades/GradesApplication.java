package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GradesApplication {
  public static void main(String[] args) {

    HashMap<String, Student> students = new HashMap<>();

    Student mikey = new Student("Mikey");
    mikey.addGrade(55);
    mikey.addGrade(67);
    mikey.addGrade(68);
    Student debra = new Student("Debra");
    debra.addGrade(90);
    debra.addGrade(74);
    debra.addGrade(92);
    Student nicole = new Student("Nicole");
    nicole.addGrade(85);
    nicole.addGrade(84);
    nicole.addGrade(87);
    Student josh = new Student("Josh");
    josh.addGrade(85);
    josh.addGrade(84);
    josh.addGrade(87);

    students.put("doomsdayTats", mikey);
    students.put("abracaDebra", debra);
    students.put("rollyNicoley", nicole);
    students.put("oshBJosh", josh);


    System.out.println("Welcome!\n Here are the github usernames of our students: ");

  Input input;

do {
  input = new Input();
  String userInput = input.getString(students.keySet()+ "\n\nWhat student would you like to see more information on?\n");

  if (students.containsKey(userInput)) {
    String personName = students.get(userInput).getName();
    ArrayList personGrades = students.get(userInput).getGrades();
    Double personAvg = students.get(userInput).getGradeAverage();
    System.out.printf("Name: %s - Github Username: %s %n Here are their grades: %s %n Current Average: %.2f %n", personName, userInput, personGrades, personAvg);
  } else {
    System.out.println("There was no student found with that github username\"" + userInput + "\".");
  }
} while(input.yesNo("\nWould you like to see another student?"));

    boolean userResponse = input.yesNo("Do you want to view all the grades of all the students?");
    if(userResponse) {
      for(String key: students.keySet()){
        System.out.println(students.get(key).getName() + ": "+ students.get(key).getGrades());
      }
    } else {
      System.out.println("Goodbye, and have a wonderful day!");
    }

  } // end of MAIN
} // end of CLASS

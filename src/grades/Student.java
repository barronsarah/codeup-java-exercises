package grades;

import java.util.ArrayList;

public class Student {
  public static void main(String[] args) {

  Student anna = new Student("anna");
  Student jon = new Student("jon");
    System.out.println(anna.getName());
  anna.addGrade(80);
  anna.addGrade(65);
  anna.addGrade(72);
  jon.addGrade(55);
  jon.addGrade(64);
    System.out.println(anna.grades);
    System.out.println(jon.grades);
    System.out.println(anna.getGradeAverage());
    System.out.println(jon.getGradeAverage());


  } // end of MAIN

 // ---------- start of Methods ------------

  private String name;
  private ArrayList<Integer> grades = new ArrayList<>();

  public Student(String name) {
    this.name = name;
    this.grades = new ArrayList<>();
  }


  public String getName() {
    return name;
  }

  public ArrayList<Integer> getGrades() {
    return grades;
  }

  public void addGrade(int grade){
    grades.add(grade);
  }

  public double getGradeAverage(){
    if(grades.size() ==0) return 0; //<-- this is here to ensure you don't get a
    double sum = 0;
    for(Integer grade: grades){
      sum += grade;
    }
    return sum/grades.size();
  }

}// end of CLASS

import com.sun.corba.se.impl.orb.PropertyOnlyDataCollector;

public class Person {
  public static void main(String[] args) {
//    Person person1 = new Person("Andrea");
//    System.out.println(person1.getName());
//    person1.setName("Sarah");
//    System.out.println(person1.getName());
//    person1.sayHello();

    //this shows how you can have more than one person with the same name; HOWEVER! they are NOT the same person (object)
//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
//    System.out.println(person1.getName().equals(person2.getName()));
//    System.out.println(person1 == person2);

    // this shows how you can reassign a person because the Person object is not private
//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1 == person2);

    //this is another example of how setting the setName method REASSIGNS the name due to the set name not being private (meaning you can change it)
    Person person1 = new Person("John");
    Person person2 = person1;
    System.out.println(person1.getName());
    System.out.println(person2.getName());
    person2.setName("Jane");
    System.out.println(person1.getName());
    System.out.println(person2.getName());

  } //end of MAIN

  //METHODS CREATED FOR THE PERSON CLASS
  private String name;

// This is a constructor object that creates an object
  //the TYPE of object that it returns is a PERSON type (creates a Person Object);
  public Person(String name){
    this.name = name;
  }

  // GETTER (gets a value) => allows the user to only SEE the object (private) properties
  // returns the person's name
  public String getName(){
    return this.name;
  }

  // changes the name property to the passed value
  public void setName(String name){
    this.name = name;
  }
  // prints a message to the console using the person's name
  public void sayHello(){
    System.out.println("Hello from " + name);
  }


}

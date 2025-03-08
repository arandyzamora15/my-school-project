// Java program to demonstrate the concept of classes and objects

public class School {
  public static void main(String[] args) {
    // create a student object
    Student s = new Student("John", "Doe");

    // print the name and age of the student
    System.out.println("Name: " + s.getName());
    System.out.println("Age: " + s.getAge());
  }
}

class Student {
  private String name;
  private int age;

  // constructor to initialize name and age
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // getter methods for name and age
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

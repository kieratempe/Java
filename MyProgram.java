// Define a simple class named "Person"
class Person {
    String name;
    int age;
}

public class MyProgram {
    public static void main(String[] args) {
        // Create an instance (object) of the "Person" class
        Person person = new Person();

        // Set values for the instance variables
        person.name = "Kiera";
        person.age = 100;

        // Print out the person's information
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}


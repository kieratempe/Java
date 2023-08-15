// Parent Class
class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("Animal speaks");
    }
}

// Child class (subclass) inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("Dog barks");
    }
}

// Child class (subclass) inheriting from Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("Cat meows");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Robbie");
        Cat cat = new Cat("Emon");

        System.out.println("Dog's name: " + dog.name);
        dog.speak();

        System.out.println("Cat's name: " + cat.name);
        cat.speak();
    }
}


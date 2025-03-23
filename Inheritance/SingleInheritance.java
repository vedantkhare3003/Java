// Parent Class
class Animal {
    void eat(){
        System.out.println("This animal eats food.");
    }
}

// Child Class
class Dog extends Animal{
    void bark() {
        System.out.println("Dog barks.");
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat(); // Inherited method from Animal
        d.bark(); // Dog's own method
    }
}

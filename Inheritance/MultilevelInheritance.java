class Animal1{
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog1 extends Animal1{
    void bark(){
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy weeps.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();  // Inherited from Animal
        p.bark(); // Inherited from Dog
        p.weep(); // Puppy’s own method
    }
}
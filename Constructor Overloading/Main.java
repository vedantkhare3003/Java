class ConstructorOverloading {
    int num;
    String text;

    // Default Constructor
    ConstructorOverloading() {
        num = 0;
        text = "Default";
    }

    // Parameterized Constructor
    ConstructorOverloading(int n, String t) {
        num = n;
        text = t;
    }

    void display() {
        System.out.println("Number: " + num + ", Text: " + text);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(100, "Hello");

        obj1.display();
        obj2.display();
    }
}

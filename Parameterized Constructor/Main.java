class ParameterizedConstructor {
    int age;
    String name;

    // Parameterized Constructor
    ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("ABC", 25);
        obj.display();
    }
}

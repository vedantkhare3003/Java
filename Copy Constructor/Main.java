class CopyConstructor {
    int num;

    // Parameterized Constructor
    CopyConstructor(int n) {
        num = n;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor obj) {
        num = obj.num;
    }

    void display() {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(50);
        CopyConstructor obj2 = new CopyConstructor(obj1);  // Copy constructor

        obj1.display();
        obj2.display();
    }
}

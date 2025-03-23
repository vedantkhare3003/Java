class MathUtils{
    //Static method to calculate the square of a number
    static int square(int num){
        return num * num;
    }
}
public class Main {
    public static void main(String[] args){
        // Calling the static method without creating an object
        int result = MathUtils.square(5);
        System.out.println("Square of 5: " + result);
    }
}

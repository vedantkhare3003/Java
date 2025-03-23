public class Wrapper {
    public static void main(String[] args){
        // Converting primitive types into objects (Boxing)
        Integer intObj = Integer.valueOf(10);
        Double doubleObj = Double.valueOf(5.5);
        Character charObj = Character.valueOf('A');

        // Converting objects to primitive types (Unboxing)
        int intValue = intObj.intValue();
        double doubleValue = doubleObj.doubleValue();
        char charValue = charObj.charValue();

        // Displaying values
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Unboxed Integer: " + intValue);
        System.out.println("Unboxed Double: " + doubleValue);
        System.out.println("Unboxed Character: " + charValue);
    }
}

public class IntegerTypeConversion {
    public static void main(String[] args) {
        int integerValue = 97;

        byte byteValue = (byte) integerValue;
        char charValue = (char) integerValue;
        float floatValue = (float) integerValue;

        System.out.println("Byte value: " + byteValue);
        System.out.println("Character value: " + charValue);
        System.out.println("Float value: " + floatValue);
    }
}

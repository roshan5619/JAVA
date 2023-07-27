public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 12;

        String binary = convertDecimalToBinary(decimal);
        System.out.println("Binary representation: " + binary);
    }

    public static String convertDecimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }
}

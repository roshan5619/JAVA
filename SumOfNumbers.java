public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            int number = i;
            if (number > 0) {
                sum += number;
            }
        }

        System.out.println("The sum of the positive numbers is: " + sum);
    }
}

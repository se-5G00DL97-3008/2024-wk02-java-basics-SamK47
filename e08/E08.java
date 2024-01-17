import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 2) {
            System.out.println("Enter a number (0 to quit): ");
            int number = scanner.nextInt();
            if (number == 0) {
                i = 3;
            } else if (number % 2 != 0) {
                System.out.println("Odd number");
            } else if (number % 2 == 0) {
                System.out.println("Even number");
            }
        }
    }
}

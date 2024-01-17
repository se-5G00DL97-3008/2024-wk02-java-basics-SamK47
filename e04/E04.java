import java.util.Scanner;

class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day:");
        int number = scanner.nextInt();
        System.out.println("Enter a month:");
        int number2 = scanner.nextInt();
        if (number == 24 & number2 == 12) {
            System.out.println("Merry Christmas");
        }

    }
}
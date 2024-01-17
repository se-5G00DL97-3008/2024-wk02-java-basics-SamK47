import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int number = scanner.nextInt();
        System.out.println("Until which multiplier should the table show?");
        int number2 = scanner.nextInt();
        for (int i = 0; i <= number2; i++) {
            System.out.println(i + " x " + number + " = " + (number * i));

        }
    }
}

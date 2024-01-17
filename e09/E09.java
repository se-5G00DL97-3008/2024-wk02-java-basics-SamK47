import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a test score (-1 to quit): ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            total++;
            sum += number;
            double average = (sum / total);
            System.out.println("Average: "+average);
        }
    }
}

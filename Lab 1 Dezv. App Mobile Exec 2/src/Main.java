import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti marimea la Array");
        int size = scanner.nextInt();

        double[] numere = new double[size];

        System.out.print("Introduceti elementele din array.");
        for (int i = 0; i < size; i++) {
            System.out.print("Element" + (i + 1) + ": " );
            numere[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double numar : numere) {
            sum += numar;
        }
        double average = sum/size;

        System.out.print("Average-ul este: " +average);

        scanner.close();
    }
}
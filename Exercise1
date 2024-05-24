import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (a):");
        int a = scanner.nextInt();

        System.out.println("Введите второе число (b):");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;
        double division = 0;
        if (b!=0){
            division = (double) a / b;
        }

        System.out.println("Сложение: " + a + " + " + b + " = " + sum);
        System.out.println("Вычитание: " + a + " - " + b + " = " + difference);
        System.out.println("Умножение: " + a + " * " + b + " = " + multiplication);
        if (b != 0) {
            System.out.println("Деление: " + a + " / " + b + " = " + division);
        } else {
            System.out.println("Деление: невозможно делить на ноль");
        }

        scanner.close();
    }
}

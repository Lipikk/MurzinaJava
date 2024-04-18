import java.util.Scanner;
public class Numbers {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        System.out.println("Введите число b: ");

        int result = a * b;
        System.out.println("Результат умножения: " + result);

        int result1 = a + b;
        System.out.println("Результат сложения: "+ result1);

        int result2 = a - b;
        System.out.println("Результат вычитания: " + result2);

        int result3 = a / b;
        System.out.println("Результат деления: " + result3);

        if (a < b) {
            System.out.println("Результат сравнения: " + "a < b");
        } else if (a > b) {
            System.out.println("Результат сравнения: " + "a > b");
        } else {
            System.out.println("Результат сравнения: " + "a == b");
        }
    }
}
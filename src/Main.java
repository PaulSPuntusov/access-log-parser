import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        double quotient = (double)firstNumber/secondNumber;
        System.out.println("Сумма этих двух чисел равна "+(firstNumber+secondNumber));
        System.out.println("Разность этих двух чисел равна "+(firstNumber-secondNumber));
        System.out.println("Произведение этих двух чисел равно "+(firstNumber*secondNumber));
        System.out.println("Частное этих двух чисел равно "+quotient);
    }
}

package homework8;

import java.util.Scanner;

/*
Task 1 (Использовать оператор switch)

Программа просит пользователя ввести число от 1 до 7 Если число равно 1,
выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
 */
public class HomeWork8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfWeek;
        System.out.println("Введите номер дня недели");
        dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Вы ввели неверное число!");
        }
    }
}

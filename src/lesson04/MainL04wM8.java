package lesson04;


import java.util.Scanner;

public class MainL04wM8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальную остановку");
        String start = scanner.nextLine();
        System.out.println("Введите конечную остановку");
        String finish = scanner.nextLine();

        System.out.println("Введите затраченное время:");
        int minutes = scanner.nextInt();

        System.out.println("Укажите расстояние в метрах:");
        double distance = scanner.nextDouble();

        String message = "Вам нужно от " + start + " до " + finish + " проехать " + distance + " метров за " + minutes + " минут ";

        System.out.println(message);
     }
}

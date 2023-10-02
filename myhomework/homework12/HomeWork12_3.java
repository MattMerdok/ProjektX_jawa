package homework12;

public class HomeWork12_3 {
    /*
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
1
12
123
1234
12345
123456
 */
    public static void main(String[] args) {
        int number = 6;

        for (int i = 1; i <= number; i++) { // перебирает числа от 1 до 6
            for (int j = 1; j <= i ; j++) { // перебирает числа от 1 до i (до счетчика внешнего числа)
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

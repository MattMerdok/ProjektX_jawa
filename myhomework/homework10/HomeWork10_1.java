package homework10;

public class HomeWork10_1 {
    /*
Task 1 Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
Используем цикл do-while
 */
    public static void main(String[] args) {
        int i = 1;

        do {
//            System.out.print(i + "; ");

        if (i % 5 == 0) {
              System.out.println(i);
        i = i + 5;
        } else {
        i++;
        }

        } while (i <= 100);
              System.out.println();
        }
    }


package homework10;

import java.util.Scanner;
public class HomeWork10_3 {
/*
Task 3 Программа просит пользователя слово "hello"
Если пользователь вводит правильное слово -
программа распечатывает на экран благодарность и завершает работу

Если вводится не верное слово - программа просит ввести слово снова.
До тех пор, пока не будет введено запрашиваемое слово

*опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова

По окончанию - вывести число попыток на экран
 */

  public static void main(String[] args) {

   Scanner scanner =new Scanner(System.in);

   int counter = 0;
    String answer;

      do {
       System.out.println("Введите hello");
       answer = scanner.nextLine().trim();
       counter++;
      } while (!answer.equalsIgnoreCase("hello"));

        System.out.println("Hello! Вы использовали " + counter + " попыток");
   }
}

package homework11;

public class HomeWork11_2 {
    /*
Task 2 Дан массив строк.
Вывести на экран все символы из самой длинной строки массива
{ “One”, “Two”, “Twenty” } -->
 */
    public static void main(String[] args) {

        String[] strings = {"string", "hello", "Monday 13th", "first", "second"};

        String langestString = strings[0];

        int i = 0;
        while (i < strings.length) {
            if (strings[i].length() > langestString.length()) {
                langestString = strings[i];
            }
            i++;
        }

        System.out.println("Самая длинная строка в массиве: " + langestString);

        int k = 0;
        while (k < langestString.length()) {
            System.out.print(langestString.charAt(k++) + " ");
        }
    }
}

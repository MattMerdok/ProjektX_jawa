package lesson06;

public class HW_05_Task_01 {

    public static void main(String[] args) {
        String name = "Sergey";

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите свое имя");
//        name = scanner.nextLine();


        System.out.println("В имени " + name.length() + " символов");
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() -1);
        System.out.println("Первый символ: " + firstChar);
        System.out.println("Последний символ: " + lastChar);

        int indexFirst = firstChar; // используем переменную типа int для представления типа char в числе
        int indexLast = lastChar;

        System.out.println("Код первого символа: " + indexFirst);
        System.out.println("Код последнего символа: " + indexLast);

        // второй способ преобразовать char в число
        System.out.println("Код первого символа: " + (int)firstChar);
        System.out.println("Код последнего символа: " + (int)lastChar);

    }
}

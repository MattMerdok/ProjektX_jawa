package lesson05;

/*
Задача 5(*). int x = 3
Чему будет равно значение х после выполнения операции x += x++ ?
Проверьте свое предположение на практике.
 */

public class TypeCateExample {

    public static void main(String[] args) {
        char a = 'A'; // Переменная будет хранить букву A латинского алфавита
        char b = 65; // Переменная будет хранить букву A латинского алфавита, соответсвующую кодy 65 в десятичной системе
        char c = 0x41; // Переменная будет хранить букву A латинского алфавита, соответсвующую коду 41 в шестнадцатеричной системе
        c = 0x0041;
        char d = '\u0041';
        char x = '\u1547';



        System.out.println("a: " + a + "; b: " + b) ;
        System.out.println("c: " + c + "; d: " + d) ;
        System.out.println(x);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);
        digit0++;
        digit0 += 4;
        System.out.println("digit0: " + digit0);

        char symbolZ = 90;
        System.out.println(--symbolZ);

        char smallA = 97;
        System.out.println(smallA);
        smallA += 10;
        System.out.println(smallA);

        char x1 = 12853;
        System.out.println(x1);


    }
}



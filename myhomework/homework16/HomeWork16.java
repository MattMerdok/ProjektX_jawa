package homework16;

public class HomeWork16 {
    /*
Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
toUpperCase() использовать нельзя.
 */
    public static void main(String[] args) {

        String stringTest = "aAb780-_bRfsw";
        System.out.println(toUpperCase(stringTest));

    }

    public static String toUpperCase(String string) {
        char[] chars = string.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            // Option1
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] -32);
            }

            // Option2
            char currentChar = string.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                result += String.valueOf((char) (currentChar -32));
            } else {
                result += String.valueOf(currentChar);
            }
        }
        // return result;
        return String.valueOf(chars);
    }
}

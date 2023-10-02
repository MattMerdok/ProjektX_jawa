package lessons17;

public class lessons17 {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.sayMeow(); // Вызываем метод sayMeow у обьекта
        cat.run();
        cat.sleep();

        // При создании обьекта класса все его поля
        // инициализируются значениями по умолчанию

        String catName = cat.name;
        System.out.println("Имя" + catName);

        System.out.println("Возраст" + cat.age);

        System.out.println("Цвет: " + cat.color);
        System.out.println("===================");

        // Был создан новый объект класса
        // Имя (строка) которая была передана в конструктор
        // Было присвоено полю name

        Cat cat1 = new Cat("Max");
        System.out.println("Имя cat1 " + cat1.name);
        System.out.println("Возраст" + cat1.age);
        System.out.println("Цвет" + cat1.color);
        cat1.sayMeow();
        cat1.sleep();
        System.out.println("==========");

        Cat cat2 = new Cat( "Boris",  "red");
        System.out.println("Имя cat2 " + cat2.name);
        System.out.println("Возраст " + cat2.age);
        System.out.println("Цвет " + cat2.color);
        cat2.sayMeow();
        cat2.run();
        System.out.println("=============");

        Cat cat4 = new Cat("Valera", "Gray", 5);

        Cat cat3 = new Cat( "Barsik",  "white");
        System.out.println("Имя cat2 " + cat3.name);
        System.out.println("Возраст " + cat3.age);
        System.out.println("Цвет " + cat3.color);
        cat3. sayMeow();
        cat3. whoAmI();
    }
}

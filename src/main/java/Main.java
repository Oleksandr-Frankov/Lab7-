import lab6.*;

public class Main {

    public static void main(String[] args) {

        InterfaceList<Coffee> list = new List();

        //створюємо екземпляри класу Coffee
        Coffee beansCoffee = new BeansCoffee("BeansCoffee", 100, 10,7);
        Coffee groundCoffee = new GroundCoffee("GroundCoffee", 10, 130,6);
        Coffee instantCoffeeInJar = new InstantCoffeeInJar("InstantCoffeeInJar", 10, 100,3);
        Coffee instantCoffeeInPackaging = new InstantCoffeeInPackaging("InstantCoffeeInPackaging", 10, 100,10);


        //додаємо їх у наш ліст
        list.add(beansCoffee);
        list.add(groundCoffee);
        list.add(instantCoffeeInJar);
        list.add(instantCoffeeInPackaging);

        //виводимо дані з ліста
        System.out.println("Всі обєкти ліста :");
        System.out.println(list);



        //получаємо перший обєкт з ліста
        System.out.println("Перший обєкт ліста :");
        System.out.println(list.get(0));

        //видаляємо обєкт з ліста
        System.out.println("Видаляємо обєкт з ліста ");

        list.remove(beansCoffee);
        //виводимо дані з ліста
        System.out.println("Всі обєкти ліста після видалення :");
        System.out.println(list);




    }
}

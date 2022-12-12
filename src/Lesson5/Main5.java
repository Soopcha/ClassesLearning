package Lesson5;

public class Main5 {
    public static void main(String[] args) {
        User user1 = new User(30,"Alex", "pass");
        user1.setName("Dimka");
        System.out.println(user1.getName());    // с помощью геттера выводим имя, которое в самом классе приватное

        User user2 = new User(30,"Alex");
        System.out.println(user2.getName());

        User user3 = new User();
        System.out.println(user3.getName()); //null - могут принимать только ссылочные типы
        // не ссылочные - принимают 0 по умолчанию


    }
}

package javaComputer;

/*
Класс - шаблон, формочка для выпечки печенья
Экземпляр класса(объект класса) - печенье
 */

public class Start {
    public static void main(String[] args) {
        Computer apple = new Computer(); // создали экземпляр класса
        /* класс Computer - теперь используем как тип данных
           apple - название для переменной, в которой лежит ссылка
           new - выделяем память под новый пк
           Computer - говорим, что хотим создать собственно сам пк
         */

        apple.cpu = 2500;
        apple.memory = 1000;
        apple.name="MacBook10";

        System.out.println(apple.cpu);

        apple.isCpu();
        System.out.println();

        Computer deal = new Computer(); // создали новый пк
        deal.cpu=4300;
        deal.isCpu();                   // всё работает)

        Computer laptop = apple; // присвоили ссылку
        // те теперь переменная laptop и apple имеют один и тот же пк
        // и параметры можно менять и через laptop и через apple
        apple.memory = 1500;
        apple.isMemory();
        laptop.isMemory();

        // но вообще так делать нельзя
        // плохой тон - присваивать поля класса прям в основной проге в main методе
        // прям практически на прямую обращаемся и присваиваем значение

    }
}

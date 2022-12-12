package Lesson5;

public class User {
    private int age;
    private String name;
    private String passportDate;

    public User() {
    };  //неинициализированный юзер

    /*  public User(int a, String n, String p){
          age = a;
          name = n;
          passportDate = p;
      } */
    // ЛИБО
    public User(int age, String name, String passportDate) {
        this.age = age;   //this - ссылка на объект, которыйобратился к данному методу (в нашем случае конструктору)
        this.name = name;
        this.passportDate = passportDate;
    }

    public User(int a, String n) {  //недоинициализированная сущность, те не все поля инициализированны
        age = a;   // тут типо тоже автоматически this имеется ввиду
        name = n;
    }

    // Геттер - метод, для того, чтобы дать переменным доступ на вывод
    public int getAge() {  // выводим возраст
        return age;
    }

    public String getName() { // выводим имя
        return name;
    }
    //Сеттер -позволяют установить какие-то значения у переменных
    public void setName (String name){   //те теперь мы можем изминять имя юзера динамически
        this.name=name;
    }
}

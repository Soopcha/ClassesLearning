package javaComputer;


public class Computer { // public- означает, что видно во всей проге
    // параметры, которыми обладает пк:
    int memory;       // ЭТИ ПЕРЕМЕННЫЕ - ПОЛЯ КЛАССА
    int cpu; // мощность процессора
    String name;

    void isCpu(){              //метод ИМЕННО ЭТОГО экземпляра
        System.out.println(cpu);
    }

    void isMemory(){
        System.out.println(memory);
    }
}

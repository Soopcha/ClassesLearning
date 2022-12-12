package packageWithConstructor3;
// C КОНСТРУКТОРОМ класса - базовым методом, который будет сразу выполняться при создании экземпляра (new)
// Конструктор - метод класса, который отвечает за инициализацию (создание, активация, подготовка к работе,
// определение параметров) обьекта
// (экземпляра пк)

public class ProgramComputer {
    private int memory;
    private int cpu;
    private String name;

    ProgramComputer(int defMemory, int defCpu,String defName){   // это наш КОНСТРУКТОР класса
        // оператор new будет вызывать данный метод и выполнять то, что в нём написано
        memory = defMemory;
        cpu = defCpu;
        name = defName;

    }

    void isCpu(){
        System.out.println(cpu);
    }

    void isMemory(){
        System.out.println(memory);
    }


    void setMemory(int m) {
        memory = m;
    }
}

package theRightPackage;

public class RightComputer {
    // наш КЛАСС состоит из ПОЛЕЙ и МЕТОДОВ

        private int memory;  // теперь они внутри чисто класса этого
        private int cpu;
        private String name;

        void isCpu(){              //метод ИМЕННО ЭТОГО экземпляра
            System.out.println(cpu);
        }

        void isMemory(){
            System.out.println(memory);
        }

        //создаём новый метод класса, что бы можно было присваивать значения одному из наших полей
    void setMemory(int m) {
        // правило - когда мы хотим присвоить значение одному из наших полей
        // то метод должен начинаться с set
        memory = m;
    }
}

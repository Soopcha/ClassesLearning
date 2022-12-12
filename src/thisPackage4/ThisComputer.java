package thisPackage4;
// улучшим наш Computer, добавив this

public class ThisComputer {

        private int memory;
        private int cpu;
        private String name;

        ThisComputer(){}; // ещё один конструктор для того, чтобы не возникал если мы не хотим задавать всякие параметры
    // ещё можно было бы public прописать
    // Вообще если бы вообще не было НИКАКИХ конструкторов,то он бы создался автоматически

        ThisComputer(int memory, int cpu,String name){
            this.memory = memory; // когда создаём новый пк, значение memory затрагиваем через this
            // memory ИМЕННО этого компьютера, который мы создаём в конкретных условиях
            // а memory без this - будет браться из параметров, которые мы передаём при создании
            this.cpu = cpu;
            this.name = name;

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

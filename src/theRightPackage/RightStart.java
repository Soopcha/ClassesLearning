package theRightPackage;

import javaComputer.Computer;

public class RightStart {
    public static void main(String[] args) {
        RightComputer apple = new RightComputer(); // создали экземпляр класса

        apple.setMemory(100); // вызвали метод класса RightComputer а тот присвоил полям класса значения
        apple.isMemory();     // выведи это присвоенное крутое значение
    }
}

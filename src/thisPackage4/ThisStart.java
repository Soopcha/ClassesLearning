package thisPackage4;
// 4 прога ради ключевого слова this

public class ThisStart {
    public static void main(String[] args) {
        ThisComputer apple = new ThisComputer();
        // в зависимости хотим мы передавать значения или нет буде использоваться один или другой конструктор

        ThisComputer apple2 = new ThisComputer(450,456,"Прикольчик");

        apple.isCpu();
        apple2.isCpu();
    }
}

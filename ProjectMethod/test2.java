class Calc {
    public int run(int a, int b) {
        return a + b;
    }
}
class MyCalc extends Calc {
    public int run(int a, int b) {
        return a - b;
    }
}

public class test2
{
    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
        System.out.println(myCalc.run(100, 10));
    }
}
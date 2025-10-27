public class MethodDiffinitionTest {

    public static void main(String[] args) {
        //エントリーポイント
        System.out.println("mainメソッド開始");
        add();
        add2();
        System.out.println("mainメソッド終了");
    }

    public static void add() {
        System.out.println("addメソッド開始");
        int number1 = 5;
        int number2 = 10;
        int sum = 0;
        sum = number1 + number2;
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        System.out.println("sum:" + sum);
        System.out.println("addメソッド終了"); //呼び出し元に戻る
    }

    public static void add2() {
        System.out.println("add2メソッド開始");
        int number1 = 30;
        int number2 = 70;
        int sum = 0;
        sum = number1 + number2;
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        System.out.println("sum:" + sum);
        System.out.println("addメソッド終了"); //呼び出し元に戻る
    }
}

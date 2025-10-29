public class MethodDiffinitionTest {

    public static void main(String[] args) {
        //エントリーポイント
        System.out.println("mainメソッド開始");
        int intSum = 0;
        double doubleSum = 0;
        int number1 = Integer.parseInt(args[0]); //Sting→intへ変換
        int number2 = Integer.parseInt(args[1]); //Sting→intへ変換
        int number3 = Integer.parseInt(args[2]); //Sting→intへ変換

        //足し算する処理→結果の戻り値をsumに代入
        intSum = add(number1, number2, number3); //int
        //足し算した結果を画面に表示する処理
        printSum(intSum);

        //足し算する処理→結果の戻り値をsumに代入
        doubleSum = add(30.4, 70.5); //int
        //足し算した結果を画面に表示する処理
        printSum(doubleSum);
        System.out.println("mainメソッド終了");
    }

    public static int add(int number1, int number2, int number3) {
        System.out.println("int型addメソッド開始");
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        System.out.println("number3:" + number3);
        int sum = 0;
        sum = number1 + number2 + number3;
        System.out.println("addメソッド終了"); //呼び出し元に戻る
        return sum;
    }

    public static double add(double number1, double number2) {
        System.out.println("double型addメソッド開始");
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        double sum = 0;
        sum = number1 + number2;
        System.out.println("addメソッド終了"); //呼び出し元に戻る
        return sum;
    }

    public static void printSum(int intSum) {
        System.out.println("printSumメソッド開始");
        System.out.println("sum:" + intSum);
        System.out.println("printSumメソッド終了"); //呼び出し元に戻る
    }

    public static void printSum(double doubleSum) {
        System.out.println("printSumメソッド開始");
        System.out.println("sum:" + doubleSum);
        System.out.println("printSumメソッド終了"); //呼び出し元に戻る
    }
}

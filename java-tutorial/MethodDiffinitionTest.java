public class MethodDiffinitionTest {

    public static void main(String[] args) {
        //エントリーポイント
        System.out.println("mainメソッド開始");
        int sum = 0;

        //足し算する処理→結果の戻り値をsumに代入
        sum = add(5, 10); //int
        //足し算した結果を画面に表示する処理
        printSum(sum);

        //足し算する処理→結果の戻り値をsumに代入
        sum = add(30, 70); //int
        //足し算した結果を画面に表示する処理
        printSum(sum);
        System.out.println("mainメソッド終了");
    }

    public static int add(int number1, int number2) {
        System.out.println("addメソッド開始");
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        int sum = 0;
        sum = number1 + number2;
        System.out.println("addメソッド終了"); //呼び出し元に戻る
        return sum;
    }

    public static void printSum(int sum) {
        System.out.println("printSumメソッド開始");
        System.out.println("sum:" + sum);
        System.out.println("printSumメソッド終了"); //呼び出し元に戻る
    }
}

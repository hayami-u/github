public class RefVariableTest {

    public static void main(String[] args) {
        //基本データ型変数の宣言と初期化
        int num1 = 1;
        int num2 = num1;
        num2 += 1;
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        //参照型変数の宣言と初期化
        //アドレスで参照している
        int[] numArray1 = { 1, 2 };
        int[] numArray2 = numArray1;
        numArray2[1] += 1;
        for (int i = 0; i < numArray2.length; i++) {
            System.out.println("numArray1[" + i + "]:" + numArray1[i]);
            System.out.println("numArray2[" + i + "]:" + numArray2[i]);
        }
    }
}

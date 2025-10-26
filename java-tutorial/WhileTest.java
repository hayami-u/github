public class WhileTest {

    public static void main(String[] args) {
        System.out.println("番号！");
        int number = 1; //番号（1から始まる）
        while (number <= 10) {
            //()の中の条件がtrue→ブロック実行
            //()の中の条件がfalse→ブロックをスキップ
            System.out.println(number + "!");
            number++; //numberに１加算する
        }
    }
}

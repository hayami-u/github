public class ForTest {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            //int n = i + 1;
            //System.out.println("繰り返し：" + n + "周目");

            if (i == 5) {
                //break; //ループ中断
                System.out.println("次のループに進む");
                continue; //次のループに進む
            }
            System.out.println("繰り返し：" + i + "周目");
        }
    }
}

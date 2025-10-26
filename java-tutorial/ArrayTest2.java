public class ArrayTest2 {

    public static void main(String[] args) {
        String[] customer; //String型の配列を宣言
        customer = new String[3];
        customer[0] = "鈴木太郎"; //[0]:添字・index 値の箱:要素
        customer[1] = "suzuki_taro@xxxx.com";
        customer[2] = "090-0000-9999";
        //通常のforループ
        for (int i = 0; i < 3; i++) {
            System.out.println(customer[i]);
        }
        //定数を使わずに変数化
        for (int i = 0; i < customer.length; i++) {
            System.out.println(customer[i]);
        }

        String[] customer2; //String型の配列を宣言
        customer2 = new String[3];
        customer2[0] = "田中太郎"; //[0]:添字・index 値の箱:要素
        customer2[1] = "tanaka_taro@xxxx.com";
        customer2[2] = "080-0000-8888";
        //拡張for文
        // ※途中開始、特定ループに処理を加えることはできない。
        for (String customer2Value : customer2) {
            System.out.println(customer2Value);
        }
    }
}

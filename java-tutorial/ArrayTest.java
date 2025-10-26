public class ArrayTest {

    public static void main(String[] args) {
        String name = "鈴木太郎";
        String email = "suzuki_taro@xxxx.com";
        String phone = "090-0000-9999";
        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);

        System.out.println(); //空行

        String[] customer; //String型の配列を宣言
        //customer = "鈴木太郎"; //String[]とStringは=ではない！
        //customer[0] = "鈴木太郎"; //配列を宣言した後、配列の初期化をしていない！
        customer = new String[3];
        customer[0] = "鈴木太郎"; //[0]:添字・index 値の箱:要素
        customer[1] = "suzuki_taro@xxxx.com";
        customer[2] = "090-0000-9999";
        System.out.println(customer[0]);
        System.out.println(customer[1]);
        System.out.println(customer[2]);

        System.out.println(); //空行

        //{}で初期化する場合、宣言と初期化を分けられない！
        //String[] customer2;
        //customer2 = {"鈴木太郎", "suzuki_taro@xxxx.com", "090-0000-9999"};
        // new 型名[]{}で初期化する場合、宣言と初期化を同時に行う
        String[] customer2 = {
            "鈴木太郎",
            "suzuki_taro@xxxx.com",
            "090-0000-9999",
        };
        System.out.println(customer2[0]);
        System.out.println(customer2[1]);
        System.out.println(customer2[2]);
    }
}

public class ArrayTest3 {

    public static void main(String[] args) {
        int a = 3;
        String[] customer; //String型の配列を宣言
        customer = new String[3];
        switch (a) {
            case 1:
                customer[0] = "鈴木太郎";
                customer[1] = "suzuki_taro@xxxx.com";
                customer[2] = "090-0000-9999";
                break;
            case 2:
                customer[0] = "鈴木太郎";
                customer[1] = "suzuki_taro@xxxx.com";
                break;
            case 3:
                customer[0] = "鈴木太郎";
                break;
        }

        for (int i = 0; i < customer.length; i++) {
            if (customer[i] != null) {
                System.out.println(customer[i]);
            }
        }

        System.out.println(); //空行

        String[] customer2 = {
            "田中太郎",
            "tanaka_taro@xxxx.com",
            "080-0000-8888",
        };
        //拡張for文
        // ※途中開始、特定ループに処理を加えることはできない。
        for (String customer2Value : customer2) {
            System.out.println(customer2Value);
        }
    }
}

public class IfTest7 {

    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        //実際にコーディングするときは条件式内に++,--はできるだけ使用せず外部で使用する
        if (a++ == 6 && --b == 10) {
            //前置と後置で結果が変わる→短略評価は？
            // ||左が成立しすると右は無視
            // &&左が不成立だと右は無視
            System.out.println("条件成立！");
            System.out.println("a:" + a);
            System.out.println("b:" + b);
        } else {
            System.out.println("条件不成立！");
            System.out.println("a:" + a);
            System.out.println("b:" + b);
        }
    }
}

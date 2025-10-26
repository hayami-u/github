public class VariableTest {

    public static void main(String[] args) {
        int myAge; //変数宣言：情報が入る箱の形を決めて、コンピュータに伝える
        myAge = 29; //初期化cd
        System.out.println(myAge);

        //配列の各要素は初期化しなくてもい
        int[] ourAge = new int[5];
        System.out.println(ourAge[1] + 5);

        boolean[] isChild = new boolean[5];
        System.out.println(isChild[1]);

        char[] letter = new char[5];
        System.out.println(letter[1]);

        String[] text = new String[5];
        System.out.println(text[1]);
    }
}

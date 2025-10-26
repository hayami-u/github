public class EscapeTest {

    public static void main(String[] args) {
        System.out.println("Hello!!");
        System.out.println("Double quote(\") is diplayed."); //escape \
        char c = '\''; //escape \
        System.out.println(c);
        System.out.println("\\ is displayed.");
        System.out.println("Hello\nWorld!!"); //改行の制御文字\n
        System.out.println("Hello\tWorld!!"); //TABの制御文字\t
        String str = null;
        boolean test = true;
        if (test == true) {
            str = "Hello\nWorld!!";
        } else {
            str = "Hello World!!";
        }
        System.out.println(str);
    }
}

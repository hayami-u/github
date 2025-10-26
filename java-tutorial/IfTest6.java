public class IfTest6 {

    public static void main(String[] args) {
        int myAge = 50; //年齢
        String myBloodType = "AB"; //血液型
        if (myAge == 29 || myBloodType.equals("B")) {
            //年齢と血液型の片方の条件が一致する場合
            System.out.println("私の年齢は29歳または血液型はB型です！");
        } else if (myAge == 29 || myBloodType.equals("A")) {
            System.out.println("私の年齢は29歳または血液型はA型です！");
        } else if (myAge == 40 || myBloodType.equals("O")) {
            System.out.println("私の年齢は40歳または血液型はO型です！");
        } else if (myAge == 40 || myBloodType.equals("AB")) {
            System.out.println("私の年齢は40歳または血液型はAB型です！");
        } else {
            System.out.println("私の年齢と血液型は不詳です！");
        }
        System.out.println("私の出身は神奈川です。");
    }
}

package 第３章_条件分岐と繰り返し;

public class Main {
    public static void main(String[] args){
        boolean tenki = true;
        if (tenki == true){
            System.out.println("洗濯をします");
        } else {
            System.out.println("DVDを見ます");
        }

        boolean doorClose = true;
        while (doorClose == true) {
            System.out.println("ノックする");
            System.out.println("1分待つ");
        }
    }
}

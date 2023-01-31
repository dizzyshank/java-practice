package 第５章_メソッド;

public class Practice2 {
    public static void main(String[] args) {
       email("abc@gmail.com","お久しぶりです。", "覚えていますか。");
    }
    public static void email(String address, String title, String text) { //staticの後に型を指定するのは戻り値を必要とする時
        System.out.println(address + "に以下のメールを送信しました。");
        System.out.println("件名:" + title);
        System.out.println("本文：" + text);
    }
}

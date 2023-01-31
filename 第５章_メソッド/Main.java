package 第５章_メソッド;

public class Main {
   public static void main(String argas[]) {
    System.out.println("メソッドを呼び出します");
    hello("ほんま");
    hello("reo");
    System.out.println("メソッドの呼び出しが終わりました");
   }
   public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
   }
}

package 第５章_メソッド;

public class Main {
   public static void main(String argas[]) {
    System.out.println("メソッドを呼び出します");
    hello("ほんま");
    hello("reo");
    System.out.println("メソッドの呼び出しが終わりました");

    add(100, 20);
    add(200, 50);
   }
   public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
   }

   //複数の値を受け取れるメソッド
   public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
   }
}

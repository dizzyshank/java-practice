package 第５章_メソッド;

public class Main {
   public static void main(String argas[]) {
    System.out.println("メソッドを呼び出します");
    hello("ほんま");
    hello("reo");
    System.out.println("メソッドの呼び出しが終わりました");

    int ans = add(100,10); //戻り値を受け取る。
    System.out.println("100 + 10 = " + ans);
   }


   public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
   }

   //複数の値を受け取れるメソッド,さらに戻り値を指定
   public static int add(int x, int y) {
    int ans = x + y;
    return ans;
   }
}

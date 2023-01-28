package 第二章_式と演算子;

//コード2-1 変数宣言の文と計算の文
public class Calculation {
    public static void main(String[] args) {
        int a;
        int b;
        a = 20;
        b = a + 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println("私の好きな記号は二重引用符(\")です"); //エスケープシーケンスについて
        System.out.println("¥1200");
        int c;
        c = 100;
        c++;
        System.out.println(c); //インクリメント演算子について
    }
}

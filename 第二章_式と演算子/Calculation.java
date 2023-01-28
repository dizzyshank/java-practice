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
        float f = 3;
        double d = f;
        System.out.println(f); //float型の変数にint型を代入
        System.out.println(d); //double型の変数にfloat型を代入
        int age = (int)3.2; //強制的に型変換 キャスト演算子
        System.out.println(age);
        double d2 = 8.5 / 2; //2(int型)を2.0(double型)に変換
        long l = 5 + 2L; //5(int型)を5L(long型)に変換
        System.out.println(d2);
        System.out.println(l);
    }
}

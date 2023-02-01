package 第２章_式と演算子;

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
        String msg = "私の年齢は" + 23; //23(int型)が"23"(String型)に変換されて連結される
        System.out.println(msg);
        String name = "ほんま";
        System.out.print("私の名前は");
        System.out.print(name);
        System.out.print("です。");
        int m = Math.max(a, b);
        System.out.println("比較実験:" + a + "と" + b + "とで大きい方は、、" + m);
        String age2 = "27";
        int n = Integer.parseInt(age2); //String型をint型に変換
        System.out.println("来年" + (n+1) + "歳になる。");
        int r = new java.util.Random().nextInt(60); //乱数を発生させる命令
        System.out.println("あなたは" + r + "歳");
        System.out.println("あなたの名前を入力してください");
        String name1 = new java.util.Scanner(System.in).nextLine(); //キーボードから１行の文字列の入力を受け付ける
        System.out.println("あなたの年齢を入力してください");
        int age3 = new java.util.Scanner(System.in).nextInt(); //キーボードから１つの整数の入力を受け付ける
        System.out.println("ようこそ、" + age3 + "歳の" + name1 + "さん");
    }
}

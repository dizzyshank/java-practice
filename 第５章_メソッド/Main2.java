package 第５章_メソッド;

public class Main2 {
    //一つ目のaddメソッド
    public static int add(int x, int y) {
        return x + y;
    }

    //追記
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    //二つ目のaddメソッド
    public static double add(double x, double y) {
        return x + y;
    }

    //三つ目のaddメソッド
    public static String add(String x, String y) {
        return x + y;
    }
    public static void main(String args[]) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20,30));
        System.out.println(add(3.5,2.7));
        System.out.println(add("hello","world"));
    }
}

package 第４章_配列;

public class Practice {
    public static void main(String[] args) {
        //int[] points; points = new int[4];
        //double[] weights; weights = new double[5];
        //boolean[] answers; answers = new boolean[3];
        //String names; names = new String[3];

        int[] moneyList = {121902, 8302, 55100};
        for (int i = 0; i <moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }

        for(int value : moneyList) {
            System.out.println(value);
        }

        int[] numbers = {3, 4, 9};
        System.out.println("１桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int num : numbers) {
            if (num == input) {
                System.out.println("アタリ!");
            }
        }
    }
}

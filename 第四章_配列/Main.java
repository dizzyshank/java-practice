package 第四章_配列;

public class Main {
    public static void main(String[] args){
       int[] scores = {20, 30, 40, 50, 80};
       int sum = 0; //集計結果を入れるための変数を初期化して準備
       for (int i = 0; i < scores.length; i++) {
        sum += scores[i]; //一科目ずつ変数sumに合算する
       }
       int avg = sum / scores.length;
       System.out.println("合計点：" + sum);
       System.out.println("平均点：" + avg);

        //DNAの記号をランダムに表示する
        int[] seq = new int[10];

        for (int i = 0; i < seq.length; i++) {
            seq[i] = new java.util.Random().nextInt(4);
        }

        for (int i = 0; i < seq.length; i++) {
            char[] base = {'A', 'G', 'C', 'T'};
            System.out.print(base[seq[i]] + " ");
        }

        /*従来のfor文による記述
         * pulic class Main {
         *  public static void main(String[] args) {
         *      int[] scores = {20, 30, 40, 50, 80};
         *      for (int i = 0; i < scores.lingth; i++) {
         *          System.out.println(scores[i]);
         *      }
         * }
         */

         //拡張for文
         int[] scores2 = {20, 30, 40, 50, 80};
         for (int value : scores2) {
            System.out.println(value);
         }

    }
}

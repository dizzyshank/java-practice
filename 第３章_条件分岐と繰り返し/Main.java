package 第３章_条件分岐と繰り返し;

public class Main {
    public static void main(String[] args){
        boolean tenki = true;
        if (tenki == true){
            System.out.println("洗濯をします");
        } else {
            System.out.println("DVDを見ます");
        }

       for (int i = 0; i < 10; i++){
        System.out.println("こんにちは");
       }

       //for文のループを二重にして九九の表を出力する。
       for (int i = 1; i < 10; i++){
        for (int j = 1; j < 10; j++){
            System.out.print(i*j);
            System.out.print(" ");
        }
        System.out.println("");
       }
    }
}

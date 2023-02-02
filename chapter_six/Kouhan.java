package chapter_six;

public class Kouhan {
    public static void callDeae() {
        System.out.println("ええい、こしゃくな。曲者だ。であえい！");
    }   
    public static void showMondokoro() throws Exception {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        Thread.sleep(3000);
        System.out.println("この門どころが目に入らぬか");
        Zenhan.doTogame();
    }
}

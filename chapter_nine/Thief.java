package chapter_nine;

public class Thief {
    String name;
    int hp;
    int mp;
    public Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = 40;
        this.mp = 5;
    }
    public Thief(String name, int hp) {
        this(name, hp , 5)
    }
    public Thief(String name) {
        this(name, 40, 5);
    }
}

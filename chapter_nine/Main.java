package chapter_nine;

public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        h.sword = s;
        Wizard w = new Wizard();
        w.name = "菅原";
        w.hp = 50;
        w.heal(h);
        System.out.println("現在の武器は" + h.sword.name);
    }
}

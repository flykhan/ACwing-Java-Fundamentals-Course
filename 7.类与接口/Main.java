import point.ColorPoint;
import point.Point;
import role.Hero;
import role.impl.Athena;
import role.impl.Zeus;

public class Main {
    public static void main(String[] args) {
        // Point 相关类演示
        Point point = new Point(3, 4);
        // 类的多态演示
        Point colorPoint = new ColorPoint(3, 4, "red");
        System.out.println(point.toString());
        System.out.println(colorPoint.toString());

        // Hero 接口多态的演示
        Hero[] heros = {
                new Zeus(), new Athena(),
        };
        for (Hero hero : heros) {
            hero.great();
            hero.attack();
            hero.move();
            System.out.println(hero.getSpeed());
        }
    }
}

import src.Hero;

public class App {
    public static void main(String[] args) {
        Hero thor = new Hero("Thor", 200);
        Hero thanos = new Hero("Thanos", 250);

        System.out.println(thor.showInfo());
        System.out.println(thanos.showInfo());
        System.out.println("START!!!");

        Hero.battle(thor, thanos);
    }
}

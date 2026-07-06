import src.Hero;

public class App {
    public static void main(String[] args) {
        Hero thor = new Hero("Thor", 200);
        Hero thanos = new Hero("Thanos", 150);

        System.out.println(thor.showInfo());
        System.out.println(thanos.showInfo());
        System.out.println("START!!!");

        System.out.println("============================================");
        int count = 1;
        while (thor.hp > 0 && thanos.hp > 0) {

            System.out.println("Hiep dau: " + count);
            count++;

            thor.attack(thanos);
            System.out.println(thanos.getName() + thanos.getHp());

            thanos.attack(thor);
            System.out.println(thor.getName() + thor.getHp() + "\n--------------------------------------------");
        }
        if (thanos.hp > 0) {
            System.out.println(thanos.getName() + " WIN");
        } else {
            System.out.println(thor.getName() + " WIN");
        }
    }
}

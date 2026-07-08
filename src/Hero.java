package src;

public class Hero {
    public String name;
    public int hp;
    public int damage;

    public Hero() {
    }

    public Hero(String name, int damage) {
        this.hp = 1000;
        this.name = name;
        this.damage = damage;
    }

    public String showInfo() {
        return "Name: " + this.name + ", HP: " + this.hp + ", Damage: " + this.damage;
    }

    public String getHp() {
        return " con lai: " + this.hp + "HP";
    }

    public String getName() {
        return this.name;
    }

    public void attack(Hero hero) {
        hero.hp -= this.damage;
        System.out.println(this.name + " tan cong " + hero.name + " voi sat thuong: " + this.damage);
    }

    public static void battle(Hero h1, Hero h2) {
        System.out.println("=========================================");

        int count = 1;
        while (h1.hp > 0 && h2.hp > 0) {
            System.out.println("Hiep dau: " + count + "\n-----" + h1.getName() + ": " + h1.hp + "HP" + " VS "
                    + h2.getName() + ": " + h2.hp + "HP" + "-----");
            count++;

            h1.attack(h2);
            System.out.println(h2.getName() + h2.getHp());
            if (h2.hp <= 0)
                break;

            h2.attack(h1);
            System.out.println(h1.getName() + h1.getHp());
            if (h1.hp <= 0)
                break;
            System.out.println("\n-----------------------------------------");
        }

        if (h1.hp <= 0) {
            System.out.println(h1.name + " da chet");
            System.out.println(h2.getName() + " WIN");
        } else if (h2.hp <= 0) {
            System.out.println(h2.name + " da chet");
            System.out.println(h1.getName() + " WIN");
        }
    }
}

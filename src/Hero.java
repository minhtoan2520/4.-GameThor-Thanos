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
        if (hero.hp <= 0) {
            System.out.println(hero.name + " da chet");
        } else {
            hero.hp -= this.damage;
            System.out.println(this.name + " tan cong " + hero.name + " voi sat thuong: " + this.damage);
        }
    }

    // public void attack() {
    // System.out.println("Không có nhân vật để tấn công");
    // }

    public static void battle(Hero h1, Hero h2) {
        System.out.println("============================================");
        int count = 1;
        while (h1.hp > 0 && h2.hp > 0) {

            System.out.println("Hiep dau: " + count);
            count++;

            h1.attack(h2);
            System.out.println(h2.getName() + h2.getHp());

            h2.attack(h1);
            System.out.println(h1.getName() + h1.getHp() + "\n--------------------------------------------");
        }
        if (h1.hp <= 0) {
            System.out.println(h1.getName() + " da chet");
            System.out.println(h2.getName() + " WIN");
        } else if (h2.hp <= 0) {
            System.out.println(h2.getName() + " da chet");
            System.out.println(h1.getName() + " WIN");
        }
    }
}

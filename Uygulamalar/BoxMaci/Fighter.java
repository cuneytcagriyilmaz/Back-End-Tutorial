package Uygulamalar.BoxMaci;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    double isfirst;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.isfirst = isfirst;


        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    //foe = rakip
    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isdodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı");
            System.out.println("-----------");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isdodge() {
        double randomNumber = Math.random() * 100;
        //üretilen rasgele sayı dodge'dakinden küçükse saldırıyı bloklayabilir.
        return randomNumber <= this.dodge;
    }
    boolean isFirst() {
        double randonNumber = Math.random() * 100;
        if (randonNumber >= 50) {
            System.out.println("Ilk Hamleyi Yapacak Kisi: " + this.name);
            return true;
        } else {
            System.out.println("Ilk Hamleyi Yapacak Kisi: " + this.name);
            return false;
        }
    }


}

package Uygulamalar.BoxMaci;

public class Match {
    //iki tane boksör yapıyoruz ve min-max kilolar alınır.

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;


    }

    //Müsabakaya başla (run)

    public void run() {
        //dövüşçü aralıkları uygun mu
        if (isCheck()) {

            // birinin canı 0 a bitmediği sürece birbirlerinbe vurabilecek
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=======YENİ ROUND======");


                this.f2.health = this.f1.hit(this.f2);
                //System.out.println(this.f2.health);
                if (isWin()) {
                    break;
                }

                // f2 f1'e vuruyor
                this.f1.health = this.f2.hit(this.f1);
                //System.out.println(this.f1.health);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
            }

        } else {
            System.out.println("Sporcuların Sikletleri Uygun Değil.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");

            return true;

        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");

            return true;

        }
        // iki koşul sağlanmadıysa false döner
        return false;

    }
}

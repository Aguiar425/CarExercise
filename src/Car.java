import java.sql.Array;
import java.util.Arrays;

public class Car {

    private static Tire [] tires = new Tire[4];
    private Radio radio;

    public static Boolean tireExplosion;

    public Car() {
        tires[0] = new Tire ("Michelin1", 1000, 50);
        tires[1] = new Tire ("Michelin2", 1000, 100);
        tires[2] = new Tire ("Michelin3", 1000, 20);
        tires[3] = new Tire ("Michelin4", 1000, 500);
        radio = new Radio(false);
    }

    public static void main(String[] args) {

        Car bmw = new Car();

        bmw.tireExplosion = false;

        while (bmw.tireExplosion == false) {
            for (int i = 0; i < tires.length; i++) {
                if (bmw.tires[i].getIntegrity() < 1) {
                    tireExplosion = true;
                    System.out.println(("Tire " + bmw.tires[i].getBrand() + " just Exploded!"));
                    System.out.println(bmw.tireBurst());
                    bmw.replaceTire(i);
                    break;

                } else {
                    bmw.drive(i);
                    System.out.println(("Driving, tire " + bmw.tires[i].getBrand() + ": " + bmw.tires[i].getIntegrity() + " integrity."));

                }
            }
            System.out.println("-".repeat(20));
        }


        /*  for ( int i = 0; i< tires.length; i++){


            if(bmw.tires[i].getIntegrity() > 0) {
                bmw.drive(i);
                System.out.println(("Driving, tire " + bmw.tires[i].getBrand() + ": " + bmw.tires[i].getIntegrity() + " integrity."));
                continue;
            }


            if (bmw.tires[i].getIntegrity() == 0) {
                bmw.tireBurst();
                System.out.println("tire " + tires[i].getBrand() + " exploded");
                break;
            }
        }

            /*if (bmw.tires[i].getIntegrity() <= 0){
                System.out.println(bmw.tireBurst());
            }
         */

    }

    public void drive(int teste) {
        //for ( int wheelCounter =0; wheelCounter< tires.length; wheelCounter++) {
        int currentIntegrity = (tires[teste].getIntegrity() - tires[teste].getTearRate());
        tires[teste].setIntegrity(currentIntegrity);

    }

    public String tireBurst(){
        radio.setEstaLigado(true);
        return radio.playMusic();
    }

    public void replaceTire(int toReplace){
        tires[toReplace].setIntegrity(1000);
        System.out.println("tire replaced");
    }
}


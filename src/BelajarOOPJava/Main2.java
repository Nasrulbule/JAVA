package BelajarOOPJava;

public class Main2 extends kendaraan{

    public static void main(String[] args) {

        kendaraan motor = new kendaraan();

        motor.setAtribut("Honda","Beat");

        System.out.println(" Merek Motor : " + motor.getMerek());
        System.out.println(" Jenis Motor : " + motor.getJenis());

        motor.Melaju(230);

        System.out.println("================================================================");


        kendaraan mobil = new kendaraan();

        mobil.setAtribut("Avanza","Matic");

        System.out.println(" Merek Mobil : " + mobil.getJenis());
        System.out.println(" Jenis Mobil : " + mobil.getMerek());
    }
}

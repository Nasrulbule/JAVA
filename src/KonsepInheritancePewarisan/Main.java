package KonsepInheritancePewarisan;

public class Main extends kendaraan {

    public static void main(String[] args) {

        motor d1 = new motor();

        d1.setAtribut(" Honda", " Beat");

        System.out.println(" Jenis Kendaraan : " + d1.getJenis());
        System.out.println(" Merek Kendaraan : " + d1.getMerek());
    }
}

package BelajarFungsimethodjava;

public class FungsiStatic {

    static void makan(String makanan){

        System.out.println(" Saya Sedang Makan " + makanan);
    }

    static void minum(String minuman){
        System.out.println(" Saya Sedang Minum " + minuman);
    }

    public static void main(String[] args) {

        FungsiStatic saya = new FungsiStatic();

        saya.makan("Nasi Goreng ");
        minum("Susu");
    }
}

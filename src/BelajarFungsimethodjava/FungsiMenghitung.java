package BelajarFungsimethodjava;

public class FungsiMenghitung {

    static int LuasPersegiPanjang(int sisi){

        int luas = sisi * sisi;

        return luas;
    }

    public static void main(String[] args) {

        System.out.println(" Luas Persegi Panjang sisi 5 adalah " + LuasPersegiPanjang(5));
    }
}

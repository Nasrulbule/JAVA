package ArrayJava;

import java.util.HashMap;

public class belajarhashmap {

    public static void main(String[] args) {

        HashMap<Integer, String> days = new HashMap<Integer, String>();

        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");




        System.out.println(" Hari Kelima adalah " + days.get(5));

        days.replace(1, "Ahad");
        System.out.println(" Hari Ke Satu Menjadi " + days.replace(1, "Ahad"));

        System.out.println(" Days : " + days);


    }
}

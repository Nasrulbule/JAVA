package Looping;

import java.util.Scanner;

public class LatihanLooping {

    public static void main(String[] args) {

        int nilaiAwal, nilaiAkhir, total;

    Scanner InputUser = new Scanner(System.in);

    System.out.print("Masukkan Nilai Awal : ");
    nilaiAwal = InputUser.nextInt();
    System.out.print("Masukkan Nilai Akhir : ");
    nilaiAkhir = InputUser.nextInt();

    total = 0;

    while(nilaiAwal <= nilaiAkhir){
        total = total + nilaiAwal;
        System.out.println(" Total ke " + nilaiAwal + " Menjadi " + total);
        nilaiAwal++;
    }


    }
}

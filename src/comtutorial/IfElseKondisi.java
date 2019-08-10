package comtutorial;

import java.util.Scanner;

public class IfElseKondisi {

    public static void main(String[] args) {

        String nama;

        int nilai;

  Scanner scan = new Scanner(System.in);

  System.out.print(" Nama Siswa : ");
  nama = scan.nextLine();
  System.out.print(" Nilai Siswa : ");
  nilai = scan.nextInt();

  if(nilai > 90 ){
      System.out.println(" Selamat, " + nama + " Anda Lulus ");

  }else{
      System.out.println(" Maaf, " + nama + " Anda Gagal ");
  }

    }
}

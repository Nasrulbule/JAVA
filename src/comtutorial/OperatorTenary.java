package comtutorial;

import java.util.Scanner;

public class OperatorTenary {

    public static void main(String[] args){

        int nilai = 0;

   Scanner InputUser = new Scanner(System.in);

   System.out.print(" Masukkan nilai angka : ");
   nilai = InputUser.nextInt();

        String output = (nilai >= 75 )?"selamat, Anda Lulus":"maaf, anda belum lulus";

        System.out.println(output);
    }
}

package Looping;

import java.util.Scanner;

public class PerulanganLatihanWhileloop {

    public static void main(String[] args) {

        boolean running = true;

        int counter = 0;

        String jawab;

  Scanner scan = new Scanner(System.in);

  while(running){

      System.out.print(" Apakah Anda Ingin Keluar ? ");
      System.out.print(" Jawab [ya/tidak] > ");
      jawab = scan.nextLine();

      if(jawab.equalsIgnoreCase("ya")){
          running = false;
      }

      counter++;
  }

    System.out.println(" Anda Telah Melakukan Perulangan Sebanyak " + counter + " Kali ");


    }
}

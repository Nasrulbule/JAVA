package comtutorial;
import java.util.Scanner;

public class Kasir {

    public static void main(String[] args){

        int belanja, bayar, diskon;
        String kartu;

  Scanner scan = new Scanner(System.in);

  System.out.print(" Apakah Anda Punya Kartu Member ? ");
  kartu = scan.nextLine();
  System.out.print(" Total belanja : Rp ");
  belanja = scan.nextInt();

  if(kartu.equalsIgnoreCase("ya")){
      if(belanja > 500000 ){
          diskon = 50000;

      }else if( belanja > 100000 ){
          diskon = 15000;

      }else{
          diskon = 0;

      }
  }else{
      if(belanja > 100000 ){
          diskon = 15000;

      }else {
          diskon = 0;

      }
  }

  bayar = belanja - diskon;

  System.out.println(" Total Bayar : Rp " + bayar);
    }
}

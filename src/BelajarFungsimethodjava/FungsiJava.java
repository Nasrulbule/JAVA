package BelajarFungsimethodjava;

public class FungsiJava {

    public static void main(String[] args){
       int hasil = 10;

     hitung(hasil);
        System.out.println(hasil);

    simpel("Abah");
    simpel("Emak");
    simpel("kaka");
    }


  static int hitung(int input){

        int hasil = 8 *input * input;

        return hasil;
  }

  static void simpel(String ucapan){

      System.out.println(" Selamat Pagi " + ucapan);

  }
}

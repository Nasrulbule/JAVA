package comtutorial;

import java.util.Scanner;

public class LatihanKalkulatorSederhana {

    public static void main(String[] args){

        float a, b, hasil;

        char Operator;

  Scanner InputUser = new Scanner(System.in);

  System.out.print(" a = ");
  a = InputUser.nextFloat();
  System.out.print(" Operator = ");
  Operator = InputUser.next().charAt(0);
  System.out.print(" b = ");
  b = InputUser.nextFloat();

  if(Operator == '+'){
      hasil = a + b;
      System.out.println(" Hasil : " + hasil);

  }else if(Operator == '-'){
      hasil = a - b;
      System.out.println(" Hasil : " + hasil);

  }else if(Operator == '*'){
      hasil = a * b;
      System.out.println(" Hasil : " + hasil);

  }else if(Operator == '/'){
      hasil = a / b;
      System.out.println(" Hasil : " + hasil);

  }else{
      System.out.println(" Operator : " + Operator + " Ini Tidak ditemukan ");
  }
    }
}

package comtutorial;

import java.util.Scanner;

public class LatihanKalkulatorSwitch {

    public static void main(String[] args) {

        float a, b, hasil;
        String Operator;

   Scanner InputUser = new Scanner(System.in);

   System.out.print(" a = ");
   a = InputUser.nextFloat();
   System.out.print(" Operator = ");
   Operator = InputUser.next();
   System.out.print(" b = ");
   b = InputUser.nextFloat();

   switch (Operator){
       case "+":
           hasil = a + b;
           System.out.println("Hasil : " + hasil);
           break;
       case "-":
           hasil = a - b;
           System.out.println(" Hasil : " + hasil);
           break;
       case "*" :
           hasil = a * b;
           System.out.println(" Hasil : " + hasil);
           break;
       case "/":
           hasil = a / b;
           System.out.println(" Hasil : " + hasil);
           break;
       default:
           System.out.println(" Operator " + Operator + " Ini Tidak di temukan ");
   }
    }
}

package comtutorial;

public class OperatorBitwise {

    public static void main(String[] args) {

        int a = 40;
        int b = 20;
        int c = 0;

     c = a & b;
     System.out.println(" a & b = " + c);

     c = a | b;
     System.out.println(" a | b = " +c);

     c = a ^ b;
     System.out.println(" a ^ b = " +c);

     c = ~a;
     System.out.println(" ~a = " +c);

     c = a >> 2;
     System.out.println(" a >> 2 = " +c);

     c = a << 2;
     System.out.println(" a << 2 = " +c);

     c = a >>> 2;
     System.out.println(" a >>> 2 = " +c);

    }
}

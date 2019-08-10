package Looping;

public class WhileLoop {

    public static void main(String[] args) {

        int i = 0;
        boolean kondisi = true;

        while (kondisi) {
            i++;
            System.out.println(" Perulangan ke- " + i);


            if (i == 10) {
                kondisi = false;

            }
        }
    }
}


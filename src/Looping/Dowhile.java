package Looping;

public class Dowhile {

    public static void main(String[] args) {

        int i = 0;
        boolean kondisi = true;

    do{
        i++;
        System.out.println(" Perulangan Ke- " + i);
        if(i == 10){
            kondisi = false;
        }

    }while (kondisi);


    }
}

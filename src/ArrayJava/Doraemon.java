package ArrayJava;

import java.util.ArrayList;

public class Doraemon {

    public static void main(String[] args){

        ArrayList kantongAjaib = new ArrayList();

        kantongAjaib.add("Senter Ajaib");
        kantongAjaib.add(211);
        kantongAjaib.add("Tikus");
        kantongAjaib.add(true);
        kantongAjaib.add(331.121);

        kantongAjaib.remove(true);

        System.out.println(kantongAjaib);

        System.out.println(" kantongAjaib Berisi : " + kantongAjaib.size() + " Item ");
    }
}

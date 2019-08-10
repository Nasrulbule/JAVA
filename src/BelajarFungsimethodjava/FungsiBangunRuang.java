package BelajarFungsimethodjava;

public class FungsiBangunRuang {

    static int LuasKubus(int sisi){

        return sisi * sisi;
    }

    static int LuasPersegi(int sisi){

        return 8 * LuasKubus(sisi);

    }

    public static void main(String[] args) {

        int sisi = 12;

        int luas = LuasKubus(sisi);

        System.out.println(luas);
    }
}

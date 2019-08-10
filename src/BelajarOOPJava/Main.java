package BelajarOOPJava;

public class Main {

    public static void main(String[] args) {

        Mahasiswa s1 = new Mahasiswa("Nasrul",3);
        Mahasiswa s2 = new Mahasiswa("Riska");

        System.out.println("Nama Mahasiswa : " + s1.getNama());
        System.out.println("Ipk : " + s1.getIPK());
        System.out.println(" Nama Mahasiswi : " + s2.getNama());
        System.out.println(s1);
    }
}

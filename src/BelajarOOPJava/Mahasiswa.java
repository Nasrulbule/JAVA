package BelajarOOPJava;

public class Mahasiswa {

    String nama;
    int IPK;

 Mahasiswa(String nama, int IPK){

     this.nama = nama;
     this.IPK = IPK;
 }

 Mahasiswa(String nama){

     this.nama = nama;
 }
public String getNama(){

     return this.nama;
}

public int getIPK(){

     return this.IPK;
}

public String toString(){

     return "Nama Mahasiswa : " + this.nama + " IPK : " + this.IPK;
}
}

package BelajarOOPJava;

public class kendaraan {

    String merek;
    String jenis;
    int kecepatan;


void Melaju(int kecepatan){

    this.kecepatan = kecepatan;

    System.out.println(" Kecepatan : " + kecepatan + " Km/Jam");
}

void setAtribut(String merek, String jenis){

    this.merek = merek;
    this.jenis = jenis;
}

String getMerek(){

    return this.merek;
}

String getJenis(){

    return this.jenis;
}
}

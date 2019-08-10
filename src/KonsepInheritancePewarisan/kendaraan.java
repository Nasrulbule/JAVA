package KonsepInheritancePewarisan;

public class kendaraan {

    String Merek;
    String Jenis;
    int Kecepatan;


public void Melaju(int kecepatan){
       this.Kecepatan = kecepatan;
       System.out.println(" ======== MELAJU ======== ");
       System.out.println(" Kecepatan : " + kecepatan + " Km/Jam");
   }

   public void setAtribut(String merek, String jenis){
       this.Merek = Merek;
       this.Jenis = Jenis;

   }

   public String getMerek(){
       return Merek;
   }

   public String getJenis(){
       return Jenis;
   }

   static class motor extends kendaraan{
       String Merek;
       String Jenis;
       int Kecepatan;
   }
}

package KonsepPolimorfisme;

public class Main {

    public static void main(String[] args){

        Hewan d1 = new Hewan();

        d1.setNama();
        d1.setSuara();
        d1.setBerat();

     System.out.println(" ============ Hewan Kucing ========= ");

       Hewan k = new Hewan.kucing();

        k.setNama();
        k.setSuara();
        k.setBerat();


      System.out.println(" ============ Hewan Singa =========== ");

      Hewan s = new Hewan.kucing.singa();

      s.setNama();
      s.setSuara();
      s.setBerat();






    }
}

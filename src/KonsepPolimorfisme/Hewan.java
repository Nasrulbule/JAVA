package KonsepPolimorfisme;

public class Hewan {

    void setNama(){

        String Hewan = "Tidak Bernama";

        System.out.println(" Nama Hewan : " + Hewan);
    }

    void setSuara(){

        String suara = "Tidak Bersuara";
        System.out.println(" Suara Hewan : " + suara);
    }

    void setBerat(){
        double berat = 4.0;
        System.out.println(" Berat Hewan : " + berat);
    }

    static class kucing extends Hewan{

        @Override

        void setNama(){
            String kucing = "keerus";
            System.out.println(" Nama Kucing : " + kucing);
        }

        @Override

        void setSuara(){
            String suara = "Meeooww";
            System.out.println(" Suara Kucing : " + suara);

        }

        @Override

        void setBerat(){
            double berat = 6.0;
            System.out.println(" Berat Kucing : " + berat);
        }

        static class singa extends Hewan{

            @Override

         void setNama(){
                String singa = "Zynga";
                System.out.println(" Nama Singa : " + singa);
            }
            @Override

         void setSuara(){
                String suara = "Rooooaaarr";
                System.out.println(" Suara Singa : " + suara);
         }
         @Override

         void setBerat(){
                double berat = 8.00;
                System.out.println(" Berat Singa : " + berat);
         }
        }
    }

}

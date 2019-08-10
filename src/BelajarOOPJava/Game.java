package BelajarOOPJava;

public class Game {

    public static void main(String[] args) {

        Player petani = new Player();

        petani.nama = "Petani Kode";
        petani.speed = 87;
        petani.hp = 100;

        petani.run();

        if(petani.isDead()){

            System.out.println(" Game Over! ");
        }
    }
}

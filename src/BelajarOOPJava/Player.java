package BelajarOOPJava;

public class Player {
     String nama;
     int speed;
     int hp;

 void run(){

     System.out.println(nama +" Is Running.. ");
     System.out.println(" Speed : " + speed);
 }

 boolean isDead(){

     if(hp <= 0 ) return true;

     return false;
 }

}

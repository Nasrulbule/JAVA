package comtutorial;

import java.util.Scanner;

public class ifelseif {

    public static void main(String[] args) {

        String nama;
        int nilai;
        String grade;
  Scanner scan = new Scanner(System.in);

  System.out.print(" Nama Siswa : ");
  nama = scan.nextLine();
  System.out.print(" Nilai Siswa : ");
  nilai = scan.nextInt();

  if(nilai >= 90 ){
      grade = "A";

  }else if(nilai >= 80 ){
      grade = "B+";

  }else if( nilai >= 70 ){
      grade = "B";

  }else if( nilai >= 60 ){
      grade = "C+";

  }else if( nilai >= 50 ){
      grade = "C";

  }else if( nilai >= 40 ){
      grade = "D";

  }else {
      grade = "E";
  }

        System.out.println(" Grade : " + grade);

    }
}

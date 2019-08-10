package BelajarOOPJava;

public class User {

    private String username;
    private String password;


public void setUsername(String username){
   this.username = username;
}

public void setPassword(String password){

    this.password = password;
}

public String getUsername(){

    return this.username;
}

public String getPassword(){

    return this.password;
}

    public static void main(String[] args) {

    User dian = new User();

    dian.username = "Nasrul";
    dian.password = "Sayang7";

    System.out.println(" Username : " + dian.getUsername());
    System.out.println(" Password : " + dian.getPassword());
    }
}

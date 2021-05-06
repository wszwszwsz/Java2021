package pl.pjatk.wojszy;

import java.sql.SQLOutput;

public class Pojo {
    String nazwa;


    public Pojo(String nazwa) {
        this.nazwa = nazwa;

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void printOutMe(){
        System.out.println("Value from Dojo is: "  + nazwa);
    }
}

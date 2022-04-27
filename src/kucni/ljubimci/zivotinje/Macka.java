package kucni.ljubimci.zivotinje;

public class Macka {

    String rasa, boja, vrsta, pedigre;

    public Macka(String rasa, String boja, String vrsta, String pedigre) {
        this.rasa = rasa;
        this.boja = boja;
        this.vrsta = vrsta;
        this.pedigre = pedigre;
    }
    
    public String returnString(){
         return this.rasa +" "+this.boja+" "+this.vrsta+" "+this.pedigre+"\n";
    }
}

package kucni.ljubimci.zivotinje;

public class Pas {

    String rasa, boja, vrsta, pedigre;

    public Pas(String rasa, String boja, String vrsta, String pedigre) {
        this.rasa = rasa;
        this.boja = boja;
        this.vrsta = vrsta;
        this.pedigre = pedigre;
    }
    
    public String returnString(){
         return this.rasa +" "+this.boja+" "+this.vrsta+" "+this.pedigre+"\n";
    }
}

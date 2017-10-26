package wexr;

import java.util.ArrayList; // for at kunne anvende ArrayList classen.

public class Studerende { // mit klasse navn.


    private String navn = "default";
    private int alder = -50;
    private String køn = "ikke angivet";
    private String adr = "ikke angivet";
    private int zip = 0000;
    private int semester = 0;
    private String skole = "ikke angivet";
    private int id = 0; // evt noget med i++

/*
Constructor(Studerende) for at kunne oprette de forskellige studerende.
Jeg opretter et par studerende udfra constructoreren.
Men har også tænkt mig at bruge scanner til input af information til nye studerende. såfremt info er blankt, skal den bruge default.
Jeg vil bruge en if statement senere til at spørger om der skal indtastes nye studerende, skal der det bruger den scanner til input.
Skal der ikke, viser den de studerende som jeg har oprettet selv.
*/

/*
ændring til der laves flere constructors.
En med default, en med direkte input samt en med scanner.
*/

/*Ændre igen min constructor med tilhørende setters/getters ved brug af this.xx = xx. Dette var en nødvendighed for at kunne anvende PrintWriter da den ikke kan skrive ud hvis metode er void.
* Void blev løst med at lave endnu en metode der henter data men hvori det bliver lavet som et array der trækker boolean true.*/


    //Default constructor der bruger de standard initialiseret variabler.
    public Studerende() {
    }

    //Samme constructor, men hvor den tager imod andet end default.
    /*
     */
    public Studerende(String navn, int alder, String køn, String adr, int zip, int semester, String skole, int id) { this.navn = navn;
        this.alder = alder;
        this.køn = køn;
        this.adr = adr;
        this.zip = zip;
        this.semester = semester;
        this.skole = skole;
    }

    // mine setters og getters for mine variabler. Disse skal laves da mine variabler er private. Og få at kunne bruge dem i andre klasser, er dette nødvendigt.
    //Ændring i en setter ændre variablen for det object der bruger den. Og Getter kan derefter hente den pågældende data for det object der er lavet.
    public void setNavn(String navn){
        this.navn = navn;
    }
    public String getNavn (){
        return navn;
    }

    public void setAlder(int alder){
        this.alder = alder;
    }
    public int getAlder (){
        return alder;
    }

    public void setKøn(String køn){
        this.køn = køn;
    }
    public String getKøn (){
        return køn;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }
    public String getAdr() {
        return adr;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    public int getZip() {
        return zip;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    public int getSemester() {
        return semester;
    }

    public void setSkole(String skole) {
        this.skole = skole;
    }
    public String getSkole() {
        return skole;
    }

    public void setId(int id) { // endte med ikke at bruge denne. Dette var den oprindelige måde jeg havde sat dem op på, men ændrede grundet ekstra klasse samt PrintWriter
        this.id = id;
    }
    public int getId() {
        return id;
    } // endte med ikke at bruge denne,

   // en simpel metode der udkriver diverse souts udfra de studerende jeg opretter i Datholdet. Dette gør det meget nemmere istedet for at skulle skrive dette for hver.
    public void hentData() {
        System.out.println("Navn: " + navn);
        System.out.println("Alder: " + alder);
        System.out.println("Køn: " + køn);
        System.out.println("Adresse: " + adr + ", " + zip);
        System.out.println("Semester: " + semester + ". semester på " + skole);
        /*System.out.print("\n");*/ // Overflødig.

    }

    // Denne Array er udelukket til PrintWriter grundet void, som skrevet øverst.
    public ArrayList<String> hentData(Boolean ReturnWanted) {
        ArrayList<String> temp = new ArrayList<String>();

        temp.add(("Navn: " + navn) + "\n");
        temp.add(("Alder: " + alder)+ "\n");
        temp.add(("Køn: " + køn)+ "\n");
        temp.add(("Adresse: " + adr + ", " + zip)+ "\n");
        temp.add(("Semester: " + semester + ". semester på " + skole)+ "\n" + "\n");
        return temp;
    }

    //Simpel metode til at hente navn på de studerende der oprettes i DatHoldet.
    public void hentNavn() {
        System.out.println("Navn: " + navn);

    }


}

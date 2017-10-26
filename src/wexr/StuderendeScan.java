package wexr;

import java.util.ArrayList; // for at kunne avende ArrayList klassen.
import java.util.Scanner; // for at kunne anvende Scanner klassen.

public class StuderendeScan { // mit klasse navn.

    Scanner input = new Scanner(System.in); // laver nyt object af klassen Scanner.

    private Studerende tempStuderende = new Studerende(); // Laver nyt object af min egen klasse studerende.

    // mine setters og getters for mine variabler der hentes fra klassen Studerende.. Disse skal laves da de er private.
    //Ændring i en setter ændre variablen for det object der bruger den. Og Getter kan derefter hente den pågældende data for det object der er lavet.
    public void setNavn(String navn){
        this.tempStuderende.setNavn(navn);
    }
    public String getNavn (){
        return tempStuderende.getNavn();
    }

    public void setAlder(int alder){
        tempStuderende.setAlder(alder);
    }
    public int getAlder (){
        return tempStuderende.getAlder();
    }

    public void setKøn(String køn){
        tempStuderende.setKøn(køn);
    }
    public String getKøn (){
        return tempStuderende.getKøn();
    }

    public void setAdr(String adr) {
        tempStuderende.setAdr(adr);
    }
    public String getAdr() {
        return tempStuderende.getAdr();
    }

    public void setZip(int zip) {
        tempStuderende.setZip(zip);
    }
    public int getZip() {
        return tempStuderende.getZip();
    }

    public void setSemester(int semester) {
        tempStuderende.setSemester(semester);
    }
    public int getSemester() {
        return tempStuderende.getSemester();
    }

    public void setSkole(String skole) {
        tempStuderende.setSkole(skole);
    }
    public String getSkole() {
        return tempStuderende.getSkole();
    }

    public void setId(int id) {
        tempStuderende.setId(id);
    }
    public int getId() {
        return tempStuderende.getId();
    }

    public void hentData() {
        tempStuderende.hentData();
    }

    // Denne Array er udelukket til PrintWriter grundet void, som skrevet øverst i studerende klasse.
    public ArrayList<String> hentData(Boolean ReturnWanted) {
        return tempStuderende.hentData(true);
    }

    public void hentNavn() {
        System.out.println("Navn: " + tempStuderende.getNavn());
    }

    // souts til input for min scanner. Disse gemmes i det object jeg har lavet ud fra klassen studerende.
    public void StuderendeScan() {
        System.out.print("\nIndtast -NAVN- for studerende: ");
        tempStuderende.setNavn(input.nextLine());
        System.out.print("Indtast -ALDER- for studerende: ");
        tempStuderende.setAlder(input.nextInt());
        input.nextLine();
        System.out.print("Indtast -KØN- for studerende: ");
        tempStuderende.setKøn(input.nextLine());
        System.out.print("Indtast -ADRESSE- for studerende: ");
        tempStuderende.setAdr(input.nextLine());
        System.out.print("Indtast -POST NR- for studerende: ");
        tempStuderende.setZip(input.nextInt());
        input.nextLine();
        System.out.print("Indtast -SEMESTER- for studerende: ");
        tempStuderende.setSemester(input.nextInt());
        input.nextLine();
        System.out.print("Indtast -SKOLE- for studerende: ");
        tempStuderende.setSkole(input.nextLine());
    }

    // for at hente hele mit object af klassen Studerende, hvori det information der indtastes i min scanne metode vises.
    public Studerende getTempStuderende(){
        return tempStuderende;
    }
}

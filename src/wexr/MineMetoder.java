package wexr;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MineMetoder {

    DatHoldet dat17 = new DatHoldet(); //Henter min DatHoldet class så den kan bruges i mine metoder.
    Scanner botInput = new Scanner(System.in); //Opretter en Scanner jeg skal bruge til input af ny studerende.
    StuderendeScan botScan = new StuderendeScan(); //henter min StuderendeScan class så jeg kan gøre brug af scanner.
    java.io.File file = new java.io.File("Udskrift/studerende.txt");


    /*Bot metode der tager imod input for at vise samt oprette forskellige information.*/
    public void bot() {


        String tekst = botInput.nextLine();

        while ((!tekst.toLowerCase().matches("5")) || (tekst.toLowerCase().matches("end"))) { // virker

            if ((tekst.toLowerCase().matches("menu")) || (tekst.toLowerCase().matches("1"))) { // virker

            /*While loop der giver bruger lov til at vælge mellem de forskellige menuer ved indtastning af tal/sætning
            * for at komme ind til en ny menu/metode der prompter bruger om at indtaste noget.
            * Når der tastes 5 lukker programmet helt ned og bruger får besked omkring dette.*/
                System.out.println("\n----MENU----");
                System.out.println("2. ---Opret ny studerende---");
                System.out.println("3. ---Vis alle studerende---");
                System.out.println("4. ---Andre metoder)---");
                System.out.println("5. ---end---");

                /* overflødig.
            System.out.println("* vis specefik studerende med en switch funktion");
            System.out.println("* Vis alt information om alle de studerende samtidig");
            System.out.println("* ekstra funktion? noget med forskellige metoder");
            System.out.println("* transport tid til skole, evt relevante links, lærere, ");
            */
            }

        /*En else if statement der henter min scan metode fra Class Studerende Scan
        */
            else if ((tekst.toLowerCase().matches("opret ny studerende")) || (tekst.toLowerCase().matches("2"))) { // virker
                botScan.StuderendeScan();
                System.out.println("\n1. ---menu---");
                System.out.println("3. ---Vis alle studerende---");
                System.out.println("4. ---Andre metoder---");
                System.out.println("5. ---end---");

            }
        /*Denne if statement viser navne på de 4 studerende jeg har oprettet ud fra construtor med input,
         den ene der er oprettet fra default, samt den der kan laves ud fra scanner input.
         Herefter køres en while statement hvor hver af de viste studerende er en ny menu, og ved at gå ind i den menu
         kan man få alt information omkring den enkelte.
         Ved hver studerende, vil der altid være vist menu for alle studerende samt menu for at gå tilbage.*/
            else if ((tekst.toLowerCase().matches("vis alle studerende")) || (tekst.toLowerCase().matches("3"))) {
                System.out.print("1. ");
                dat17.stu01.hentNavn();
                System.out.print("2. ");
                dat17.stu02.hentNavn();
                System.out.print("3. ");
                dat17.stu03.hentNavn();
                System.out.print("4. ");
                dat17.stu04.hentNavn();
                System.out.print("5. ");
                dat17.stu05.hentNavn();
                System.out.print("6. ");
                botScan.hentNavn();
                System.out.println("7. ---Vis studerende---");
                System.out.println("8. ---Gå tilbage---");

                System.out.print("\nIndtast her: ");
                tekst = botInput.nextLine();

            /*While loop der giver bruger lov til at vælge mellem de forskellige studerende ved indtastning af tal/sætning
            * uden at skulle gå ind i menuen igen fra start.
            * Når der tastes 8 går den ud af menu 3: vis alle studerende og tilbage til hovedmenu hvor der igen kan vælges*/
                while (!tekst.toLowerCase().matches("8")) {

                    if ((tekst.toLowerCase().matches("studerende")) || (tekst.toLowerCase().matches("7"))) { // virker

                        allStu();
                    } else if ((tekst.toLowerCase().matches("benjamin ejrup olsen")) || (tekst.toLowerCase().matches("1"))) { // virker
                        System.out.println("");
                        getStu1();
                        System.out.println("Lokation: " + skema);
                    } else if ((tekst.toLowerCase().matches("kristian kristensen")) || (tekst.toLowerCase().matches("2"))) { // virker
                        System.out.println("");
                        getStu2();
                        System.out.println("Lokation: " + skema);
                    } else if ((tekst.toLowerCase().matches("mathias bech")) || (tekst.toLowerCase().matches("3"))) { // virker
                        System.out.println("");
                        getStu3();
                        System.out.println("Lokation: " + skema);
                    } else if ((tekst.toLowerCase().matches("jakob svensson")) || (tekst.toLowerCase().matches("4"))) { // virker
                        System.out.println("");
                        getStu4();
                        System.out.println("Lokation: " + skema);
                    } else if ((tekst.toLowerCase().matches("default")) || (tekst.toLowerCase().matches("5"))) { // virker
                        System.out.println("");
                        getStu5();
                        System.out.println("Lokation: " + skema);
                    } else if ((tekst.toLowerCase().matches("ny oprettet")) || (tekst.toLowerCase().matches("6"))) { // virker
                        System.out.println("");
                        botScan.hentData();
                        System.out.println("Lokation: " + skema);
                    } else
                        System.out.println("Input til menu ikke genkendt.");

                    System.out.println("7. ---vis studerende---");
                    System.out.println("8. ---gå tilbage---");
                    System.out.print("\nIndtast her: ");
                    tekst = botInput.nextLine();

                }
                //Denne tekst kommer efter du går ud af menu 3. vis alle studerende.
                System.out.println("\n----MENU----");
                System.out.println("1. ---menu---");
                System.out.println("2. ---Opret ny studerende---");
                System.out.println("3. ---Vis alle studerende---");
                System.out.println("4. ---Andre metoder---");
                System.out.println("5. ---end---");

            } else if ((tekst.toLowerCase().matches("andre metoder")) || (tekst.toLowerCase().matches("4"))) { // virker
                while (!tekst.toLowerCase().matches("6")) { // ????

                /*overflødig.
                System.out.println("1. ---tekst til metoder---");
                System.out.println("2. ---tekst til metoder---");
                System.out.println("3. ---tekst til metoder---");
                System.out.println("4. ---vis metoder---");
                System.out.println("6. ---gå tilbage---");
                System.out.print("\nIndtast her: ");
                tekst = botInput.nextLine();*/

                    if ((tekst.toLowerCase().matches("udskriv alle studerende")) || (tekst.toLowerCase().matches("1"))) { // virker
                        getPrint();

                        System.out.println("\n2. ---vis tilfældigt bogstav---");
                        System.out.println("4. ---vis metoder---");
                        System.out.println("6. ---gå tilbage---");
                    } else if ((tekst.toLowerCase().matches("tilfældigt bogstav")) || (tekst.toLowerCase().matches("2"))) { // virker
                        System.out.print("\nTilfældigt stort bogstav: ");
                        // Laver et titilfældigt tal mellem 65 og 91.
                        int number = 65 + (int)(Math.random() * (91 - 65));

                        // Laver det tilfældige tal om til et bogstav.
                        System.out.println((char)(number));

                        System.out.println("\n2. ---vis tilfældigt bogstav---");
                        System.out.println("4. ---vis metoder---");
                        System.out.println("6. ---gå tilbage---");
                    } else if ((tekst.toLowerCase().matches("4. ---vis metoder---")) || (tekst.toLowerCase().matches("4"))) { // virker
                        System.out.println("1. ---Udskriv alle studerende---");
                        System.out.println("2. ---vis tilfældigt bogstav---");
                        System.out.println("6. ---gå tilbage---");
                    } else
                        System.out.println("Input til menu ikke genkendt.");

                    System.out.print("\nIndtast her: ");
                    tekst = botInput.nextLine();
                }

                // Denne tekst kommer efter man går ud af menu 4. ---andre metoder---
                System.out.println("\n----MENU----");
                System.out.println("1. ---menu---");
                System.out.println("2. ---Opret ny studerende---");
                System.out.println("3. ---Vis alle studerende---");
                System.out.println("4. ---Andre metoder---");
                System.out.println("5. ---end---");
            } else
                System.out.println("Input til menu ikke genkendt.");

            System.out.print("\nIndtast her: ");
            tekst = botInput.nextLine();


        }
        System.out.println("Programmet lukker ned.");


    }

    /*Metode for at vise alt information på alle de studerende.*/
    public void allStuFull() {
        // lav souts på alle studerende + den der oprettes fra scanner.
        // ALT information hentes fra denne. ALT!
        dat17.stu01.hentData();
        dat17.stu02.hentData();
        dat17.stu03.hentData();
        dat17.stu04.hentData();
        dat17.stu05.hentData();
        botScan.hentData();

    }

    public ArrayList<Studerende> allStuFull(Boolean ReturnWanted) {
        // lav souts på alle studerende + den der oprettes fra scanner.
        // ALT information hentes fra denne. ALT!
        ArrayList<Studerende> temp = new ArrayList<Studerende>();
        temp.add(dat17.stu01);
        temp.add(dat17.stu02);
        temp.add(dat17.stu03);
        temp.add(dat17.stu04);
        temp.add(dat17.stu05);
        temp.add(botScan.getTempStuderende());
        return temp;
    }

    public void allStu() {
        // lav souts på alle studerende + den der oprettes fra scanner.
        // kun fulde navne samt id, så de senere kan hentes singel med alt information.
        System.out.print("1. ");
        dat17.stu01.hentNavn();
        System.out.print("2. ");
        dat17.stu02.hentNavn();
        System.out.print("3. ");
        dat17.stu03.hentNavn();
        System.out.print("4. ");
        dat17.stu04.hentNavn();
        System.out.print("5. ");
        dat17.stu05.hentNavn();
        System.out.print("6. ");
        botScan.hentNavn();

    }

    public void getStu1() { // simpel metode til at hente alt store data på studerende 1. Dette gør jeg kan nøjes med at skrive 1 ord istedet for 3.
        dat17.stu01.hentData();

    }

    public void getStu2() { // simpel metode til at hente alt store data på studerende 2. Dette gør jeg kan nøjes med at skrive 1 ord istedet for 3.
        dat17.stu02.hentData();

    }

    public void getStu3() { // simpel metode til at hente alt store data på studerende 3. Dette gør jeg kan nøjes med at skrive 1 ord istedet for 3.
        dat17.stu03.hentData();
    }

    public void getStu4() {// simpel metode til at hente alt store data på studerende 4. Dette gør jeg kan nøjes med at skrive 1 ord istedet for 3.
        dat17.stu04.hentData();
    }

    public void getStu5() {// simpel metode til at hente alt store data på studerende 5. Dette gør jeg kan nøjes med at skrive 1 ord istedet for 3.
        dat17.stu05.hentData();
    }

    public void getStu6() { // simpel metode til at hente alt data for studerende der er oprettet via scanner funktion i "opret ny studerede"
        botScan.hentData();
    }

    /*Metode til at give studerende et tilfældigt fag hver gang programmet starter op. Faget til være det samme for
     *alle med den måde jeg har lavet det på.
     *Starter med at lave et Array hvor i de 4 fag, frokost, fri samt syg er stored.*/
    String fag[] = {"Undervisning i Programmering lokale 104.", "Undervisning i Systemudvikling lokale 305.", "Undervisning i DataBase lokale 305.", "Undervisning i Virksomheden lokale 308.", "Holder frokost.", "Er ikke fundet. Har fri.", "Er ikke fundet. Har meldt sig syg."};
    int random = (int) (Math.random() * 7);
    String skema = fag[random];


    //Metode til udskriver til txt fil af alle studerende og alt deres informtion
    public void getPrint() {

        if (file.exists()) { // tjekker om hvorvidt txt filen allerede er lavet.
            file.delete(); // Sletter txt fil såfremt den allerede er lavet, så en ny med frisk information kan printes.
            System.out.println("\nFil til udskrift eksistere allerede. Forbereder overskrivning......"); //Fortæller at txt allerede var lavet, men at den slettes så en ny kan laves.
        }

        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file); // laver en ny Writer ved navn output.

        ) {
            // Her bliver min Metode allStufull som indeholder alt information på alle studerende udskrevet til studerende.txt
            ArrayList<Studerende> temp = allStuFull(true);
            int i, k;
            for(i=0; i<temp.size(); i++){
                for (k=0; k<temp.get(i).hentData(true).size(); k++){
                    output.print(temp.get(i).hentData(true).get(k));
                }
            }
            //output.print(allStuFull()); /// Hvad gør jeg her???????????????????????

            System.out.println("Information nu udskrevet til studerende.txt. "); //fortæller hvis det lykkedes at udskriver til txt.
            output.close(); // For at sikre det åbne dokument er lukket igen. Således det ikke skaber problemer.

        }
        catch(FileNotFoundException ex){ // påtvunget for at køre Writer funktionen.
            System.out.println("Der opstod en fejl ved udskrift af studerende.");// fortæller i konsol såfremt der er fejl ved at udskriver til txt.

        }

    }

}



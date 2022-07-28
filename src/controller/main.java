package controller;

import model.*;

import java.util.Scanner;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("---- Hond aanmelden voor onze behandeling ----");

        System.out.println("Hoe heet je hond?");
        String naamHond = keyboard.nextLine();
        Hond hond = new Hond(naamHond);


        Behandeling gekozenbehandeling = null;
        int keuze = 4;
        while (keuze > 3 || keuze < 1) {
        System.out.println("Welke behandeling wil je door ons laten uitvoeren?");
        System.out.println("1. Uitlaten");
        System.out.println("2. Wassen");
        System.out.println("3. Borstelen");
        keuze = keyboard.nextInt();
            switch (keuze) {
                case 1:
                    gekozenbehandeling = new Uitlaten(hond);
                    break;
                case 2:
                    gekozenbehandeling = new Wassen(hond);
                    break;
                case 3:
                    gekozenbehandeling = new Borstelen(hond);
                    break;
                default:
                    System.out.println("ongeldige keuze, probeer het opnieuw: ");
            }
        }

        Werknemer werknemer = new Werknemer();
        werknemer.voegBehandelingToe(gekozenbehandeling);


        werknemer.voerAlleBehandelingenUit();



    }
}

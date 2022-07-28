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
        int keuze = 5;
        while (keuze > 4 || keuze < 1) {
            System.out.println("Welke behandeling wil je door ons laten uitvoeren?");
            System.out.println("1. Uitlaten");
            System.out.println("2. Wassen");
            System.out.println("3. Borstelen");
            System.out.println("4. Spelen");
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
                case 4:
                    gekozenbehandeling = new Spelen(hond);
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

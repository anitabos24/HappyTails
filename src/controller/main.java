package controller;

import model.*;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class main {
    public static void main(String[] args) {
        Hond hond = new Hond("Grietsje");

        Uitlaten uitlaten = new Uitlaten(hond);
        Borstelen borstelen = new Borstelen(hond);
        Wassen wassen = new Wassen(hond);
        

        Werknemer werknemer = new Werknemer();
        werknemer.voegBehandelingToe(borstelen);
        werknemer.voegBehandelingToe(uitlaten);
        werknemer.voegBehandelingToe(wassen);

        werknemer.voerAlleBehandelingenUit();
    }
}

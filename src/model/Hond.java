package model;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Hond {
    private String name;

    public Hond(String name) {
        this.name = name;
    }

    public void uitlaten() {
        printTekst("uitlaten");
    }

    public void borstelen() {
        printTekst("Borstelen");
    }
    public void voeren() {
        printTekst("Voeren");
    }
    public void wassen() {
        printTekst("wassen");
    }
    public void spelen() {
        printTekst("spelen");
    }

    private void printTekst(String naamBehandeling) {
        System.out.printf("Hond [ Naam: %s, Behandeling: %s] is uitgevoerd.\n", name, naamBehandeling);
    }
}

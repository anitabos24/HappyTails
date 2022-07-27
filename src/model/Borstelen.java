package model;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Borstelen implements Behandeling {
    private Hond hond;

    public Borstelen(Hond hond) {
        this.hond = hond;
    }

    @Override
    public void voerUit() {
        hond.borstelen();
    }
}

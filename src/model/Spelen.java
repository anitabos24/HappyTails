package model;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Spelen implements Behandeling {
    private Hond hond;

    public Spelen(Hond hond) {
        this.hond = hond;
    }

    @Override
    public void voerUit() {
        hond.spelen();
    }
}

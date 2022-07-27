package model;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Wassen implements Behandeling {
    private Hond hond;

    public Wassen(Hond hond) {
        this.hond = hond;
    }

    @Override
    public void voerUit() {
        hond.wassen();
    }
}

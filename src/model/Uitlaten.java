package model;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Uitlaten implements Behandeling {
    private Hond hond;

    public Uitlaten(Hond hond) {
        this.hond = hond;
    }

    @Override
    public void voerUit() {
        hond.uitlaten();
    }
}

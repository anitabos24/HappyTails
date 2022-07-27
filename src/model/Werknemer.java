package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Werknemer {
    private List<Behandeling> behandelingen = new ArrayList<>();

    public void voegBehandelingToe (Behandeling behandeling) {
        behandelingen.add(behandeling);
    }

    public void voerAlleBehandelingenUit(){
        for (Behandeling behandeling : behandelingen) {
            behandeling.voerUit();
        }
        behandelingen.clear();
    }
}

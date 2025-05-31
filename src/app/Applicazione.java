package app;

import app.comandi.LogComandi;
import app.stati.*;
import app.ui.BenvenutoFrame;

public class Applicazione {

    public static void main(String[] args) {
        GestoreStati stackStati = GestoreStati.getIstanza();
        LogComandi stackComandi = LogComandi.getIstanza();
        BenvenutoFrame benv = new BenvenutoFrame();
    }

}

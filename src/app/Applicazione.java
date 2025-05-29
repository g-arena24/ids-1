package app;

import app.comandi.LogComandi;
import app.stati.*;

public class Applicazione {

    public static void main(String[] args) {
        GestoreStati stackStati = GestoreStati.getIstanza();
        Stato iniziale = new Stato(false);
        stackStati.aggiungiStato(iniziale);
        Stato iniziale2 = new Stato(true);
        Stato iniziale3 = new Stato(false);
        stackStati.aggiungiStato(iniziale2);
        stackStati.aggiungiStato(iniziale3);
        stackStati.salvaPermanenti();
        LogComandi stackComandi = LogComandi.getIstanza();
    }

}

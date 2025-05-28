package app.stati;

import java.util.Stack;

public class GestoreStati {

    private static GestoreStati istanzaGS;
    private Stack<Stato> log;

    private GestoreStati() {
        this.log = new Stack<>();
    }

    public static synchronized GestoreStati getInstance() {
        if (istanzaGS == null) {
            istanzaGS = new GestoreStati();
        }
        return istanzaGS;
    }

    public void aggiungiStato(Stato s) {
        log.push(s);
    }

    public void salvaPermanenti() {
        log.peek().setTemporaneo(true);
        for (Stato st: log) {
            if (st.getTemporaneo())
                log.remove(st);
        }
    }

}

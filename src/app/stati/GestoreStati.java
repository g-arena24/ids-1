package app.stati;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class GestoreStati {

    private static GestoreStati istanzaGS;
    private Stack<Stato> log;

    private GestoreStati() {
        this.log = new Stack<>();
    }

    public static synchronized GestoreStati getIstanza() {
        if (istanzaGS == null) {
            istanzaGS = new GestoreStati();
        }
        return istanzaGS;
    }

    public synchronized void aggiungiStato(Stato s) {
        log.push(s);
    }

    public void ripristina(Stato s) {
        int numeroStato = 0;
        Iterator<Stato> it = log.iterator();
        while (it.hasNext()) {
            Stato stato = it.next();
            numeroStato++;
            if (stato.equals(s)) {
                s.setTemporaneo(false);
                break;
            }
        }
        ArrayList<Stato> copia = new ArrayList<>(log);
        for (int i = numeroStato + 1; i < copia.size(); i++)
            copia.remove(i);
    }

    public void salvaPermanenti() {
        log.peek().setTemporaneo(false);
        Iterator<Stato> it = log.iterator();
        while (it.hasNext()) {
            Stato next = it.next();
            if (next.getTemporaneo()) {
                File target = next.getRif();
                if (target.delete())
                    it.remove();
            }
        }
    }

}

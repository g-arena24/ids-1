package app.stati;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

    public void ripristina(Stato s) throws IOException {
        int numeroStato = 0, j = 0;
        Iterator<Stato> it = log.iterator(), it2 = log.iterator();
        while (it.hasNext()) {
            Stato stato = it.next();
            numeroStato++;
            if (stato.equals(s)) {
                s.setTemporaneo(false);
                break;
            }
        }
        while (it2.hasNext()) {
            Stato stato = it2.next();
            j++;
            if (numeroStato < j) {
                it.remove();
                Files.delete(Path.of(stato.getRif().getPath()));
            }
        }
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

    public Stato getUltimoStato() {
        return log.peek();
    }

}

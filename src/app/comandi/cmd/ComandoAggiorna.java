package app.comandi.cmd;

import app.comandi.ComandoAstratto;
import app.stati.GestoreStati;
import app.stati.Stato;

import java.io.*;

public class ComandoAggiorna extends ComandoAstratto {

    private String target;
    private String rimpiazzo;
    private int indiceToken;

    public void setTarget(String target) {
        this.target = target;
    }

    public ComandoAggiorna(String r, int i) {
        super();
        this.rimpiazzo = "";
        this.indiceToken = i;
        super.setComando("Aggiorna: modificato il libro " + target);
    }

    public void exec() {
        try {
            BufferedReader lettore = new BufferedReader(new FileReader("..\\libreria"));
            String riga;
            while ((riga = lettore.readLine()) != null) {
                String[] tokens = riga.split(",");
                if (tokens[0].equals(target))
                    riga.replace(tokens[indiceToken], rimpiazzo);
            }
            Stato s = new Stato(true);
            if (GestoreStati.getIstanza() != null)
                GestoreStati.getIstanza().aggiungiStato(s);
        } catch (IOException e) {
            System.out.println("Errore nell'esecuzione del comando");
        }
    }

    public void undo() {
        try {
            if (GestoreStati.getIstanza() != null) {
                Stato s = GestoreStati.getIstanza().getUltimoStato();
                GestoreStati.getIstanza().ripristina(s);
                GestoreStati.getIstanza().aggiungiStato(s);
            }
        } catch (IOException e) {
            System.out.println("Errore nell'esecuzione del comando");
        }
    }

}

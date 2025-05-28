package app.comandi.cmd;

import app.comandi.ComandoAstratto;

public class ComandoAggiorna extends ComandoAstratto {

    public String target;

    public ComandoAggiorna() {
        super();
        super.setComando("Aggiorna: modificato il libro con ISBN " + target);
    }

    public void exec() {

    }

    public void undo() {

    }

}

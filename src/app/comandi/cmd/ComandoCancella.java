package app.comandi.cmd;

import app.comandi.ComandoAstratto;

public class ComandoCancella extends ComandoAstratto {

    public String target;

    public ComandoCancella() {
        super();
        super.setComando("Cancella: eliminato il libro con ISBN " + target);
    }

    public void exec() {

    }

    public void undo() {

    }

}

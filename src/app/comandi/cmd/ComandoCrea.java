package app.comandi.cmd;

import app.comandi.ComandoAstratto;

public class ComandoCrea extends ComandoAstratto {

    public String target;

    public ComandoCrea() {
        super();
        super.setComando("Crea: aggiunto il libro con ISBN " + target);
    }

    public void exec() {

    }

    public void undo() {

    }

}

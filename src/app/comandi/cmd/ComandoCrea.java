package app.comandi.cmd;

import app.comandi.ComandoAstratto;

public class ComandoCrea extends ComandoAstratto {

    private String target;

    public void setTarget(String target) {
        this.target = target;
    }

    public ComandoCrea() {
        super();
        super.setComando("Crea: aggiunto il libro con ISBN " + target);
    }

    public void exec() {

    }

    public void undo() {

    }

}

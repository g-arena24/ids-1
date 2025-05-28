package app.comandi.cmd;

import app.comandi.ComandoAstratto;

public class ComandoCerca extends ComandoAstratto {

    private String param;

    public ComandoCerca() {
        super();
        super.setComando("Cerca: " + param);
    }

    public void exec() {

    }

}

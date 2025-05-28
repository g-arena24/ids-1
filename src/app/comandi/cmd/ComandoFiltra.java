package app.comandi.cmd;

import app.comandi.ComandoAstratto;

public class ComandoFiltra extends ComandoAstratto {

    private String param;

    public ComandoFiltra() {
        super();
        super.setComando("Filtra: " + param);
    }

    public void exec() {

    }

}

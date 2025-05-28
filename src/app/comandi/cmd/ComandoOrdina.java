package app.comandi.cmd;

import app.comandi.ComandoAstratto;

public class ComandoOrdina extends ComandoAstratto {

    private String param;

    public ComandoOrdina() {
        super();
        super.setComando("Ordina: " + param);
    }

    public void exec() {

    }

}

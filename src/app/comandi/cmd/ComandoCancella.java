package app.comandi.cmd;

import app.comandi.ComandoAstratto;
import app.stati.GestoreStati;
import app.stati.Stato;

import java.io.*;

public class ComandoCancella extends ComandoAstratto {

    private String target;

    public void setTarget(String target) {
        this.target = target;
    }

    public ComandoCancella() {
        super();
        super.setComando("Cancella: eliminato il libro con nome " + target);
    }

    public void exec() {
        
    }

    public void undo() {

    }

}

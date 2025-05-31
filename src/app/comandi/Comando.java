package app.comandi;

import java.io.FileNotFoundException;

public interface Comando {

    void exec() throws FileNotFoundException;

}

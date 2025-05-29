package app.utils;

import java.io.File;

public abstract class AccessoFileAstratto {

    protected final String percorso;

    protected AccessoFileAstratto(String p) {
        this.percorso = p ;
        nuovaDir(this.percorso);
    }

    public String getPercorso() {
        return percorso;
    }

    public String getPercorsoFile(String nome) {
        return percorso + File.separator + nome;
    }

    public void nuovaDir(String percorso) {
        File f = new File(percorso);
        if (!f.exists()) {
            f.mkdirs();
        }
    }
}

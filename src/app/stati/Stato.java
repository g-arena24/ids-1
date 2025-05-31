package app.stati;

import app.utils.AccessoFileLibri;
import app.utils.AccessoFileStati;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Stato {

    private static int num = 1;
    private boolean temporaneo;
    private File rif;

    public Stato(boolean b) {
        this.temporaneo = b;
        try {
            File f = new File(creaPercorso());
            this.rif = f;
            if (f.createNewFile()) {
                num++;
                FileWriter scrittore = new FileWriter(f.getPath());
                FileReader lettore = new FileReader(AccessoFileLibri.getIstanza().getPercorso());
                Scanner sc = new Scanner(lettore);
                while (sc.hasNextLine()) {
                    String linea = sc.nextLine();
                    scrittore.write(linea + System.lineSeparator());
                }
                scrittore.close();
                lettore.close();
                sc.close();
            }
        } catch (Exception e) {
            System.out.println("Si è verificata un'eccezione: "+e.getMessage());;
        }
    }

    public int getNum() {
        return num;
    }

    public File getRif() {
        return rif;
    }

    public boolean getTemporaneo() {
        return temporaneo;
    }

    public void setTemporaneo(boolean b) {
        this.temporaneo = b;
    }

    public boolean equals(Stato altro) {
        if (altro == null) return false;
        if (altro == this) return true;
        return this.getRif().getPath().equals(altro.getRif().getPath());
    }

    private String creaPercorso() {
        String p = AccessoFileStati.getIstanza().getPercorso();
        if (num < 10)
            return p + "\\stato0" + num;
        return p + "\\stato" + num;
    }
}

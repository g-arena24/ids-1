package app.stati;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Stato {

    private static final String PERCORSO =
"C:\\Users\\gabri\\IdeaProjects\\Progetto Ing. del Software\\" +
        "src\\app\\stati\\databaseStati";
    private static final String LIBRERIA =
"C:\\Users\\gabri\\IdeaProjects\\Progetto Ing. del Software\\" +
        "src\\app\\libreria";
    private static int num;
    private boolean temporaneo;

    public Stato() {
        this.temporaneo = false;
        try {
            File f = new File(creaPercorso());
            if (f.createNewFile()) {
                num++;
                FileWriter scrittore = new FileWriter(f.getPath());
                FileReader lettore = new FileReader(LIBRERIA);
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
            e.printStackTrace();
        }
    }

    public boolean getTemporaneo() {
        return temporaneo;
    }

    public void setTemporaneo(boolean b) {
        this.temporaneo = b;
    }

    private String creaPercorso() {
        return PERCORSO + "\\" + "statoNum" + num;
    }
}

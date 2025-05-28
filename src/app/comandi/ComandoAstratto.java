package app.comandi;

public abstract class ComandoAstratto implements Comando {

    private static int count = 1;
    private final int numeroIst;
    private String comando;

    public ComandoAstratto() {
        this.numeroIst = count;
        this.comando = null;
        count++;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String toString() {
        return numeroIst + " - " + comando;
    }

}

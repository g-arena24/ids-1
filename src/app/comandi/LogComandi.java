package app.comandi;

import java.util.Stack;

public class LogComandi {

    private static LogComandi istanzaLog;
    private Stack<Comando> log;

    private LogComandi() {
        this.log = new Stack<>();
    }

    public static synchronized LogComandi getInstance() {
        if (istanzaLog == null) {
            istanzaLog = new LogComandi();
        }
        return istanzaLog;
    }

    public void aggiungiComando(Comando comando) {
        log.push(comando);
    }

    public void textLog() {
        for (Comando comando : log)
            System.out.println(comando.toString());
    }

}

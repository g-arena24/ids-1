package app.elementi;

public class LibroFactory {

    public static Libro creaNuovoLibro(String titolo, String autore, String isbn,
                                       String genere, int valutazione, Libro.StatoLettura stato) {
        if (titolo == null || autore == null || genere == null)
            throw new IllegalArgumentException();
        // Valori di default per oggetti incompleti
        if (genere == null)
            genere = "";
        if (valutazione < 1 || valutazione > 5 )
            valutazione = 3;
        if (stato == null)
            stato = Libro.StatoLettura.DA_LEGGERE;
        return new Libro(titolo, autore, isbn, genere, valutazione, stato);
    }

}

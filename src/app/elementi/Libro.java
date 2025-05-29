package app.elementi;

public class Libro {

    public enum StatoLettura {LETTO, DA_LEGGERE, IN_LETTURA};

    private final String titolo;
    private final String autore;
    private final String isbn;
    private final String genere;
    private int valutazione;
    private StatoLettura stato;

    Libro(String titolo, String autore, String isbn, String genere, int valutazione,
          StatoLettura stato) {
        this.titolo = titolo;
        this.autore = autore;
        this.isbn = isbn;
        this.genere = genere;
        this.valutazione = valutazione;
        this.stato = stato;
    }

    public String getTitolo() {return titolo;}
    public String getAutore() {return autore;}
    public String getIsbn() {return isbn;}
    public String getGenere() {return genere;}
    public int getValutazione() {return valutazione;}
    public StatoLettura getStato() {return stato;}

    public void setValutazione(int valutazione) {
        if (valutazione >= 1 && valutazione <= 5)
            this.valutazione = valutazione;
        else throw new IllegalArgumentException("La valutazione deve essere compresa tra 1 e 5");

    }

    public void setStato(StatoLettura stato) {this.stato = stato;}

    @Override
    public String toString() {
        return titolo + " - " + autore + "; Codice ISBN: " + isbn + ". Genere: " +
                genere + ". " + stato + ".";
    }

    public String toCSV() {
        return titolo + ',' + autore + ',' + isbn + ',' + genere + ',' + valutazione
                + ',' + stato + System.lineSeparator();
    }

}

package esercizio3;

public class Articolo {
    private String codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int disponibilitaMagazzino;

    // MI CHIAMO IL COSTRUTTORE
    public Articolo(String codiceArticolo, String descrizione, double prezzo, int disponibilitaMagazzino) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.disponibilitaMagazzino = disponibilitaMagazzino;
    }

    // GET
    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getDisponibilitaMagazzino() {
        return disponibilitaMagazzino;
    }

    // DIMINUZIONE DELLA DISPONIBILITA'
    public void diminuisciDisponibilita(int quantita) {
        if (disponibilitaMagazzino >= quantita) {
            disponibilitaMagazzino -= quantita;
        } else {
            System.out.println("Quantità insufficente in magazzino.");
        }
    }

    // DETTAGLI PREZO, DISPO, CODICE ART, DESCRIZIONE.
    public void stampaDettagli() {
        System.out.println("Codice Articolo: " + codiceArticolo);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo + " EUR");
        System.out.println("Disponibilità: " + disponibilitaMagazzino);
    }
}
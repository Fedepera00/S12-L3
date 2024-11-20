package esercizio2;

public class Chiamata {
    private String numeroChiamato;
    private int durata;

    // MI CHIAMO UN COSTRUTTORE
    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    // DETTAGLI CALL
    public void stampaChiamata() {
        System.out.println("Numero chiamato: " + numeroChiamato + ", Durata: " + durata + " minuti");
    }
}